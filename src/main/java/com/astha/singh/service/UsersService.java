package com.astha.singh.service;

import com.astha.singh.model.Users;
import com.astha.singh.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersRepository repo;

    //READ
    public Users getUsersById(int id)
    {
        return repo.getReferenceById(id);
    }
    //READ ALL
    public List<Users> getAllUsers()
    {
        return  repo.findAll();
    }
    //CREATE
    public Users createUsers(Users users)
    {
        return  repo.save(users);
    }
    //UPDATE
    public Users updateUsers(Users users)
    {
       repo.save(users);
       return  users;
    }
    //DELETE
    public void delteUsers(int id)
    {
        repo.deleteById(id);
    }
}
