package com.example.lab03.unidirectionalOneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Reservation> reservations;
}
