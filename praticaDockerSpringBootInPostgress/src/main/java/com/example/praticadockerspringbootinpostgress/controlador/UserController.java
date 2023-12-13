package com.example.praticadockerspringbootinpostgress.controlador;

import com.example.praticadockerspringbootinpostgress.modelo.UserModel;
import com.example.praticadockerspringbootinpostgress.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public UserRepositorio userRepositorio;

    @GetMapping
    public List<UserModel> obtenerUsuarios(){
        return  userRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id){
        return userRepositorio.findById(id).orElse(null);
    }

    @PostMapping
    public UserModel crearUsuario(@RequestBody UserModel userModel){
        return userRepositorio.save(userModel);
    }
}
