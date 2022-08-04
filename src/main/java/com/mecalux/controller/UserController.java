package com.mecalux.controller;

import com.mecalux.model.Direccion;
import com.mecalux.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO: 4.	Propón los métodos necesarios (no hace falta implementar el cuerpo del método) con Spring MVC o Jersey para montar una API REST de la entidad
 * com.mecalux.model.User en la clase UserController.java
 */
@RestController
public abstract class UserController {

    // USER APIs
    @GetMapping("/users")
    public abstract ResponseEntity getUsers();

    @GetMapping("/user/{id}")
    public abstract ResponseEntity getUserById(@PathVariable String id);

    @PostMapping("/user")
    public abstract ResponseEntity addUser (@RequestBody User user);

    @DeleteMapping("/user/{id}")
    public abstract ResponseEntity deleteUser(@PathVariable String id);

    // NAME APIs
    @GetMapping("/userName/{id}")
    public abstract ResponseEntity getUserNameById(@PathVariable String id);

    @PatchMapping ("/userName/{id}")
    public abstract ResponseEntity updateUserName(@PathVariable String id,@RequestBody String name);

    // DIRECCIONS APIs
    @GetMapping("user/{id}")
    public abstract ResponseEntity getUserDireccions(@PathVariable String id);

    @PatchMapping("user/{id}")
    public abstract ResponseEntity updateUserDireccions(@PathVariable String id,@RequestBody List<Direccion> direccions);

}
