package model;

import java.util.ArrayList;
import java.util.UUID;

public class FilmDirector {
    private ArrayList<Film> filmList;

    public FilmDirector() {
        filmList = new ArrayList<>();
    }

    public void addFilm(Film film) {
        filmList.add(film);
        System.out.println("Added film : " + film.getTitle());
    }

    public void removeFilm(String filmId) {
        for (Film film : filmList) {
            if (film.getId().equalsIgnoreCase(filmId)) {
                filmList.remove(film);
                System.out.println("Removed film : " + film.getTitle());
                return;
            }
        }
        System.out.println("Film not found: " + filmId);
    }

    public void searchFilm(String filmTitle) {
        boolean found = false;
        for (Film film : filmList) {
            if (film.getTitle().equalsIgnoreCase(filmTitle)) {
                System.out.println(film);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Film not found: " + filmTitle);
        }
    }


    @Override
    public String toString() {
        return "FilmDirector{" +
                "filmList=" + filmList +
                '}';
    }
}
