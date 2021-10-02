package com.example.album.repository;

import com.example.album.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {


    List<Album> findAllByName(String name);
}
