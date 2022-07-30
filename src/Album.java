package com.mahi;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

//    Constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
//    Empty Constructor
    public Album (){

    }
//  findSong  Method
    public Song findSong(String title){
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
//            System.out.println(title + " Successfully added to the list");
            return true;
        }
        else {
//            System.out.println("Song with the name " + title + "already added in the list.");
            return false
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
//        System.out.println("This album doesn't have song with trackNumber " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song chekedSong : this.songs){
            if(chekedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
//            System.out.println(title + " there is no such song in album");
            return false;

        }
    }
}
