package com.example.albumfull.Service;

import com.example.albumfull.Repository.PhotoRepository;

import com.example.albumfull.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhotoService {
    @Autowired
    private static PhotoRepository photoRepository;

    public static Photo savePhoto(Photo album) {
        return photoRepository.savePhoto(album);
    }

    public Photo getPhoto(){
        return photoRepository.getPhoto();
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.getAllPhotos();
    }

    public Photo getPhotoById(int Id) {
        return photoRepository.getPhotobyId(Id);
    }

    public Photo updatePhoto(int Id, Photo album) {
        return photoRepository.updatePhoto(Id,album);
    }

    public Photo deletePhoto(int Id) {
        return photoRepository.deletePhoto(Id);
    }
}
