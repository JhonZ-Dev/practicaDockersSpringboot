package com.example.praticadockerspringbootinpostgress.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_users")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

}
