package com.example.lab09p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt_dodaj;
    TextView tv_lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_dodaj = findViewById(R.id.a1_button01);
        tv_lista = findViewById(R.id.a1_textView01);
        bt_dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                startActivityForResult(intencja,1);
            }
        });
    }
}