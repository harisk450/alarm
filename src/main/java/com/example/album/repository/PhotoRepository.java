package com.example.album.repository;

import com.example.album.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo,String> {
    List<Photo> findAllByCreatedBy(String createdBy);
}
