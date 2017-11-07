package com.example.aprivate.populermovie.data.api;

import com.example.aprivate.populermovie.data.model.MovieDataResponse;
import com.example.aprivate.populermovie.data.model.MovieDetail;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by private on 17/10/2017.
 */
public interface TmdbApiService {
    @GET("movie/popular")
    Call<MovieDataResponse> getMostPopularMovies(@Query("page")int page);

    @GET("movie/{movie_id}")
    Call<MovieDetail> getMovieDetail(@Path("movie_id") String movieId);

    @GET("movie/upcoming")
    Call<MovieDataResponse> getUpcomingMovies(@Query("page")int page);

}
