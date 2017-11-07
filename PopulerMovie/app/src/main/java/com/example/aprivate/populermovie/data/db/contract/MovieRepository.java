package com.example.aprivate.populermovie.data.db.contract;

import com.example.aprivate.populermovie.data.model.MovieData;

import java.util.List;

/**
 * Created by private on 26/10/2017.
 */

public interface MovieRepository {
    List<MovieData> getFavoriteMovie();

    void addFavoriteMovie(MovieData movieData);

    boolean isMovieFavored(String movieId);

    void updateFavoriteMovie(MovieData movieData);

    void removeFavoriteMovie(String movieId);
}
