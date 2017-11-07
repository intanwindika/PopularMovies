package com.example.aprivate.populermovie.features.main.model.main.model;

import com.example.aprivate.populermovie.R;
import com.example.aprivate.populermovie.data.model.MovieData;

/**
 * Created by private on 24/10/2017.
 */

public class BigMovieItem implements MovieItem {
    private final String movieId;
    private final String movieTitle;
    private final String posterPath;
    private final String overview;
    private final MovieData movieData;

    public BigMovieItem(String movieId, String movieTitle, String posterPath, String overview, MovieData movieData) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.posterPath = posterPath;
        this.overview = overview;
        this.movieData = movieData;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getPosterPath() {
        return posterPath;
    }

    @Override
    public MovieData getMovieData() {
        return movieData;
    }

    public String getOverview() {
        return overview;
    }

    @Override
    public int getType() {
        return R.layout.main_big_movie_item;
    }

    @Override
    public int getItemSize() {
        return 2;
    }
}