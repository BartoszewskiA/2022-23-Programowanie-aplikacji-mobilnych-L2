package com.example.w06p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_haslo, et_login;
    Button bt_zaloguj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_haslo = findViewById(R.id.haslo);
        et_login = findViewById(R.id.login);
        bt_zaloguj = findViewById(R.id.bt_zaloguj);
        bt_zaloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sprawdzenie(et_login.getText().toString(),et_haslo.getText().toString()))
                {
                    Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                    intencja.putExtra("login", et_login.getText().toString());
                    startActivity(intencja);
                }

            }
        });
    }

    private boolean sprawdzenie(String log, String pass) {

        return true;
    }
}