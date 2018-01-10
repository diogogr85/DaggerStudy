package com.diogogr85.daggerstudy.presenter;

import android.content.Context;

import com.diogogr85.daggerstudy.DaggerStudyApplication5;
import com.diogogr85.daggerstudy.data.network.NetworkManager;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

/**
 * Created by diogoribeiro on 09/01/18.
 */

public class BasePresenter<V> {

    protected WeakReference<V> view;
    protected final NetworkManager mNetworkManager;

    @Inject
    public BasePresenter(NetworkManager networkManager) {
        mNetworkManager = networkManager;
    }

    public void bindView(final V view) {
        this.view = new WeakReference<V>(view);
    }

    public void unbindView() {
        view = null;
    }

    public V getView() {
        if (view != null) {
            return view.get();
        } else {
            return null;
        }
    }

}
