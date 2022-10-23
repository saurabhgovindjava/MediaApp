package com.sau.media.controllers;

import com.sau.media.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/media/v1/playlist")
@RestController
public class MediaController {

    @Autowired
   private MediaService mediaService;


    @PostMapping(value = "/createplaylist/{playlistName}")
    public List<String> createPlayList( @RequestBody List<String> songs, @PathVariable String playlistName){

        return mediaService.createPlayList(songs,playlistName);

    }



}
