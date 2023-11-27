package com.example.bookstoremanager.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private Integer pages;
    @Column(nullable = false)
    private  Integer chapters;
    @Column(nullable = false)
    private String isbn;
    @Column(name =  "publisher_name", nullable = false,unique = true)
    private String publiherName;
@ManyToOne(fetch = FetchType.LAZY, cascade ={ CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // relacionamentos // precisa fazer um join pora retornar o dado
//insersao, atualizacao e remocao,  automaticamente o autor tambem sera ´´´´
@JoinColumn(name = "author_id")// chave estrangeira
    private Author author;


    public Long getId() {
        return id;
    }
}
