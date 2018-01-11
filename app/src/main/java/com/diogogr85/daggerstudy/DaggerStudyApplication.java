package com.diogogr85.daggerstudy;

import android.app.Activity;
import android.app.Application;

import com.diogogr85.daggerstudy.di.components.DaggerDaggerStudyComponent;
import com.diogogr85.daggerstudy.di.components.DaggerStudyComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;


/**
 * Created by diogoribeiro on 04/01/18.
 */

public class DaggerStudyApplication extends Application implements HasActivityInjector {

    private DaggerStudyComponent mStudyComponent;
    private static DaggerStudyApplication sInstance;

    //java.lang.RuntimeException: Unable to start activity ComponentInfo{com.diogogr85.daggerstudy/com.diogogr85.daggerstudy.view.MainActivity}: java.lang.RuntimeException: com.diogogr85.daggerstudy.DaggerStudyApplication does not implement dagger.android.HasActivityInjector
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

       mStudyComponent = DaggerDaggerStudyComponent.builder()
               .application(this)
               .build();

       mStudyComponent.inject(this);

    }

    public static DaggerStudyApplication getApplication() {
        return sInstance;
    }

    public DaggerStudyComponent getComponent() {
        return mStudyComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
