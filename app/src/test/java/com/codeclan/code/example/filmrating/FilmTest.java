package com.codeclan.code.example.filmrating;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */
public class FilmTest {
    Film film;

    @Before
    public void before(){
        Film film = new Film("Titanic", "Rubish", 5);
    }

    @Test
    public void canGetName(){
        Film film = new Film("Titanic", "Rubish", 5);
        assertEquals("Titanic", film.getName());
    }

    @Test
    public void canGetNameNotHardCoded(){
        Film film = new Film("Titanic", "Rubish", 5);
        assertEquals("Titanic", film.getName());
    }

    @Test
    public void canGetGenre(){
        Film film = new Film("Titanic", "Rubish", 5);
        assertEquals("Rubish", film.getGenre());
    }

    @Test
    public void canGetRanking(){
        Film film = new Film("Titanic", "Rubish", 5);
        assertEquals(5, film.getRating());

    }

    @Test
    public void canSetName(){
        Film film = new Film("Titanic", "Rubish", 5);
        film.setName("300");
        assertEquals("300", film.getName());
    }

    @Test
    public void canSetGenre(){
        Film film = new Film("Titanic", "Rubish", 5);
        film.setGenre("Action");
        assertEquals("Action", film.getGenre());
    }

    @Test
    public void canSetRanking(){
        Film film = new Film("Titanic", "Rubish", 5);
        film.setRanking(1);
        assertEquals(1, film.getRating());
    }

    @Test
    public void canOverrideString(){
        Film film = new Film("Lord of the Rings", "Adventure", 1);
        String expected =  "Title: 'Lord of the Rings', Genre: 'Adventure', Ranking: 1";
        assertEquals(expected, film.toString());
    }


}