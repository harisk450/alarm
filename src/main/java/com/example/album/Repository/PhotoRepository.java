package com.example.album.Repository;

import com.example.album.model.Photo;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

import static com.example.album.Repository.UserRepository.userList;
@Repository
public class PhotoRepository {
    public static Photo getPhoto(){
        Photo photo = new Photo(123,1234,"https://images.app.goo.gl/XVLk91mPgUJG9FY96","Haris ","12,April,2021");
        return photo;
    }

    static List<Photo> photoList = new ArrayList();
    public static Photo savePhoto(Photo photo) {
        photo.setId(photoList.size() + 1);
        photoList.add(photo);
        return photo;
    }

    public List<Photo> getAllPhotos() {
        return photoList;
    }

    public Photo getPhotobyId(int Id) {
        for (Photo user:photoList){
            if (user.getId()==Id){
                return user;
            }
        }
        return null;
    }

    public Photo updatePhoto(int Id,Photo user) {
        for (Photo a: photoList){
            if(a.getId()==Id){
                a.setAlbumId(a.getAlbumId());
                a.setCreatedBy(a.getCreatedBy());
                a.setDateCreated(a.getDateCreated());
                a.setPhotoUrl(a.getPhotoUrl());
                return a;
            }
        }
        return null;
    }

    public Photo deletePhoto(int Id) {
        Photo deletedUser = null;
        for (Photo u: photoList){
            if(u.getId()==Id){
                deletedUser = u;
                userList.remove(u);
                return deletedUser;
            }
        }
        return null;
    }
}
