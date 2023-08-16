package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
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
