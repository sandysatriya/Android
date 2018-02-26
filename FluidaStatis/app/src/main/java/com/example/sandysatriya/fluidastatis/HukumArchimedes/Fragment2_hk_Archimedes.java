package com.example.sandysatriya.fluidastatis.HukumArchimedes;

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

public class Fragment2_hk_Archimedes  extends Fragment implements View.OnClickListener {

    EditText input_fa,input_roF,input_Vbf;
    TextView Output;
    Button HitungFa,HitungroF,HitungVbf;
    Double fa,roF,Vbf,g = 9.8;

    public static Fragment2_hk_Archimedes newInstance(){
        return new Fragment2_hk_Archimedes();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.archimedes_fragment2, container, false);

        input_fa = (EditText) rootView.findViewById(R.id.editTextFa);
        input_roF = (EditText) rootView.findViewById(R.id.editTextroF);
        input_Vbf = (EditText) rootView.findViewById(R.id.editTextVbf);
        Output = (TextView) rootView.findViewById(R.id.hasil);

        HitungFa = (Button) rootView.findViewById(R.id.buttonHitungFa);
        HitungroF = (Button) rootView.findViewById(R.id.buttonHitungRof);
        HitungVbf = (Button) rootView.findViewById(R.id.buttonHitungVbf);

        HitungFa.setOnClickListener(this);
        HitungroF.setOnClickListener(this);
        HitungVbf.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonHitungFa:
                if (input_roF.getText().toString().trim().length() <= 0 || input_Vbf.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field ρf atau Vbf belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    roF = Double.parseDouble(input_roF.getText().toString());
                    Vbf = Double.parseDouble(input_Vbf.getText().toString());
                    Double Fa = (roF * Vbf) * g;
                    Output.setText("Fa : " + Fa+ " N");
                }
                break;

            case R.id.buttonHitungRof:
                if (input_fa.getText().toString().trim().length() <= 0 || input_Vbf.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field Fa atau Vbf belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    fa = Double.parseDouble(input_fa.getText().toString());
                    Vbf = Double.parseDouble(input_Vbf.getText().toString());
                    Double RoF = fa / (Vbf * g);
                    Output.setText("ρf : " + RoF+ " kg/m³");
                }
                break;

            case R.id.buttonHitungVbf:
                if (input_fa.getText().toString().trim().length() <= 0 || input_roF.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field Fa atau ρf belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    fa = Double.parseDouble(input_fa.getText().toString());
                    roF = Double.parseDouble(input_roF.getText().toString());
                    Double VbF = fa / (roF * g);
                    Output.setText("Vbf : " + VbF+ " m³");
                }
                break;

        }
    }
}