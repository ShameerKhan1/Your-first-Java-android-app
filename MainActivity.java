package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private EditText etEmail;
  private EditText etPass;
  private Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     etEmail = findViewById(R.id.etEmail);
     etPass = findViewById(R.id.etPass);
     btnLogin = findViewById(R.id.btnLogin);

     btnLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String email = etEmail.getText().toString();
             String password = etPass.getText().toString();

             if (email.isEmpty()) {
                 Toast.makeText(MainActivity.this,"Please enter your email", Toast.LENGTH_SHORT).show();
             }
             else if (password.isEmpty()) {
                 Toast.makeText(MainActivity.this, "Please enter your Password", Toast.LENGTH_SHORT).show();

             }
             else {
                 if(email.equals("shameer@123.com") && password.equals("abcd")) {

                     Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

                     Intent calculatorIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                     startActivity(calculatorIntent);
                 }
                 else {

                     Toast.makeText(MainActivity.this, "Invalid email/password", Toast.LENGTH_SHORT).show();

                 }

             }

         }
     });

    }
}