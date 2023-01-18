package com.example.lab07p01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] users = {"a","B2","C3"};
    String[] pass = {"aaa","bbb","ccc"};

    Button button01;
    EditText editText01, editText02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button01 = findViewById(R.id.button01);
        editText01 = findViewById(R.id.editText01);
        editText02 = findViewById(R.id.editText02);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(),MainActivity2.class);
                String u = editText01.getText().toString();
                String p = editText02.getText().toString();
                if(sprawdz(u,p))
                {
                    intencja.putExtra("user",editText01.getText().toString());
                    startActivity(intencja);
                }
                else
                {
                    editText01.setText("Bład");
                }
            }
        });

    }

    boolean sprawdz(String u, String p) {
        int nr = -1;
        for (int i = 0; i < users.length; i++)
            if (u.equals(users[i])) {
                nr = i;
            }
        if(nr==-1) {
            return false;
        }

        if(pass[nr].equals(p))
            return true;
        else
            return false;
    }

}