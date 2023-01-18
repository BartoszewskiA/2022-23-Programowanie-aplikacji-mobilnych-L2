package com.example.lab09p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    Button bt_ok, bt_anuluj;
    Spinner spiner;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spiner = findViewById(R.id.a2_spinner01);
        editText = findViewById(R.id.a2_editText01);
        bt_ok = findViewById(R.id.a2_button01);
        bt_anuluj = findViewById(R.id.a2_button02);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                odpowiedz();
            }
        });
        bt_anuluj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
            }
        });
    }

    private void odpowiedz() {
        Intent intencja = new Intent();
        String nazwa = spiner.getSelectedItem().toString();
        int ile =1;
        if(!editText.getText().toString().isEmpty()) ile = Integer.valueOf(editText.getText().toString());
        intencja.putExtra("produkt", nazwa);
        intencja.putExtra("sztuk",ile);
        setResult(RESULT_OK,intencja);
    }
}