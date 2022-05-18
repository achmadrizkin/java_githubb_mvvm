package com.example.java_githubb_mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.java_githubb_mvvm.model.RecyclerData;
import com.example.java_githubb_mvvm.model.RecyclerList;
import com.example.java_githubb_mvvm.network.RetroRepository;
import com.example.java_githubb_mvvm.network.RetroServiceInterface;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {
    MutableLiveData<List<RecyclerData>> liveData;

    @Inject
    RetroServiceInterface retroServiceInterface;

    @Inject
    public MainActivityViewModel() {
        liveData = new MutableLiveData();
    }

    public MutableLiveData<List<RecyclerData>> getLiveData() {
        return liveData;
    }

    public void makeApiCall() {
        RetroRepository retroRepository = new RetroRepository(retroServiceInterface);
        retroRepository.makeAPICall("cat", liveData);
    }
}