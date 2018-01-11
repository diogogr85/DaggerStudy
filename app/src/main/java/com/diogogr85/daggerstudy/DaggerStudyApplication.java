package com.diogogr85.daggerstudy;

import android.app.Application;

import com.diogogr85.daggerstudy.di.components.DaggerDaggerStudyComponent;
import com.diogogr85.daggerstudy.di.components.DaggerStudyComponent;
import com.diogogr85.daggerstudy.di.modules.NetworkModule;
import com.diogogr85.daggerstudy.di.modules.PresenterModule;


/**
 * Created by diogoribeiro on 04/01/18.
 */

public class DaggerStudyApplication extends Application {

    private DaggerStudyComponent mStudyComponent;
    private static DaggerStudyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

       mStudyComponent = DaggerDaggerStudyComponent.builder()
                .networkModule(new NetworkModule("https://swapi.co/api/"))
                .presenterModule(new PresenterModule())
                .build();

    }

    public static DaggerStudyApplication getApplication() {
        return sInstance;
    }

    public DaggerStudyComponent getComponent() {
        return mStudyComponent;
    }

}
