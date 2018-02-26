package com.example.sandysatriya.fluidastatis.MassaJenis;

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

public class Fragment2_Massa_Jenis extends Fragment implements View.OnClickListener{

    EditText input_ro, input_Massa, input_Volume;
    TextView Output;
    Double ro,massa,volume;

    public static Fragment2_Massa_Jenis newInstance(){
        return new Fragment2_Massa_Jenis();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.massa_jenis_fragment2, container, false);

        input_ro = (EditText) rootView.findViewById(R.id.editTextro);
        input_Massa = (EditText) rootView.findViewById(R.id.editTextM);
        input_Volume = (EditText) rootView.findViewById(R.id.editTextV);
        Output = (TextView) rootView.findViewById(R.id.hasil);
        Button HitungRo = (Button) rootView.findViewById(R.id.buttonHitungMassaJenis);
        Button HitungMassa = (Button) rootView.findViewById(R.id.buttonHitungMassa);
        Button HitungVolume = (Button)  rootView.findViewById(R.id.buttonHitungVolume);

        HitungRo.setOnClickListener(this);
        HitungMassa.setOnClickListener(this);
        HitungVolume.setOnClickListener(this);

        return rootView;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonHitungMassaJenis:
                if (input_Massa.getText().toString().trim().length() <= 0 || input_Volume.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field m atau V belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    massa = Double.parseDouble(input_Massa.getText().toString());
                    volume = Double.parseDouble(input_Volume.getText().toString());
                    Double MassaJenis = massa / volume;
                    Output.setText("Massa Jenisnya : " + MassaJenis+ " kg/m³");
                }
                break;

            case R.id.buttonHitungMassa:
                if (input_ro.getText().toString().trim().length() <= 0 || input_Volume.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field ρ atau V belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    ro = Double.parseDouble(input_ro.getText().toString());
                    volume = Double.parseDouble(input_Volume.getText().toString());
                    Double Massa = ro * volume;
                    Output.setText("Massanya : " + Massa+ " kg");
                }
                break;

            case R.id.buttonHitungVolume:
                if (input_Massa.getText().toString().trim().length() <= 0 || input_ro.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field m atau ρ belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    massa = Double.parseDouble(input_Massa.getText().toString());
                    ro = Double.parseDouble(input_ro.getText().toString());
                    Double Volume = massa / ro;
                    Output.setText("Volumenya : " + Volume+ " m³");
                }
                break;
        }
    }
}
