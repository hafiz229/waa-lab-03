package com.example.lab03.bidirectionalOneToOne;

import jakarta.persistence.*;

@Entity
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
