package com.example.sandysatriya.la3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText Nama, NPM, Kelas;
    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = (EditText) findViewById(R.id.nama);
        NPM = (EditText) findViewById(R.id.npm);
        Kelas = (EditText) findViewById(R.id.kelas);
        Output = (TextView) findViewById(R.id.output);
    }

    public void tampilkan(View v) {
        switch (v.getId()) {
            case R.id.login:
                Output.setText("Nama : "+Nama.getText().toString() + "     NPM : "+NPM.getText().toString()
                        + "     Kelas : "+Kelas.getText().toString());
        }
        }
    }