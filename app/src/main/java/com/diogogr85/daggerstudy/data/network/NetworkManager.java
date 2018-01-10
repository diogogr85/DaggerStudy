package com.diogogr85.daggerstudy.data.network;

import com.diogogr85.daggerstudy.data.model.FilmsRequest;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;

/**
 * Created by diogoribeiro on 05/01/18.
 */

@Singleton
public class NetworkManager implements NetworkService {

    private final NetworkService mNetworkService;

    @Inject
    public NetworkManager(NetworkService networkService) {
        mNetworkService = networkService;
    }

    @Override
    public Call<FilmsRequest> getFilms() {
        return mNetworkService.getFilms();
    }

//    public NetworkManager(final Class<T> serviceClass) {
//        mServiceClass = serviceClass;
//
//        setupNetwork();
//    }
//
//    private void setupNetwork() {
//        mService = mRetrofit.create(mServiceClass);
//    }

}
