package com.example.tv.network;

import com.example.tv.responses.TVShowDetailsResponse;
import com.example.tv.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("most-popular")
    Call<TVShowsResponse> getMostPopularTVShows(@Query("page") int page);


    @GET("show-details")
    Call<TVShowDetailsResponse> getTVShowsDetails(@Query("q") String tvShowId);

    @GET("search")
    Call<TVShowsResponse> searchTVShow(@Query("q") String query, @Query("page") int page);
}
