package com.example.sandysatriya.la5;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = (Button) findViewById(R.id.btnExit);
        Button about = (Button) findViewById(R.id.btnAbout);
        Button hitung = (Button) findViewById(R.id.btnHitung);
        exit.setOnClickListener(this);
        about.setOnClickListener(this);
        hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnHitung:
                Intent intent = new Intent();intent.setComponent(new ComponentName(MenuUtama.class.getPackage().getName(),
                    MenuUtama.class.getCanonicalName()));
                startActivity(intent);
                break;
            case R.id.btnAbout:
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
            case R.id.btnExit:
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
