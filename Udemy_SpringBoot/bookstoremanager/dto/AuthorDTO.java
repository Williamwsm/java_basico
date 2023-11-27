package com.example.bookstoremanager.dto;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
     private Long id;
     @NotBlank
     @Size(max = 200)
     private String name;
     @NotNull
     @Size(max = 200)
     private Integer age;
}
