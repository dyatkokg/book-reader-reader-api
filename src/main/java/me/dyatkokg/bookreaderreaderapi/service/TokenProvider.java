package me.dyatkokg.bookreaderreaderapi.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TokenProvider {

    @Value("${token.signature}")
    private String signature;

    public void validateToken(String token) {
        DecodedJWT verified = JWT.require(Algorithm.HMAC256(signature))
                .withIssuer("book-app").build().verify(token);
    }
}
