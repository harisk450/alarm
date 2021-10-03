package com.example.album.repository;

import com.example.album.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserRepository extends MongoRepository<User,String> {

    List<User> findAllByName(String name);
}
