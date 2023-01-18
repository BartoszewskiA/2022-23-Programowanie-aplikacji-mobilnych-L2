package com.example.lab08p01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText01;
    TextView textView;
    RadioButton r1,r2,r3;
    ConstraintLayout tlo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText01 = findViewById(R.id.editText01);
        textView = findViewById(R.id.textView1);
        r1 = findViewById(R.id.radioButton1);
        r2 = findViewById(R.id.radioButton2);
        r3 = findViewById(R.id.radioButton3);
        tlo = findViewById(R.id.tlo);
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch(id)
                {
                    case R.id.radioButton1: tlo.setBackgroundColor(Color.GREEN); break;
                    case R.id.radioButton2: tlo.setBackgroundColor(Color.RED); break;
                    case R.id.radioButton3: tlo.setBackgroundColor(Color.BLUE); break;
                }
            }
        };
        r1.setOnClickListener(sluchacz);
        r2.setOnClickListener(sluchacz);
        r3.setOnClickListener(sluchacz);


        editText01.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText(editText01.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}