package com.example.comp1786_l3_4_android_gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    // Create an array with options
    private String [] workStatus = {"Employed", "Unemployed"};
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to spinner
        sp = findViewById(R.id.spinner);

        // Create an adapter
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, workStatus);
        // Connect adapter to spinner
        sp.setAdapter(dataAdapter);
    }
}