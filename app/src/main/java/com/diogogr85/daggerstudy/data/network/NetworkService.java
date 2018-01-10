package com.diogogr85.daggerstudy.data.network;

import com.diogogr85.daggerstudy.data.model.FilmsRequest;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by diogoribeiro on 04/01/18.
 */

public interface NetworkService {

    @GET("films")
    Call<FilmsRequest> getFilms();

}
