package com.dz.dz_web_backend.MODEL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactmessage")
public class ContactMessage {
    @Id
    int id;
    String name;
    String email;
    @Column(columnDefinition = "TEXT")
    String message;
}
