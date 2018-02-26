package com.example.sandysatriya.fluidastatis.Hidrostatis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sandysatriya.fluidastatis.R;

/**
 * Created by SandySatriya on 6/1/2017.
 */

public class Fragment1_Hidrostatis extends Fragment {

    public static Fragment1_Hidrostatis newInstance(){
        return new Fragment1_Hidrostatis();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hidrostatis_fragment1, container, false);

        return rootView;
    }
}
