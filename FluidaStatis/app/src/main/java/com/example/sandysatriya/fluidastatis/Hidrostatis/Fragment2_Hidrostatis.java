package com.example.sandysatriya.fluidastatis.Hidrostatis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sandysatriya.fluidastatis.R;

/**
 * Created by SandySatriya on 6/1/2017.
 */

public class Fragment2_Hidrostatis extends Fragment implements View.OnClickListener {

    EditText input_ph,input_ro,input_h;
    TextView Output;
    Button HitungPh,Hitungro,HitungH;
    Double Ph,h,ro,g = 9.8;

    public static Fragment2_Hidrostatis newInstance(){
        return new Fragment2_Hidrostatis();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hidrostatis_fragment2, container, false);

        input_ph = (EditText) rootView.findViewById(R.id.editTextph);
        input_ro = (EditText) rootView.findViewById(R.id.editTextro);
        input_h = (EditText) rootView.findViewById(R.id.editTexth);
        Output = (TextView) rootView.findViewById(R.id.hasil);

        HitungPh = (Button) rootView.findViewById(R.id.buttonHitungph);
        Hitungro = (Button) rootView.findViewById(R.id.buttonHitungro);
        HitungH = (Button) rootView.findViewById(R.id.buttonHitungh);

        HitungPh.setOnClickListener(this);
        Hitungro.setOnClickListener(this);
        HitungH.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonHitungph:
                if (input_ro.getText().toString().trim().length() <= 0 || input_h.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field ρ atau h belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    ro = Double.parseDouble(input_ro.getText().toString());
                    h = Double.parseDouble(input_h.getText().toString());
                    Double PH = (ro * g) * h;
                    Output.setText("Ph : " + PH+ " N/m²");
                }
                break;

            case R.id.buttonHitungro:
                if (input_ph.getText().toString().trim().length() <= 0 || input_h.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field Ph atau h belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    Ph = Double.parseDouble(input_ph.getText().toString());
                    h = Double.parseDouble(input_h.getText().toString());
                    Double Ro = Ph / (g * h);
                    Output.setText("ρ : " + Ro+ " kg/m³");
                }
                break;

            case R.id.buttonHitungh:
                if (input_ph.getText().toString().trim().length() <= 0 || input_ro.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field Ph atau ρ belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    Ph = Double.parseDouble(input_ph.getText().toString());
                    ro = Double.parseDouble(input_ro.getText().toString());
                    Double H = Ph / (ro * g);
                    Output.setText("h : " + H+ " m");
                }
                break;

        }
    }
}
