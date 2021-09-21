package com.example.albumfull.Resource;


import com.example.albumfull.Service.UserService;
import com.example.albumfull.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService albumService;

    @GetMapping("/user")
    public User getAlbum(){
        return albumService.getUser() ;   }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return albumService.getAllUsers();
    }

    @GetMapping("/user/{Id}")
    public User getAlbumById(@PathVariable("Id") int Id){
        return albumService.getUserById(Id);
    }

    @PutMapping("/user/{Id}")
    public User UpdateAlbum(@PathVariable("Id") int Id,@RequestBody User album){
        return albumService.updateUser(Id,album);
    }

    @PostMapping("/user")
    public User saveAlbum(@RequestBody User album){
        albumService.saveUser(album);
        return album;
    }

    @DeleteMapping("/user")
    public User deleteAlbum(@RequestParam(name = "albumId") int Id){
        return albumService.deleteUser(Id);
    }

}
