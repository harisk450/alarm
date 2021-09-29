package com.example.album.Resource;

import com.example.album.Service.UserService;
import com.example.album.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "id") String id){
        userService.deleteUser(id);
    }

    @GetMapping
    public List<User> getUserByName(@RequestParam(name = "name") String name){
        return userService.getUserByName(name);
    }
}
