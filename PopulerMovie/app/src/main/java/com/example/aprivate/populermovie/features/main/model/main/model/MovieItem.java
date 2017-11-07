package com.example.aprivate.populermovie.features.main.model.main.model;

import com.example.aprivate.populermovie.data.model.MovieData;

/**
 * Created by private on 19/10/2017.
 */

public interface MovieItem extends MainItem {
    String getMovieId();

    String getMovieTitle();

    String getPosterPath();

    MovieData getMovieData();
}