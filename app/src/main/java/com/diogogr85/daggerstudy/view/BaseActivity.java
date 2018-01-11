package com.diogogr85.daggerstudy.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.diogogr85.daggerstudy.presenter.BasePresenter;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.android.AndroidInjection;

/**
 * Created by diogoribeiro on 10/01/18.
 */

public class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

//    @Inject
    protected P mPresenter;
//    protected Provider<P> mPresenterProvider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
//        mPresenter = mPresenterProvider != null ? mPresenterProvider.get() : null;
        super.onCreate(savedInstanceState);
        //        ((DaggerStudyApplication) getApplication()).getComponent().inject(this);
    }

}
