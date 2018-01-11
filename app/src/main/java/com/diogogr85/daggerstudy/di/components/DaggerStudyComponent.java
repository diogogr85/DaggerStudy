package com.diogogr85.daggerstudy.di.components;

import com.diogogr85.daggerstudy.DaggerStudyApplication;
import com.diogogr85.daggerstudy.di.injector.ActivityInjector;
import com.diogogr85.daggerstudy.di.modules.ApplicationModule;
import com.diogogr85.daggerstudy.di.modules.BaseActivityModule;
import com.diogogr85.daggerstudy.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by diogoribeiro on 10/01/18.
 */

@Singleton
@Component(modules = {
        ActivityInjector.class,
        BaseActivityModule.class,
        NetworkModule.class,
        AndroidInjectionModule.class})
public interface DaggerStudyComponent {

    void inject(DaggerStudyApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(DaggerStudyApplication application);

        DaggerStudyComponent build();
    }

}
