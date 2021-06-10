package com.deril1709.finalmobile.data.api.repository;

import com.deril1709.finalmobile.data.api.Service;
import com.deril1709.finalmobile.data.api.repository.callback.OnCallBack;
import com.deril1709.finalmobile.data.api.repository.callback.OnCastCallBack;
import com.deril1709.finalmobile.data.api.repository.callback.OnDetailCallBack;
import com.deril1709.finalmobile.data.api.repository.callback.OnSearchCallBack;

public abstract class Repository<T> {
    protected Service service;

    protected abstract void getModel(int page, final OnCallBack<T> callback);
    protected abstract void getModelDetail(int id, final OnDetailCallBack<T> callback);
    protected abstract void search(String query, int page, final OnSearchCallBack<T> callback);
    protected abstract void getCasts(int id, OnCastCallBack callback);
}
