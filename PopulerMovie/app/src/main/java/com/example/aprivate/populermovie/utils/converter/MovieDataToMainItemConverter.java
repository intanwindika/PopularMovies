package com.example.aprivate.populermovie.utils.converter;

/**
 * Created by private on 23/10/2017.
 */

import android.support.annotation.NonNull;

import com.example.aprivate.populermovie.data.model.MovieData;
import com.example.aprivate.populermovie.features.main.model.main.model.BigMovieItem;
import com.example.aprivate.populermovie.features.main.model.main.model.HeaderItem;
import com.example.aprivate.populermovie.features.main.model.main.model.MainItem;
import com.example.aprivate.populermovie.features.main.model.main.model.StandardMovieItem;

import java.util.ArrayList;
import java.util.List;
public class MovieDataToMainItemConverter {
    private MovieDataToMainItemConverter() {
    }

    public static List<MainItem> getMainItemList(String headerTitle, @NonNull List<MovieData> movieDataList) {
        List<MainItem> results = new ArrayList<>();
        int pos = 0;
        results.add(new HeaderItem(headerTitle));
        for (MovieData movieData : movieDataList) {
            results.add(itemCreator(movieData, pos));
            pos++;
        }
        return results;
    }

    static MainItem itemCreator(MovieData movieData, int position) {
        if (position % 5 == 0) {
            return new BigMovieItem(
                    String.valueOf(movieData.getId()),
                    movieData.getTitle(),
                    movieData.getPosterPath(),
                    movieData.getOverview(),
                    movieData);
        } else {
            return new StandardMovieItem(
                    String.valueOf(movieData.getId()),
                    movieData.getTitle(),
                    movieData.getPosterPath(),
                    movieData);
        }
    }
}