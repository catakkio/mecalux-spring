package com.mecalux.controller;

import com.mecalux.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * TODO: 4.	Propón los métodos necesarios (no hace falta implementar el cuerpo del método) con Spring MVC o Jersey para montar una API REST de la entidad
 * com.mecalux.model.User en la clase UserController.java
 */
@RestController
public class UserController {
    /**
     *
     * @param user the user to add to the DB
     * @return return a response entity with the user passed as input parameter and the response status
     */
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return user; //TODO implement body of the method
    }


//    @RequestMapping(value = "/user", method = RequestMethod.GET,params = "id")

    /**
     * Request example: localhost:8080/user/15
     * @param id the user id
     * @return the requested user
     */
    @GetMapping("/user/{id}")
    String getUserById(@PathVariable String id) {
        return "Retrieved user with id:"+id ; //TODO implement body of the method
    }


}
