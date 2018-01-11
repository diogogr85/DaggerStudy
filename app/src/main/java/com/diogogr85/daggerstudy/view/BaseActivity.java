package com.diogogr85.daggerstudy.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by diogoribeiro on 10/01/18.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((DaggerStudyApplication) getApplication()).getComponent().inject(this);
    }
}
