package me.dyatkokg.bookreaderreaderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BookReaderReaderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookReaderReaderApiApplication.class, args);
	}

}
