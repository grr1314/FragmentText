package com.fragment.admin.fragmenttext.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 2016/11/1.
 */
public abstract class BaseFragment extends Fragment {
    private static final String TAG = "BaseFragment";

    private boolean isVisable = false;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e(TAG, "setUserVisibleHint");
        if (isVisibleToUser) {
            Log.e(TAG, "BaseFragment 可见");
            isVisable = true;
            visable();
            return;
        }
        Log.e(TAG, "BaseFragment 不可见");
        isVisable = false;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    protected void visable() {
        onLoad();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public abstract void onLoad();
}
