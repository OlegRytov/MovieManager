package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void shouldAddNewMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void NoMovies() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAllMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");

        String[] expected = {"Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAllNewMovie() {
        MovieManager manager = new MovieManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAllMovies() {
        MovieManager manager = new MovieManager(6);

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}