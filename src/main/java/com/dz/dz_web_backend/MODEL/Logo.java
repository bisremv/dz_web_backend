package com.dz.dz_web_backend.MODEL;

import org.yaml.snakeyaml.events.Event.ID;

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
@Table(name = "logos")
public class Logo {
    @Id
    int id;

    @Column(columnDefinition = "Text")
    String imgpath;

}
