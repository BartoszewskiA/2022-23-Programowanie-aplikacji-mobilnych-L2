package com.example.lab07p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView a2_textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a2_textView01 = findViewById(R.id.a2_editText01);
        Bundle paczka = getIntent().getExtras();
        String s = paczka.getString("user");
        int nr = paczka.getInt("numer");
        if(s.length()>0)
            a2_textView01.setText(s);
    }
}