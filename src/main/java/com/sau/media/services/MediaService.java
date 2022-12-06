package com.sau.media.services;

import org.springframework.stereotype.Service;

import java.util.List;


public interface MediaService {

    public List<String> createPlayList( List<String> songs,String playListName);

    public List<String> addSong();

    public List<String> getPlayListInfo(String playListName);

    public List<String> getAllSongs(String playListName);

    public List<String> deleteASongFromPLayList(String playListName,String songName);

    public  List<String> deletePlayList(String playListName);

    public List<String> moveSongFromOnePlayListToOther( String fromPlayList, String toPLayList);



}
