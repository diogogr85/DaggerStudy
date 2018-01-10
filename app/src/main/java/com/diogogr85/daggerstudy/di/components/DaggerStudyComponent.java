package com.diogogr85.daggerstudy.di.components;

import com.diogogr85.daggerstudy.di.modules.NetworkModule;
import com.diogogr85.daggerstudy.di.modules.PresenterModule;
import com.diogogr85.daggerstudy.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by diogoribeiro on 10/01/18.
 */

@Singleton
@Component(modules = { NetworkModule.class,
        PresenterModule.class})
public interface DaggerStudyComponent {
//    void inject(BaseActivity baseActivity);
    void inject(MainActivity mainActivity);

//public interface DaggerStudyComponent extends AndroidInjector<MainActivity> {

//    @Component.Builder
//    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
//        public abstract DaggerStudyComponent build();
//    }

}
