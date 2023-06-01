package ru.netology.javaqa.MoviesManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void addingAListOfMovies() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");


        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addingOneMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void dontAddAnything() {
        MoviesManager manager = new MoviesManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}

