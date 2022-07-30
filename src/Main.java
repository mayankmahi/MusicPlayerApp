package com.mahi;

import java.util.*;
public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String args[]){

        Album album = new Album("album1", "AC/DC");

        album.addSong( "TNT", 4.5);
        album.addSong( "Highway to hell", 3.2);
        album.addSong( "ThunderStroke", 2.4);
        albums.add(album);

        album = new Album("Album2", "Enimen");
        album.addSong("Rap God",  4.3);
        album.addSong("Not afraid", 4.0);
        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT", playList_1);
        albums.get(0).addToPlayList("Highway to hell", playList_1);
        albums.get(1).addToPlayList("Rap God", playList_1);

        play(playList_1);
    }

    private static void play(LinkeList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playlist.size() == 0){
            System.out.println("This playlist has no song.");
        } else {
            System.out.println("now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next.toString);
                    } else {
                        System.out.println("No song Available");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing " + listIterator.previous().toString);
                    } else {
                        System.out.println("We are at the first song");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");

                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached at the end of the song");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playlist.size > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                        }
                        else {
                            if(listIterator.hasPrevious())
                                System.out.println("Now Playing " + listIterator.previous().toString());
                        }
                    }

            }
        }
    }

    private static void printMenu(LinkedList<Song> playlist){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n" +
                "1: Play Next Song\n" +
                "2: Play Previous Song\n" +
                "3: Reply current song\n" +
                "4: List of all song\n" +
                "5: Print all the options\n" +
                "6: delete current songs\n");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("____________________");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_____________________");
    }
}
