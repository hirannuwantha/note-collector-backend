package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NOTE_DETAILS")
public class Note {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int id;
    private String description;
    private String dateTime;
    private String imageUrl;

}
