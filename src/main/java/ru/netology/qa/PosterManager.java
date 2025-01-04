package ru.netology.qa;

public class PosterManager {

    public int limit;

    public PosterManager(int limit) {

        this.limit = limit;
    }

    public PosterManager() {
        this.limit = 5;
    }


    private String[] movies = new String[0];

    public void addMovie(String movie) {

        String[] tmp = new String[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {

        int amountOfMovies;

        if (movies.length < limit) {
            amountOfMovies = movies.length;
        } else {
            amountOfMovies = limit;
        }


        String[] tmp = new String[amountOfMovies];
        for (int i = 0; i < tmp.length; i++) {

            tmp[i] = movies[tmp.length - 1 - i];
        }
        return tmp;

    }


}