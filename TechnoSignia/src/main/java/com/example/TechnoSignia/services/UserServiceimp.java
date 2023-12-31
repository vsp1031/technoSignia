package com.example.TechnoSignia.services;

import com.example.TechnoSignia.entity.User;

import java.util.List;

public interface UserServiceimp {

    public List<User> getUser();
    public User saveUser(User user);
//    public String deleteUser(Long User);
}
