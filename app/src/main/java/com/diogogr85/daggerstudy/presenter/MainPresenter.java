package com.diogogr85.daggerstudy.presenter;

import android.util.Log;

import com.diogogr85.daggerstudy.data.model.Film;
import com.diogogr85.daggerstudy.data.model.FilmsRequest;
import com.diogogr85.daggerstudy.data.network.NetworkManager;
import com.diogogr85.daggerstudy.presenter.contracts.MainContract;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by diogoribeiro on 10/01/18.
 */

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    public MainPresenter(NetworkManager networkManager) {
        super(networkManager);
    }

    @Override
    public void getFilms() {
        mNetworkManager.getFilms()
                .enqueue(new Callback<FilmsRequest>() {
                    @Override
                    public void onResponse(Call<FilmsRequest> call, Response<FilmsRequest> response) {
                        final List<Film> films = new ArrayList<>();
                        if (response != null && response.isSuccessful()) {
                            films.clear();
                            films.addAll(response.body().getResults());

                        } else {
                            Log.d("FILMS-ERROR", "Lista Vazia");
                        }

                        final MainContract.View view = getView();
                        if (view != null) {
                            view.onGetFilms(films);
                        }
                    }

                    @Override
                    public void onFailure(Call<FilmsRequest> call, Throwable t) {
                        Log.d("FILMS-ERROR", "OCORREU UM ERRO NA REQUISIÇÃO");
                    }
                });
    }
}
