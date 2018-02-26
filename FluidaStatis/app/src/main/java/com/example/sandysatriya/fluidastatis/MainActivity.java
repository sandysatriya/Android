package com.example.sandysatriya.fluidastatis;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sandysatriya.fluidastatis.Hidrostatis.HidrostatisActivity;
import com.example.sandysatriya.fluidastatis.HukumArchimedes.hkArchimedesActivity;
import com.example.sandysatriya.fluidastatis.HukumPascal.hkPascalActivity;
import com.example.sandysatriya.fluidastatis.MassaJenis.MassaJenisActivity;
import com.example.sandysatriya.fluidastatis.Tekanan.TekananActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        String pilihan[] = {"Massa Jenis Zat", "Tekanan", "Tekanan Hidrostatis", "Hukum Pascal", "Hukum Archimedes", "About", "Exit"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pilihan);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();

                switch (itemPosition) {
                    case 0:
                        Intent a = new Intent(MainActivity.this, MassaJenisActivity.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(MainActivity.this, TekananActivity.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent(MainActivity.this, HidrostatisActivity.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent(MainActivity.this, hkPascalActivity.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent(MainActivity.this, hkArchimedesActivity.class);
                        startActivity(e);
                        break;
                    case 5:
                        Intent f = new Intent(MainActivity.this, About.class);
                        startActivity(f);
                        break;
                    case 6:
                        AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                        keluar.setMessage("Are You Sure ?").setCancelable(false).setPositiveButton("Yes", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface arg0, int arg1) {
                                MainActivity.this.finish();
                            }
                        }).setNegativeButton("No", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int arg1) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog dialog1 = keluar.create();
                        dialog1.setTitle("Exit");
                        dialog1.show();
                        break;
                }
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are You Sure ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}