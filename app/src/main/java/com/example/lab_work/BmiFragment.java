package com.example.lab_work;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.text.NumberFormat;

public class BmiFragment extends Fragment {

    public BmiFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bmi, container, false);
        TextView id=view.findViewById(R.id.std_id);
        id.setText(getArguments().getString("studentId"));
        EditText weightEdt=view.findViewById(R.id.weight_id);
        EditText heightEdt=view.findViewById(R.id.Height_id);
        Button calculate=view.findViewById(R.id.calculate_id);
        calculate.setOnClickListener(v -> {

           double height=Double.parseDouble(heightEdt.getText().toString());
           double weight=Double.parseDouble(weightEdt.getText().toString());
           double bmi=weight/(height*height);
           String compliment="";
            if(bmi>25){compliment="overweight";} else {compliment="Underweight";}
            Toast.makeText(getActivity(), "Status=" + compliment+" Score =" + String.format("%.2f",bmi), Toast.LENGTH_SHORT).show();
        });



        return view ;
    }
}