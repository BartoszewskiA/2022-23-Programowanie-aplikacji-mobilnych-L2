package com.example.w06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView a2_textView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a2_textView01 = findViewById(R.id.a2_textView01);
        Bundle paczka = getIntent().getExtras();
        a2_textView01.setText(paczka.getString("login"));
    }
}