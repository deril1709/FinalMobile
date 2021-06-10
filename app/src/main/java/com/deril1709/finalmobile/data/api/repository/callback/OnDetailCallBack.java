package com.deril1709.finalmobile.data.api.repository.callback;

public interface OnDetailCallBack <T> {
    void onSuccess(T media, String message);

    void onFailure(String message);
}
