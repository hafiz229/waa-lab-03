package com.example.lab03.bidirectionalOneToMany;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String position;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
