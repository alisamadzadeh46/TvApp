package com.example.tv.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tv.repositories.MostPopularTVShowsRepository;
import com.example.tv.responses.TVShowsResponse;

public class MostPopularTVShowsViewModel extends ViewModel {
    private final MostPopularTVShowsRepository mostPopularTVShowsRepository;

    public MostPopularTVShowsViewModel() {
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }
    public LiveData<TVShowsResponse> getMostPopularTVShows(int page){
        return mostPopularTVShowsRepository.getMostPopularTVShow(page);
    }

}
