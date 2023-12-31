package com.example.TechnoSignia.services;

import com.example.TechnoSignia.entity.User;
import com.example.TechnoSignia.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices implements UserServiceimp{
    @Autowired
    private userRepo userrepo;

    @Override
    public List<User> getUser() {
        return userrepo.findAll();
    }
    @Override
    public User saveUser(User user) {
        return userrepo.save(user);
    }
//    @Override
//    public String deleteUser(Long User) {
//        userrepo.deleteById(User);
//        return " User Sucesssufully deleted";
//    }

}
