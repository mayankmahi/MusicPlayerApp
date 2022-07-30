package com.mahi;

public class Song {
    String title;
    double duration;

//   Constructor

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

//    Empty Constructor
    public Song(){

    }
// Getter
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

//    Return Properties of Classes

    @java.lang.Override
    public java.lang.String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
