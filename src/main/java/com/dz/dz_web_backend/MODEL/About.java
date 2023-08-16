package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    String img1;
    String img2;
    String description;
    String title;
    String subtitle;
    String img_subtitle;
    String img_title;
}
