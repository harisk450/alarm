package com.example.albumfull.Service;

import com.example.albumfull.Repository.AlbumRepository;
import com.example.albumfull.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public static Album saveAlbum(Album album) {
        return AlbumRepository.saveAlbum(album);
    }

    public Album getAlbum(){
        return albumRepository.getAlbum();
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumbyId(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId,album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deleteAlbum(albumId);
    }
}
