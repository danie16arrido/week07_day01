package com.codeclan.code.example.filmrating;

/**
 * Created by user on 22/05/2017.
 */

public class Film {
    private String name;
    private String genre;
    private int ranking;

    public Film(String filmName, String genre, int rating) {
        this.name = filmName;
        this.genre = genre;
        this.ranking = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRating() {
        return this.ranking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Title: " + this.name + ", Genre: " + this.genre + ", Ranking: " + this.ranking;
    }
}
