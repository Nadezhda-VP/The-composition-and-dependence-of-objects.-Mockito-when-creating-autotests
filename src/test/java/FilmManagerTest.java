import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerTest {
    FilmManager manager = new FilmManager(5);
    FilmManager managerNoLimit = new FilmManager();

    @BeforeEach
    public void addMovies() {
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");

    }

    @Test
    public void showMovies() {//покажи фильмы

        String[] expected = {};
        String[] actual = managerNoLimit.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovieTest() {//Добавь фильмы

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovieTest1() {//Добавь фильмы
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovieTest2() {//Добавь фильмы

        managerNoLimit.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = managerNoLimit.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void showlatestMoviesTest() {//Покажи последние добавленные фильмы

        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void showlatestMoviesTest1() {//Покажи последние добавленные фильмы
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void showlatestMoviesTest2() {//Покажи последние добавленные фильмы
        managerNoLimit.add("Film 1");
        managerNoLimit.add("Film 2");
        managerNoLimit.add("Film 3");
        managerNoLimit.add("Film 4");
        managerNoLimit.add("Film 5");
        managerNoLimit.add("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = managerNoLimit.findLast();

        assertArrayEquals(expected, actual);

    }

}
