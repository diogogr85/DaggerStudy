package com.diogogr85.daggerstudy.di.modules;

import android.content.Context;

import com.diogogr85.daggerstudy.DaggerStudyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by diogoribeiro on 11/01/18.
 */

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    Context provideContext(DaggerStudyApplication application) {
        return application.getApplicationContext();
    }

}
