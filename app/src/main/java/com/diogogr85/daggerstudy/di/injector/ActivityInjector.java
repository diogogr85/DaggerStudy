package com.diogogr85.daggerstudy.di.injector;

import com.diogogr85.daggerstudy.di.annotations.PerActivity;
import com.diogogr85.daggerstudy.di.modules.BaseActivityModule;
import com.diogogr85.daggerstudy.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by diogoribeiro on 11/01/18.
 */

@Module
public abstract class ActivityInjector {

    @PerActivity
    @ContributesAndroidInjector(modules = {BaseActivityModule.class})
    abstract MainActivity contributeMainActivityInjector();

}
