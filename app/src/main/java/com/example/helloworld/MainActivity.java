package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText nameET;
    TextInputEditText messageET;
    TextInputEditText phoneET;
    TextInputEditText emailET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        messageET = findViewById(R.id.messageET);
        phoneET = findViewById(R.id.phoneET);
        emailET = findViewById(R.id.emailET);

    }
}