package com.example.praticadockerspringbootinpostgress.repositorio;

import com.example.praticadockerspringbootinpostgress.modelo.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorio extends JpaRepository<UserModel, Long> {

    
}
