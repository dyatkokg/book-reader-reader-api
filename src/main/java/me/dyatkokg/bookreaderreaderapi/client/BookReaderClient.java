package me.dyatkokg.bookreaderreaderapi.client;

import me.dyatkokg.bookreaderreaderapi.dto.ReadBookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "${api.external.book-reader-books-api.name}",
        url = "${api.external.book-reader-books-api.url}"
)
public interface BookReaderClient {

    @GetMapping("{id}")
    ReadBookDTO readBook(@PathVariable("id") String id, @RequestParam("page") Integer page);
}
