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
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    // this is the file name directly from teh source and used as the last part of
    // directory path and to check if other instance are there
    private String name;
    private String type;
    // this in usage count keep track of how many object use this object
    private int usage_count;
    @Column(columnDefinition = "Text")
    private String imagePath; // Store the image path or filename as a string

    public Image findByName(String originalFilename) {
        return null;
    }

}
