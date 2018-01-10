package com.diogogr85.daggerstudy.di.components;

import android.app.Activity;

import com.diogogr85.daggerstudy.di.modules.NetworkModule2;
import com.diogogr85.daggerstudy.di.modules.PresenterModule;
import com.diogogr85.daggerstudy.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by diogoribeiro on 10/01/18.
 */

@Singleton
@Component(modules = { NetworkModule2.class,
        PresenterModule.class})
public interface DaggerStudyComponent {
    void inject(MainActivity mainActivity);
//public interface DaggerStudyComponent extends AndroidInjector<MainActivity> {

//    @Component.Builder
//    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
//        public abstract DaggerStudyComponent build();
//    }

}
