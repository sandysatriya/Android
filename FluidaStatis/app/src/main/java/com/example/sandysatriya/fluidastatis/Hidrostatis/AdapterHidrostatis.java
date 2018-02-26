package com.example.sandysatriya.fluidastatis.Hidrostatis;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sandysatriya.fluidastatis.R;

/**
 * Created by SandySatriya on 6/1/2017.
 */

public class AdapterHidrostatis extends FragmentPagerAdapter {

    final int PAGE_COUNT = 2;
    final Context context;

    public AdapterHidrostatis(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = Fragment1_Hidrostatis.newInstance();
                break;
            case 1:
                fragment = Fragment2_Hidrostatis.newInstance();
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getResources().getString(R.string.teori);
            case 1:
                return context.getResources().getString(R.string.hitung);
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
