package com.diogogr85.daggerstudy.di.components;

import com.diogogr85.daggerstudy.di.modules.NetworkModule2;
import com.diogogr85.daggerstudy.presenter.BasePresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by diogoribeiro on 04/01/18.
 */

@Singleton
@Component(modules = NetworkModule2.class)
public interface NetworkComponent4 {
//    void inject(BasePresenter basePresenter);
}
