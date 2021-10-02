package com.example.album.resource;


import com.example.album.model.Photo;
import com.example.album.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }



    @GetMapping("/photos")
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/photo/{createdBy}")
    public List<Photo> getPhotoByCreator(@RequestParam(name = "createdBy") String createdBy){
        return photoService.getUserByCreator(createdBy);
    }

    @PutMapping("/photo/{id}")
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping("/photo")
    public void deletePhoto(@RequestParam(name = "id") String id){
        photoService.deletePhoto(id);

    }
}
