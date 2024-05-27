package com.treinamentoifood.userdept.controller;

import com.treinamentoifood.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.treinamentoifood.userdept.entities.User;
import com.treinamentoifood.userdept.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    /*
    Metodo com 1 linha praticamente busca o user
     */
    @GetMapping
    public List<User> findAll() {
       List<User> result = repository.findAll();
       return result;
    }

    /*
    busca o id do user
     */

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }

    /*
    Metodo que faz o um insert (cadastro de usuario usando o post)
     */

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
