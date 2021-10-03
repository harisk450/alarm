package com.example.album.repository;

import com.example.album.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AlbumRepository extends MongoRepository<Album, String> {


    List<Album> findAllByName(String name);
}
