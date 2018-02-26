package com.example.sandysatriya.fluidastatis.Tekanan;

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

public class Fragment1_Tekanan extends Fragment {

    public static Fragment1_Tekanan newInstance(){
        return new Fragment1_Tekanan();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tekanan_fragment1, container, false);

        return rootView;
    }
}
