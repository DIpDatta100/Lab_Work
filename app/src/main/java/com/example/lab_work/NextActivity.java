package com.example.lab_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Bundle bundle=new Bundle();
        bundle.putString("studentId",getIntent().getStringExtra("studentId"));
        Button calculateBmi=findViewById(R.id.btnCalculateBMI);
        calculateBmi.setOnClickListener(v -> {
        BmiFragment bmiFragment=new BmiFragment();
        bmiFragment.setArguments(bundle);
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container,bmiFragment);
            ft.addToBackStack(null);
            ft.commit();


        });
    }
}