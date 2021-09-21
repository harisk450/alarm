package com.example.albumfull.Resource;

import com.example.albumfull.Service.AlbumService;
import com.example.albumfull.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }

    @GetMapping("/albums")
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return albumService.getAlbumById(albumId);
    }

    @PutMapping("/album/{albumId}")
    public Album UpdateAlbum(@PathVariable("albumId") int albumId,@RequestBody Album album){
        return albumService.updateAlbum(albumId,album);
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){
        AlbumService.saveAlbum(album);
        return album;
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
        return albumService.deleteAlbum(albumId);
    }

}
