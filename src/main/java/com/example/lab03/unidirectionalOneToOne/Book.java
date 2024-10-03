package com.example.lab03.unidirectionalOneToOne;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String isbn;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
