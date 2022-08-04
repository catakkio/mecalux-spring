package com.mecalux.controller;

import com.mecalux.model.Direccion;
import com.mecalux.model.User;
import javassist.tools.web.BadHttpRequest;
import org.springframework.http.HttpStatus;
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

    /**
     * @param id of the user
     * @return the requested user
     */
    @GetMapping("/user/{id}")
    ResponseEntity getUserById(@PathVariable String id) throws BadHttpRequest{
        //TODO: implement the logic to retrieve the user
        return new ResponseEntity("Retrieved user with id:"+id,HttpStatus.OK) ;
    }

    /**
     *
     * @param user to add to the DB
     * @return  the user that has been added to the DB into a ResponseEntity obj
     */
    @PostMapping("/user")
    public ResponseEntity addUser (@RequestBody User user) {
        //TODO: implement the logic to add the user to the DB
        return new ResponseEntity(user, HttpStatus.OK);
    }

    /**
     *
     * @param id of the user to remove from the DB
     * @return a confirmation message
     */
    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteUser(@PathVariable String id){
        //TODO: implement logic to remove the user from the DB
        return new ResponseEntity("Deleted user with id:"+id,HttpStatus.OK) ;
    }

    // Depending on the scope of the application also an endpoint to retrieve all the user could be implemented


    // NAME APIs

    /**
     *
     * @param id of the user whose name is to be retrieved
     * @return the user's name
     */
    @GetMapping("/userName/{id}")
    ResponseEntity getUserNameById(@PathVariable String id) {
        String name = "test";  //TODO: implement the logic to retrieve the user name
        return new ResponseEntity(name,HttpStatus.OK) ;
    }

    /**
     *
     * @param id of the user whose name is to be changed
     * @param name to set for the user
     * @return the new user's name
     */
    @PatchMapping ("/userName/{id}")
    public ResponseEntity updateUserName(@PathVariable String id,@RequestBody String name)  {
        //TODO: implement logic to update the user name
        return new ResponseEntity("New user name:"+name,HttpStatus.OK) ;
    }

    // DIRECCIONS APIs

    @GetMapping("user/{id}")
    public abstract ResponseEntity getUserDireccions(@PathVariable String id);

    /**˙
     *
     * @param id of the user to update
     * @param direccions direccions to store in the user entity
     * @return a confirmation message
     */
    @PatchMapping("user/{id}")
    public ResponseEntity updateUserDireccions(@PathVariable String id,@RequestBody List<Direccion> direccions) {
        //TODO: implement logic to update the user direccions
        return new ResponseEntity("Updated direccions of user with id:"+id,HttpStatus.OK) ;
    }

}
