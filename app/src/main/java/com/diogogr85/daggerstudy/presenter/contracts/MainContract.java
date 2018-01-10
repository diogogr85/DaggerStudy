package com.diogogr85.daggerstudy.presenter.contracts;

import com.diogogr85.daggerstudy.data.model.Film;

import java.util.List;

/**
 * Created by diogoribeiro on 10/01/18.
 */

public interface MainContract {

    interface View {
        void onGetFilms(final List<Film> films);
    }

    interface Presenter {
        void getFilms();
    }

}
