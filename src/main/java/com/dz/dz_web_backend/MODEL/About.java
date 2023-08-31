package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "about")
public class About {
    @Id
    int id;

    @Column(columnDefinition = "TEXT")
    String img1;

    @Column(columnDefinition = "TEXT")
    String img2;
    @Column(columnDefinition = "TEXT")
    String description;
    String title;
    String subtitle;
}
