package com.example.lab03.bidirectionalOneToOne;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(mappedBy = "student")
    private Major major;
}
