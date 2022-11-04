package com.example.lab01p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText okienko01, okienko02;
    TextView wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void licz(View view)
    {
        okienko01 = findViewById(R.id.editText01);
        okienko02 = findViewById(R.id.editText02);
        wynik = findViewById(R.id.textView03);
        String s = okienko01.getText().toString();
        Double x1 = Double.parseDouble(s);
        s = okienko02.getText().toString();
        Double x2 = Double.parseDouble(s);
        Double w = x1 + x2;
        s = String.valueOf(w);
        wynik.setText("Wynik= "+s);

    }

}