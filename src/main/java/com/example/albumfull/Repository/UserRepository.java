package com.example.albumfull.Repository;

import com.example.albumfull.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public User getUser(){
        User user = new User(123,"Haris","harisk45@gmail.com","https://images.app.goo.gl/XVLk91mPgUJG9FY96");
        return user;
    }

    static List<User> userList = new ArrayList();
    public static User saveUser(User user) {
        user.setId(userList.size() + 1);
        userList.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUserbyId(int Id) {
        for (User user:userList){
            if (user.getId()==Id){
                return user;
            }
        }
        return null;
    }

    public User updateUser(int Id,User user) {
        for (User a: userList){
            if(a.getId()==Id){
                a.setName(a.getName());
                a.setEmail(a.getEmail());
                a.setProfilePhotoUrl(a.getProfilePhotoUrl());
                return a;
            }
        }
        return null;
    }

    public User deleteUser(int Id) {
        User deletedUser = null;
        for (User u: userList){
            if(u.getId()==Id){
                deletedUser = u;
                userList.remove(u);
                return deletedUser;
            }
        }
        return null;
    }
}
