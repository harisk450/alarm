package com.example.albumfull.Repository;

import com.example.albumfull.model.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumRepository {
    public Album getAlbum(){

        Album album = new Album(123,"Magix","https://images.app.goo.gl/XoyGQYLY3Zheh8hZ6","Haris","12 april 2021");
        return album;
    }

    static List<Album> albumList = new ArrayList();
    public static Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumbyId(int albumId) {
        for (Album album:albumList){
            if (album.getAlbumId()==albumId){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for (Album a: albumList){
            if(a.getAlbumId()==albumId){
                a.setName(a.getName());
                a.setCreatedBy(a.getCreatedBy());
                a.setCoverPicUrl(a.getCoverPicUrl());
                a.setDateCreated(a.getDateCreated());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for (Album a: albumList){
            if(a.getAlbumId()==albumId){
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return null;
    }
}
