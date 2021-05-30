package com.whnm.javatest.movies.data;


import com.whnm.javatest.movies.model.Genre;
import com.whnm.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryImpl implements MovieRepository {

    private JdbcTemplate jdbcTemplate;
    RowMapper<Movie> movieMapper = new RowMapper<Movie>() {
        @Override
        public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Movie(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("minutes"),
                    Genre.valueOf(resultSet.getString("genre")));
        }
    };

    public MovieRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] arg = {id};
        return jdbcTemplate.queryForObject("select * from movies where id = ?", arg, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
        Object[] args = {movie.getName(), movie.getMinutes(), movie.getGenre().toString()};
        jdbcTemplate.update("insert into movies (name, minutes, genre) values(?,?,?)", args);
    }
}
