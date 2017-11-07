package com.example.aprivate.populermovie.features.main.model.main.model;

import com.example.aprivate.populermovie.R;
import com.example.aprivate.populermovie.data.model.MovieData;

/**
 * Created by private on 24/10/2017.
 */

public class StandardMovieItem implements MovieItem {
    private final String movieId;
    private final String movieTitle;
    private final String posterPath;
    private final MovieData movieData;

    public StandardMovieItem(String movieId, String movieTitle, String posterPath, MovieData movieData) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.posterPath = posterPath;
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

    @Override
    public int getType() {
        return R.layout.main_movie_item;
    }

    @Override
    public int getItemSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "StandardMovieItem{" +
                "movieId='" + movieId + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", posterPath='" + posterPath + '\'' +
                ", movieData=" + movieData +
                '}';
    }
}
