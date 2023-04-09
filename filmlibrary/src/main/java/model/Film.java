package model;

import java.util.ArrayList;
import java.util.UUID;

public class Film {
    private String id = String.valueOf(UUID.randomUUID());
    private String title;
    private String director;
    private ArrayList<String> actors;
    private String releaseDate;
    private String description;
    private String genre;

    public Film(String title, String director, ArrayList<String> actors,
                String releaseDate, String description, String genre) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.description = description;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nDirector: " + director + "\nActors: " +
                actors + "\nRelease Date: " + releaseDate + "\nDescription: " + description +
                "\nGenre: " + genre;
    }

}
