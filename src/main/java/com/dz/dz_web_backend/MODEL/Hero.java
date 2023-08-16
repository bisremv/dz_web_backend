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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hero")
public class Hero {
    @Id
    int id;
    String titles;
    String subtitle;
    @Column(columnDefinition = "Text")
    String content;
    String img;
}
