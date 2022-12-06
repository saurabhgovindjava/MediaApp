package com.sau.media.impl;

import com.sau.media.services.MediaService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MediaServiceimpl implements MediaService {



    private HashMap<String,List<String>> hm=new HashMap<>();

    @Override
    public List<String> createPlayList(List<String> songs, String playListName) {

        System.out.println("createPlayList IMPL file");
        if( !hm.containsKey("playListName")){
            hm.put(playListName,songs);
        }

        else{
              System.out.println("PlayList already exist with name:"+playListName);
        }
        return hm.get(playListName);

    }

    @Override
    public List<String> addSong() {
        return null;
    }

    @Override
    public List<String> getPlayListInfo(String playListName) {
        return null;
    }

    @Override
    public List<String> getAllSongs(String playListName) {
        return null;
    }

    @Override
    public List<String> deleteASongFromPLayList(String playListName, String songName) {
        return null;
    }

    @Override
    public List<String> deletePlayList(String playListName) {
        return null;
    }

    @Override
    public List<String> moveSongFromOnePlayListToOther(String fromPlayList, String toPLayList) {
        return null;
    }


}
