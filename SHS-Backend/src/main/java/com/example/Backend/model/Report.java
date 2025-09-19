package com.example.Backend.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String patientName;
    private int age;
    private String gender;
    private String Location;
    private String symptoms;
    private String contactNumber;

}
