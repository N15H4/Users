package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/Apis")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/alluser")
public List<User> findall(){
        return  service.finduser();
    }

    @GetMapping(value=("alluser/{id}"))
    public User userID(@PathVariable String id){

        return service.userid(id);
    }
    @GetMapping("deluser/{name}")
    public String deleteuser(@PathVariable String name){

        return service.deleteUser(name);

    }
    @PostMapping("adduser")
    public void adduser(@RequestBody User usr){

        service.addUser(usr);

    }


}