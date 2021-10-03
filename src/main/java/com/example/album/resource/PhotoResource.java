package com.example.album.resource;

import com.example.album.model.Photo;
import com.example.album.model.User;
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

    @GetMapping
    public List<Photo> getPhotoByCreator(@RequestParam(name = "craetedBy") String  createdBy){
        return photoService.getPhotoByCreator(createdBy);
    }

    @PutMapping("/photo/{photoId}")
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping("/photo")
    public void deletePhoto(@RequestParam(name = "Id") String id){
        photoService.deletePhoto(id);
    }
}
