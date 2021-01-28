package com.example.tv.listeners;

import com.example.tv.models.TVShows;

public interface WatchlistListener {
    void onTVShowClicked(TVShows tvShows);

    void removeTVShowFormWatchlist(TVShows tvShows, int position);
}
