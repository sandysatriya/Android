package com.example.sandysatriya.fluidastatis.HukumPascal;

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

public class Fragment2_hk_Pascal extends Fragment implements View.OnClickListener {

    EditText input_F1,input_A1,input_F2,input_A2;
    TextView Output;
    Button HitungF1,HitungA1,HitungF2,HitungA2;
    Double F1,A1,F2,A2;

    public static Fragment2_hk_Pascal newInstance(){
        return new Fragment2_hk_Pascal();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pascal_fragment2, container, false);

        input_F1 = (EditText) rootView.findViewById(R.id.editTextF1);
        input_A1 = (EditText) rootView.findViewById(R.id.editTextA1);
        input_F2 = (EditText) rootView.findViewById(R.id.editTextF2);
        input_A2 = (EditText) rootView.findViewById(R.id.editTextA2);
        Output = (TextView) rootView.findViewById(R.id.hasil);
        HitungF1 = (Button) rootView.findViewById(R.id.buttonHitungF1);
        HitungA1 = (Button) rootView.findViewById(R.id.buttonHitungA1);
        HitungF2 = (Button) rootView.findViewById(R.id.buttonHitungF2);
        HitungA2 = (Button) rootView.findViewById(R.id.buttonHitungA2);

        HitungF1.setOnClickListener(this);
        HitungA1.setOnClickListener(this);
        HitungF2.setOnClickListener(this);
        HitungA2.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonHitungF1:
                if (input_A1.getText().toString().trim().length() <= 0 || input_F2.getText().toString().length() == 0
                        || input_A2.getText().toString().length() == 0 )
                {
                    Toast.makeText(getActivity(), "Field A1, F2 atau A2 belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    A1 = Double.parseDouble(input_A1.getText().toString());
                    F2 = Double.parseDouble(input_F2.getText().toString());
                    A2 = Double.parseDouble(input_A2.getText().toString());
                    Double F11 = (A1 * F2) / A2;
                    Output.setText("F1 : " + F11+ " N");
                }
                break;

            case R.id.buttonHitungA1:
                if (input_F1.getText().toString().trim().length() <= 0 || input_F2.getText().toString().length() == 0
                        || input_A2.getText().toString().length() == 0 )
                {
                    Toast.makeText(getActivity(), "Field F1, F2 atau A2 belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    F1 = Double.parseDouble(input_F1.getText().toString());
                    F2 = Double.parseDouble(input_F2.getText().toString());
                    A2 = Double.parseDouble(input_A2.getText().toString());
                    Double A12 = (F2 / A2) * F1;
                    Output.setText("A1 : " + A12+ " m²");
                }
                break;

            case R.id.buttonHitungF2:
                if (input_A1.getText().toString().trim().length() <= 0 || input_F1.getText().toString().length() == 0
                        || input_A2.getText().toString().length() == 0 )
                {
                    Toast.makeText(getActivity(), "Field A1, F1 atau A2 belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    A1 = Double.parseDouble(input_A1.getText().toString());
                    F1 = Double.parseDouble(input_F1.getText().toString());
                    A2 = Double.parseDouble(input_A2.getText().toString());
                    Double F23 = (F1 / A1) * A2;
                    Output.setText("F2 : " + F23+ " N");
                }
                break;

            case R.id.buttonHitungA2:
                if (input_A1.getText().toString().trim().length() <= 0 || input_F2.getText().toString().length() == 0
                        || input_F1.getText().toString().length() == 0 )
                {
                    Toast.makeText(getActivity(), "Field A1, F2 atau F1 belum terisi", Toast.LENGTH_SHORT).show();
                } else {
                    A1 = Double.parseDouble(input_A1.getText().toString());
                    F2 = Double.parseDouble(input_F2.getText().toString());
                    F1 = Double.parseDouble(input_F1.getText().toString());
                    Double A24 = (F1 / A1) * F2;
                    Output.setText("A2 : " + A24+ " m²");
                }
                break;
        }
    }
}
