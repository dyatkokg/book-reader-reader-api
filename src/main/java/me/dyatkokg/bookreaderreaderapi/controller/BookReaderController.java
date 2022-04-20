package me.dyatkokg.bookreaderreaderapi.controller;

import lombok.RequiredArgsConstructor;
import me.dyatkokg.bookreaderreaderapi.dto.ReadBookDTO;
import me.dyatkokg.bookreaderreaderapi.service.BookReaderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BookReaderController {

    private final BookReaderService service;

    @GetMapping("{id}")
    public ReadBookDTO readBook(@PathVariable("id") String id, @RequestParam("page") Integer page) {
        return service.readBooks(id, page);
    }
}
