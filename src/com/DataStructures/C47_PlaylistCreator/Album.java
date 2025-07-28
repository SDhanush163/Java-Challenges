package com.DataStructures.C47_PlaylistCreator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if (song == null) {
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        try {
            Song song = songs.get(trackNumber - 1);
            playlist.add(song);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song == null) return false;
        playlist.add(song);
        return true;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title))
                return song;
        }
        return null;
    }


}
