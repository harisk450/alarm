package com.example.album.Service;

import com.example.album.Repository.AlbumRepository;
import com.example.album.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class AlbumService {

    @Autowired
    private static AlbumRepository albumRepository;

    public static Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album updateAlbum( Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }

    public List<Album> getAlbumByCreator(String createdBy) {
        return albumRepository.findAllByCreator(createdBy);
    }
    /*

    public Album getAlbum(){
        return albumRepository.getAlbum();
    }









     */
}
