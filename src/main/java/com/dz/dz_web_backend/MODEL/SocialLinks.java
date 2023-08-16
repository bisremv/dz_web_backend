package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Column;
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
@Table(name = "social_links")

public class SocialLinks {
    @Id
    int id;
    @Column(columnDefinition = "Text")
    String img;
    @Column(columnDefinition = "Text")
    String link;
}
