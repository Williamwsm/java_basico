package com.example.bookstoremanager.dto;

import com.example.bookstoremanager.entity.Author;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BookDTO {
   private Long id;
    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    private Integer pages;
    @NotNull
    private  Integer chapters;
    @NotBlank
    @Size(max = 100)
    @Pattern
    private String isbn;
    @NotBlank
    @Size(max = 200)
    private String publiherName;
    @NotNull
    @Valid
    private AuthorDTO author;


    public Long getId() {
        return id;
    }
}
