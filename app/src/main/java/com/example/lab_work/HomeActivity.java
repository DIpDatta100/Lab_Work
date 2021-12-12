package com.example.lab_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText passwordEdt = findViewById(R.id.edt_pass);
        Button btnLogin = findViewById(R.id.btn_login);
        EditText studentId=findViewById(R.id.edt_id);
        btnLogin.setOnClickListener(v -> {

            String password = passwordEdt.getText().toString();
            if (!password.equals("open")) {
                Toast.makeText(this, "Login failed ! Enter your password again", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(this,NextActivity.class)
                .putExtra("studentId",studentId.getText().toString()));
            }


        });
    }
}