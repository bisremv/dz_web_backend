package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
// Lombok annotation for generating getters, setters, equals, hashCode, and
// toString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "model")
public class YourModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @Column(columnDefinition = "Text")
    private String imagePath; // Store the image path or filename as a string
}