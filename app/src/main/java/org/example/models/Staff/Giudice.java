package org.example.models.Staff;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Giudice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Giudice() {

    }
}
