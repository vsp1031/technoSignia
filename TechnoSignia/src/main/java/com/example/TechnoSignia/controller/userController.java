package com.example.TechnoSignia.controller;

import com.example.TechnoSignia.entity.User;
import com.example.TechnoSignia.services.UserServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private UserServiceimp userserviceimp;

    @GetMapping("/user")
    public List<User>getUser(){
        return userserviceimp.getUser();
    }
    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userserviceimp.saveUser(user);
    }


//    @DeleteMapping("/user/{User}")
//    public String deleteUser(@PathVariable Long User){
//        userserviceimp.deleteUser(User);
//        return "Delete Sucessfully";
//    }
}
