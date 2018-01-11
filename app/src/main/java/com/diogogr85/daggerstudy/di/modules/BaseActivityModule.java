package com.diogogr85.daggerstudy.di.modules;

import com.diogogr85.daggerstudy.data.network.NetworkManager;
import com.diogogr85.daggerstudy.presenter.MainPresenter;
import com.diogogr85.daggerstudy.presenter.contracts.MainContract;
import com.diogogr85.daggerstudy.view.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by diogoribeiro on 10/01/18.
 */

@Module(includes = NetworkModule.class)
public class BaseActivityModule {

    @Provides
    MainContract.Presenter provideMainPresenter(@Named("NetworkManager") NetworkManager networkManager) {
        return new MainPresenter(networkManager);
    }

}
