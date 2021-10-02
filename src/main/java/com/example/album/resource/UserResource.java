package com.example.album.resource;


import com.example.album.model.User;
import com.example.album.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }



    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userName}")
    public List<User> getUserByName(@RequestParam(name = "name") String name){
        return userService.getUserByName(name);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam(name = "albumId") String id){
        userService.deleteUser(id);

    }
}
