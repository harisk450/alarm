package com.example.album.Resource;

import com.example.album.Service.PhotoService;
import com.example.album.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "id") String id){
        photoService.deletePhoto(id);
    }

    @GetMapping
    public List<Photo> getPhotoByCreator(@RequestParam(name = "createdBy") String createdBy){
        return photoService.getPhotoByCreator(createdBy);
    }
}
