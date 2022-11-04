package com.example.lab02p02_klikacz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ile = 0;
    TextView wyswietlacz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wyswietlacz = findViewById(R.id.textView01);
    }

    public void zwieksz(View view)
    {
        ile++;
        wyswietlacz.setText(String.valueOf(ile));
    }

    public void zmniejsz(View view)
    {
        ile--;
        wyswietlacz.setText(String.valueOf(ile));
    }

    public void kasuj(View view)
    {
        ile=0;
        wyswietlacz.setText(String.valueOf(ile));
    }
}