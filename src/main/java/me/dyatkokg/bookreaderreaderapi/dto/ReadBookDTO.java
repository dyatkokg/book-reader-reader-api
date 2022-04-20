package me.dyatkokg.bookreaderreaderapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadBookDTO {

    private Integer num;

    private List<String> lines;

    private Integer totalPages;

}
