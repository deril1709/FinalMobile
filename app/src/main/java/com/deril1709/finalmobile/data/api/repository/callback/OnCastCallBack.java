package com.deril1709.finalmobile.data.api.repository.callback;

import com.deril1709.finalmobile.data.models.Cast;

import java.util.List;

public interface OnCastCallBack {
    void onSuccess(List<Cast> castList, String message);
    void onFailure(String message);
}
