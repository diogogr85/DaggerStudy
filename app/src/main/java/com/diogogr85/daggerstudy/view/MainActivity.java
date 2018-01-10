package com.diogogr85.daggerstudy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.diogogr85.daggerstudy.DaggerStudyApplication5;
import com.diogogr85.daggerstudy.R;
import com.diogogr85.daggerstudy.data.model.Film;
import com.diogogr85.daggerstudy.presenter.MainPresenter;
import com.diogogr85.daggerstudy.presenter.contracts.MainContract;

import java.util.List;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerStudyApplication5) getApplication()).getComponent().inject(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mMainPresenter != null) {
            mMainPresenter.bindView(this);
            mMainPresenter.getFilms();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mMainPresenter != null) {
            mMainPresenter.unbindView();
        }
    }

    @Override
    public void onGetFilms(List<Film> films) {
        for (Film film : films) {
            Log.d("FILMS-SUCCESS", film.toString());
        }
    }
}
