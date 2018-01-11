package com.diogogr85.daggerstudy.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.diogogr85.daggerstudy.DaggerStudyApplication;
import com.diogogr85.daggerstudy.R;
import com.diogogr85.daggerstudy.data.model.Film;
import com.diogogr85.daggerstudy.presenter.MainPresenter;
import com.diogogr85.daggerstudy.presenter.contracts.MainContract;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Provider;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        ((DaggerStudyApplication) getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mPresenter != null) {
            mPresenter.bindView(this);
            mPresenter.getFilms();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.unbindView();
        }
    }

    @Override
    public void onGetFilms(List<Film> films) {
        for (Film film : films) {
            Log.d("FILMS-SUCCESS", film.toString());
        }
    }
}
