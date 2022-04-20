package me.dyatkokg.bookreaderreaderapi.service;

import lombok.RequiredArgsConstructor;
import me.dyatkokg.bookreaderreaderapi.client.BookReaderClient;
import me.dyatkokg.bookreaderreaderapi.dto.ReadBookDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookReaderService {

    private final BookReaderClient client;

    public ReadBookDTO readBooks(String id, Integer page) {
        return client.readBook(id, page);
    }
}
