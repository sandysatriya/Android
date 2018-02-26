package com.example.sandysatriya.fluidastatis.Tekanan;

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

import com.example.sandysatriya.fluidastatis.MainActivity;
import com.example.sandysatriya.fluidastatis.R;

/**
 * Created by SandySatriya on 6/1/2017.
 */

public class Fragment2_Tekanan extends Fragment implements View.OnClickListener{

    EditText input_p,input_f,input_a;
    TextView Output;
    Double Tekanan,Gaya,Luas,A,F,P;

    public static Fragment2_Tekanan newInstance(){
        return new Fragment2_Tekanan();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tekanan_fragment2, container, false);

        input_p = (EditText) rootView.findViewById(R.id.editTextP);
        input_f = (EditText) rootView.findViewById(R.id.editTextF);
        input_a = (EditText) rootView.findViewById(R.id.editTextA);
        Output = (TextView) rootView.findViewById(R.id.hasil);
        Button HitungP = (Button) rootView.findViewById(R.id.buttonHitungTekanan);
        Button HitungF = (Button) rootView.findViewById(R.id.buttonHitungGaya);
        Button HitungA = (Button) rootView.findViewById(R.id.buttonHitungLuas);

        HitungP.setOnClickListener(this);
        HitungF.setOnClickListener(this);
        HitungA.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonHitungTekanan:
                if (input_f.getText().toString().trim().length() <= 0 || input_a.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field F atau A belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    F = Double.parseDouble(input_f.getText().toString());
                    A = Double.parseDouble(input_a.getText().toString());
                    Tekanan = F / A;
                    Output.setText("Tekanan : " + Tekanan+ " N/m²");
                }
                break;

            case R.id.buttonHitungGaya:
                if (input_p.getText().toString().trim().length() <= 0 || input_a.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field P atau A belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    P = Double.parseDouble(input_p.getText().toString());
                    A = Double.parseDouble(input_a.getText().toString());
                    Gaya = P * A;
                    Output.setText("Gaya : " + Gaya+ " N");
                }
                break;

            case R.id.buttonHitungLuas:
                if (input_f.getText().toString().trim().length() <= 0 || input_p.getText().toString().length() == 0) {
                    Toast.makeText(getActivity(), "Field F atau P belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    F = Double.parseDouble(input_f.getText().toString());
                    P = Double.parseDouble(input_p.getText().toString());
                    Luas = F / P;
                    Output.setText("Luas : " + Luas+ " m²");
                }
                break;
        }
    }
}
