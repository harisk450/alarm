package com.example.album.Resource;

import com.example.album.Service.AlbumService;
import com.example.album.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        AlbumService.saveAlbum(album);
        return album;
    }

    @GetMapping
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }


    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId){
         albumService.deleteAlbum(albumId);
    }

    @GetMapping("/album/{albumId}")
    public List<Album> getAlbumByCreator(@RequestParam(name = "createdBy") String createdBy){
        return albumService.getAlbumById(createdBy);
    }

    /*
    @GetMapping("/album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }









     */

}
