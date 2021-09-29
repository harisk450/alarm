package com.example.album.Service;

import com.example.album.Repository.PhotoRepository;
import com.example.album.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll();
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }


    public void deletePhoto(String id) {
        photoRepository.deleteById(id);
    }

    public List<Photo> getPhotoByCreator(String createdBy) {
        return photoRepository.findByCreator(createdBy);
    }
}
