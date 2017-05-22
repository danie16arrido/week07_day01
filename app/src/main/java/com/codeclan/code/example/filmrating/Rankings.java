package com.codeclan.code.example.filmrating;

/**
 * Created by user on 22/05/2017.
 */

public class Rankings {

    private Film rankingList[];

    public Rankings(int rankingSize){
        setListTo(rankingSize);
    }

    private void setListTo(int number){
        this.rankingList = new Film[number];
    }

    public int mySize(){
        return this.rankingList.length;
    }

    public int numberOfFilms(){
        int count = 0;
        for (int i = 0; i < rankingList.length; i++){
            if( rankingList[i] != null){
                count++;
            }
        }
        return count;
    }


    public void addFilm(Film film) {
        rankingList[film.getRating() - 1] = film;
    }

    public void removeFilmbyRating(int rating) {
        rankingList[rating - 1] = null;
    }

    public Film getFilmByRanking(int i) {
        return rankingList[i - 1];
    }

    public Film findFilmByTitle(String filmNameToFind) {
        for (int i = 0; i < rankingList.length; i++){
            String name = rankingList[i].getName();
            if( name == filmNameToFind){
                return rankingList[i];
            }
        }
        return null;
    }


    public void moveFilmUp(Film film) {
        int ranking = film.getRating();
        film.setRanking(ranking + 1);
        addFilm(film);
        removeFilmbyRating(ranking);
    }

    public void moveFilmDown(Film film) {
        int ranking = film.getRating();
        film.setRanking(ranking - 1);
        addFilm(film);
        removeFilmbyRating(ranking);
    }

}
