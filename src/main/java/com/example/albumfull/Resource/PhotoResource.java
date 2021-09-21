package com.example.albumfull.Resource;


import com.example.albumfull.Service.PhotoService;
import com.example.albumfull.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class PhotoResource {
    @Autowired
    private PhotoService albumService;

    @GetMapping("/photo")
    public Photo getPhoto(){
        return albumService.getPhoto();
    }

    @GetMapping("/photos")
    public List<Photo> getAllAlbums(){
        return albumService.getAllPhotos();
    }

    @GetMapping("/photo/{Id}")
    public Photo getPhotoById(@PathVariable("Id") int Id){
        return albumService.getPhotoById(Id);
    }

    @PutMapping("/photo/{Id}")
    public Photo UpdatePhoto(@PathVariable("Id") int Id,@RequestBody Photo album){
        return albumService.updatePhoto(Id,album);
    }

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo album){
        albumService.savePhoto(album);
        return album;
    }

    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name = "Id") int Id){
        return albumService.deletePhoto(Id);
    }

}
