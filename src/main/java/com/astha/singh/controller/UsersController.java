package com.astha.singh.controller;

import com.astha.singh.model.Users;
import com.astha.singh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/getAllUsers")
    public List<Users> getAllUsers()
    {
        return  service.getAllUsers();
    }
    @PostMapping("/createUsers")
    public Users createUsers(@RequestBody Users users)
    {
        return  service.createUsers(users);
    }
    @PutMapping("/updateUsers")
    public Users updateUsers(@RequestBody Users users)
    {
        return  service.updateUsers(users);
    }
    @DeleteMapping("/deleteUsers")
    public void deleteUsers(@RequestParam Integer id)
    {
        service.delteUsers(id);
    }
}
