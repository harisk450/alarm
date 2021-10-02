package com.example.album.resource;


import com.example.album.model.Album;
import com.example.album.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }



    @GetMapping("/albums")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumName}")
    public List<Album> getAlbumByName(@RequestParam(name = "name") String name){
        return albumService.getAlbumByName(name);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping("/album")
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId){
        albumService.deleteAlbum(albumId);

    }

}

