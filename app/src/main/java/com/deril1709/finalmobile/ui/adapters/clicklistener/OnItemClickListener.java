package com.deril1709.finalmobile.ui.adapters.clicklistener;

import com.deril1709.finalmobile.data.models.Movie;
import com.deril1709.finalmobile.data.models.TvShow;
import com.deril1709.finalmobile.data.local.FavoriteMovie;
import com.deril1709.finalmobile.data.local.FavoriteTv;

public interface OnItemClickListener {
    void onClick(TvShow tvShow);
    void onClick(Movie movie);
    void onClick(FavoriteMovie movie);
    void onClick(FavoriteTv tv);
}