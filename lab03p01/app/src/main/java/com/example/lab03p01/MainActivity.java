package com.example.lab03p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_x, et_y, et_wynik;
    Button bt_plus, bt_minus, bt_razy, bt_podzielic, bt_ce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        znajdzKontrolki();
        dodajSluchaczeZdarzen();
    }

    private void dodajSluchaczeZdarzen() {
        bt_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_x.setText("");
                et_y.setText("");
                et_wynik.setText("");
            }
        });
        //słuchacz zbiorczy
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                double x=0, y=0;
                if(!et_x.getText().toString().equals(""))
                    x = Double.parseDouble(et_x.getText().toString());
                if(!et_y.getText().toString().equals(""))
                    y = Double.parseDouble(et_y.getText().toString());
                double wynik=0;
                switch(id)
                {
                    case R.id.bt_plus: wynik=x+y; break;
                    case R.id.bt_minus: wynik= x-y; break;
                    case R.id.bt_razy: wynik=x*y; break;
                    case R.id.bt_podzielic: wynik=x/y; break;
                }
                et_wynik.setText(String.valueOf(wynik));
            }
        };
        bt_plus.setOnClickListener(sluchacz);
        bt_minus.setOnClickListener(sluchacz);
        bt_razy.setOnClickListener(sluchacz);
        bt_podzielic.setOnClickListener(sluchacz);
    }

    private void znajdzKontrolki() {
        et_x = findViewById(R.id.et_x);
        et_y = findViewById(R.id.et_y);
        et_wynik = findViewById(R.id.et_wynik);
        bt_plus = findViewById(R.id.bt_plus);
        bt_minus = findViewById(R.id.bt_minus);
        bt_razy = findViewById(R.id.bt_razy);
        bt_podzielic = findViewById(R.id.bt_podzielic);
        bt_ce = findViewById(R.id.bt_ce);
    }
}