package com.example.sandysatriya.la7;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager vPager = (ViewPager)findViewById(R.id.vp);
        FragmentManager fm = getSupportFragmentManager();
        LembarAdapter pagerAdapter = new LembarAdapter(fm);
        vPager.setAdapter(pagerAdapter);
   }
}