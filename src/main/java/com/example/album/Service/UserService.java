package com.example.album.Service;

import com.example.album.Repository.UserRepository;
import com.example.album.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public static User saveUser(User album) {
        return UserRepository.saveUser(album);
    }

    public User getUser(){
        return userRepository.getUser();
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int Id) {
        return userRepository.getUserbyId(Id);
    }

    public User updateUser(int Id, User album) {
        return userRepository.updateUser(Id,album);
    }

    public User deleteUser(int Id) {
        return userRepository.deleteUser(Id);
    }
}
