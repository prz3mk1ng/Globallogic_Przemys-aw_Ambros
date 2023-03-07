package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    List<String> users = new ArrayList<>();

    @GetMapping
    public List<String> getAll(){
        return users;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        users.add(user.getName());
    }

    @DeleteMapping
    public void deleteAll(@RequestBody User user){
        users.remove(user.getName());
    }
}
