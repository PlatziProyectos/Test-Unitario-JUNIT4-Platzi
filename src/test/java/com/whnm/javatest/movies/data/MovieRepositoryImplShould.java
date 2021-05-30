package com.whnm.javatest.movies.data;

import com.whnm.javatest.movies.model.Genre;
import com.whnm.javatest.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MovieRepositoryImplShould {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    List<Movie> listMovie = Arrays.asList(
            new Movie(1,"Dark Knight",152, Genre.ACTION),
            new Movie(2,"Memento",113, Genre.THRILLER),
            new Movie(3,"Matrix",136, Genre.ACTION)
    );
    private MovieRepository movieRepository;

    @Before
    public void setUp() throws Exception {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));
        jdbcTemplate = new JdbcTemplate(dataSource);
        listMovie = Arrays.asList(
                new Movie(1,"Dark Knight",152, Genre.ACTION),
                new Movie(2,"Memento",113, Genre.THRILLER),
                new Movie(3,"Matrix",136, Genre.ACTION)
        );
        movieRepository = new MovieRepositoryImpl(jdbcTemplate);
    }

    @Test
    public void loadAllMovies() {
        Collection<Movie> movies = movieRepository.findAll();
        assertEquals(listMovie, movies);
    }

    @Test
    public void loadMovieById() {
        Movie movie = movieRepository.findById(2);
        assertEquals(new Movie(2,"Memento",113,Genre.THRILLER), movie);
    }

    @Test
    public void insertMovie() {
        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);
        movieRepository.saveOrUpdate(movie);
        Movie movieInsert = movieRepository.findById(4);
        assertEquals(new Movie(4,"Super 8", 112, Genre.THRILLER), movieInsert);
    }
}