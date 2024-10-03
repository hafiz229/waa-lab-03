package com.example.lab03.bidirectionalManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
