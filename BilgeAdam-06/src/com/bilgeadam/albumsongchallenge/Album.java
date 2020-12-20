package com.bilgeadam.albumsongchallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumname;
    private String artist;
    private List<Song> songs;

    public Album(String albumname, String artist) {
        this.albumname = albumname;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int tracknumber, LinkedList<Song> playlist){
        int index = tracknumber - 1;
        if((index >= 0) && (index <= songs.size())){
            System.out.println("Song is added to playlist : " + this.songs.get(index));
            playlist.add(this.songs.get(index));
            return true;
        } else {
            System.out.println("Your track number is exceeded the playlist");
            return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        if(findSong(title) != null){
            playlist.add(findSong(title));
            return true;
        }
        System.out.println(title + " is NOT exist in any album ");
        return false;
    }

}
