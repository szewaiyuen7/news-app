package com.laioffer.tinnews.repository;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.laioffer.tinnews.ui.home.HomeViewModel;
import com.laioffer.tinnews.ui.save.SaveViewModel;
import com.laioffer.tinnews.ui.search.SearchViewModel;

public class NewsViewModelFactory implements ViewModelProvider.Factory {

    private final NewsRepository repository;

    public NewsViewModelFactory(NewsRepository repository) {
        this.repository = repository;
    }
    /*
        We need to use view model factory to create view model with life-cycles attached.
        If we just create view model ourselves, there is no life cycle methods.

        View models created are in a cache area. When you switch between apps, system would manage
        the memory, kill and restore. (ViewModel state would be lost if you do not create view model
        using factory
     */
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(HomeViewModel.class)) {
            return (T) new HomeViewModel(repository);
        } else if (modelClass.isAssignableFrom(SearchViewModel.class)) {
            return (T) new SearchViewModel(repository);
        } else if (modelClass.isAssignableFrom(SaveViewModel.class)) {
            return (T) new SaveViewModel(repository);
        } else {
            throw new IllegalStateException("Unknown ViewModel");
        }
    }

}
