package com.example.sandysatriya.la4;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = (Button) findViewById(R.id.keluar);
        Button about = (Button) findViewById(R.id.tentang);
        Button hitung = (Button) findViewById(R.id.hitung);
        final EditText input_alas = (EditText) findViewById(R.id.alas);
        final EditText input_tinggi = (EditText) findViewById(R.id.tinggi);
        final TextView Luas = (TextView) findViewById(R.id.luas);

        exit.setOnClickListener(this);
        about.setOnClickListener(this);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(input_alas.getText().toString());
                int t = Integer.parseInt(input_tinggi.getText().toString());
                int ls = a * t;
                if (a == t) {
                    Luas.setText("Luas Jajar Genjang =" + ls);
                } else {
                    Luas.setText("Luas Jajar Genjang = " + ls);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tentang:
                final AlertDialog.Builder info = new AlertDialog.Builder(MainActivity.this);
                info.setMessage("Perkenalkan! \n\n Nama : Sandy Satriya").setPositiveButton("Lanjut", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog = info.create();
                dialog.setTitle("Informasi Aplikasi");
                dialog.show();
                break;
            case R.id.keluar:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                keluar.setMessage("Yakin ingin keluar ?").setCancelable(false).setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent exit = new Intent(Intent.ACTION_MAIN);
                        exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(exit);
                    }
                }).setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog1 = keluar.create();
                dialog1.setTitle("Keluar");
                dialog1.show();
        }
    }
}
