package com.example.bookstoremanager.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
     @Id
     @GeneratedValue( strategy =  GenerationType.IDENTITY)// vai ser gerado automaticamente
     private Long id;
     @Column(nullable = false, unique = true) // nunca pode ser nula  e o campo tem q ser unico
     private String name;
     @Column(nullable = false)
     private Integer age;
}
