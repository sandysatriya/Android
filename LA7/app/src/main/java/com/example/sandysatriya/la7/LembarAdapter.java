package com.example.sandysatriya.la7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by SandySatriya on 5/29/2017.
 */

public class LembarAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 2;

    public LembarAdapter (FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem (int arg0) {
        Lembar myFragment = new Lembar();
        Bundle data = new Bundle();
        data.putInt("current_page", arg0 + 1);
        myFragment.setArguments(data);
        return myFragment;
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return "Halaman  #"+(position+1);
    }
}
