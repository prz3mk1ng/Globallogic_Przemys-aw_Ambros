package com.example.student;

import com.example.address.Address;
import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "STUDENTS")
@Getter
public class Student
{

    @Id
    @GeneratedValue
    private Long index;

    private String imie;
    private String nazwisko;

    @ManyToOne()
    @JoinColumn(name = "adres", referencedColumnName = "id", nullable = false)
    private Address address;

}
