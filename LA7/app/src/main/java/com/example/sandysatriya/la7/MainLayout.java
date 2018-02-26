package com.example.sandysatriya.la7;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by SandySatriya on 6/8/2017.
 */

public class MainLayout extends FragmentActivity {

    ListView listview;
    String[] rumus = new String[] {"Fluida Statis", "Fluida Dinamis", "Energi Mekanik", "Momentum",
            "Kesetimbangan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

    listview = (ListView)findViewById(R.id.lv);

    ArrayAdapter<String> rmsFisika = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, rumus);
        listview.setAdapter(rmsFisika);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> I, View v, int position, long id) {
            Toast.makeText(MainLayout.this, "Rumus yang anda pilih adalah "
                    +rumus[position], Toast.LENGTH_SHORT).show();
        }
    });
}
}
