package com.codeclan.code.example.filmrating;

import android.service.notification.NotificationListenerService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class RankingsTest {
    Film film1;
    Film film2;
    Film film3;
    Film film4;
    Film film5;
    Rankings ranking;

    @Before
    public void before(){
        film1 = new Film("The Last Airbender","Fantasy", 9);
        film2 = new Film("Jack and Jill","Fantasy", 10);
        film3 = new Film("That's My Boy","Fantasy", 7);
        film4 = new Film("Run for Your Wife","Fantasy", 3);
        film5 = new Film("Movie 43","Fantasy", 4);
        ranking =  new Rankings(10);
        ranking.addFilm(film1);
        ranking.addFilm(film2);
        ranking.addFilm(film3);
        ranking.addFilm(film4);
        ranking.addFilm(film5);
    }

    @Test
    public void canStoreMovies(){
        Rankings ranking = new Rankings(1);
        assertEquals(true, ranking instanceof Rankings);
    }


    @Test
    public void canStoreTenFilms(){
        Rankings ranking =  new Rankings(10);
        assertEquals(10, ranking.mySize());
    }

    @Test
    public void canAddfilm(){
        Film film = new Film("t","a",1);
        Rankings ranking = new Rankings(10);
        ranking.addFilm(film);
        assertEquals(1, ranking.numberOfFilms());
    }

    @Test
    public void canGetFilmFromIndex(){
        Film film = new Film("the end","a",1);
        Rankings ranking = new Rankings(10);
        ranking.addFilm(film);
        Film newFilm = ranking.getFilmByRanking(1);
        assertEquals("the end", newFilm.getName());
    }

    @Test
    public void canFindFilmByTitle(){
        Film foundFilm = ranking.findFilmByTitle("The Last Airbender");
        assertEquals("The Last Airbender", foundFilm.getName());
    }

    @Test
    public void canMoveFilmUp(){
        String name = film5.getName();
        ranking.moveFilmUp(film5);
        Film up = ranking.getFilmByRanking(5);
        assertNull(ranking.getFilmByRanking(4));
        assertEquals(5, up.getRating());
    }

    @Test
    public void canMoveFilmDown(){
        String name = film5.getName();
        ranking.moveFilmDown(film5);
        Film down = ranking.getFilmByRanking(3);
        assertNull(ranking.getFilmByRanking(4));
        assertEquals(3, down.getRating());
    }

}