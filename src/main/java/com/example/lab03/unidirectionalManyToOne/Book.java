package com.example.lab03.unidirectionalManyToOne;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}
