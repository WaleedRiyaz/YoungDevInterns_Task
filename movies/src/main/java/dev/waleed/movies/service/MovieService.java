package dev.waleed.movies.service;

import dev.waleed.movies.model.Movie;
import dev.waleed.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movie> allMovies() {
        System.out.println(moviesRepository.findAll().toString());
        return moviesRepository.findAll();
    }

    public Optional<Movie> getMovie(String id) {
        return moviesRepository.findMovieByImdbId(id);
    }

}
