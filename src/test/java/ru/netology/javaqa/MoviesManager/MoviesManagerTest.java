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
    @Test
    public void reverseListOf7Movies() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film 7");
        manager.add("Film 6");
        manager.add("Film 5");
        manager.add("Film 4");
        manager.add("Film 3");
        manager.add("Film 2");
        manager.add("Film 1");

        String[] expected = {"Film 7","Film 6","Film 5","Film 4","Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void reverseListOf8Movies() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film 8");
        manager.add("Film 7");
        manager.add("Film 6");
        manager.add("Film 5");
        manager.add("Film 4");
        manager.add("Film 3");
        manager.add("Film 2");
        manager.add("Film 1");

        String[] expected = {"Film 8","Film 7","Film 6","Film 5","Film 4","Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void reverseListOf3Movies() {
        MoviesManager manager = new MoviesManager();

        manager.add("Film 3");
        manager.add("Film 2");
        manager.add("Film 1");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void reverseListOf0Movies() {
        MoviesManager manager = new MoviesManager();



        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}


