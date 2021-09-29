package com.example.album.Repository;

import com.example.album.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album,String> {
    List<Album> findAllByCreator(String createdBy);
}
