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
@Table(name = "company_info")
public class CompanyInfo {
    @Id
    int id;
    String street;
    String building;
    String city;
    String name;
    String logoimg;
}
