package com.example.lab04p01_atlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] grafiki = new int[] {R.drawable.f_wilk,
                               R.drawable.f_rekin,
                               R.drawable.f_lion};

    String[] nazwy;
    String[] opisy;
    int nr = 0;

    ImageView ramka;
    TextView nazwa, opis;
    Button next, back;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ramka = findViewById(R.id.ramka);
        nazwa = findViewById(R.id.tw_nazwa);
        opis = findViewById(R.id.tw_opis);
        next = findViewById(R.id.b_next);
        back = findViewById(R.id.b_back);
        nazwy = getResources().getStringArray(R.array.nazwy);
        opisy = getResources().getStringArray(R.array.opisy);
        nr = random.nextInt(grafiki.length);
        zaladuj(nr);
        View.OnClickListener sluchacz = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Id = v.getId();
                if(Id==R.id.b_next)
                    if(nr >= grafiki.length-1) nr=0; else nr++;
                else
                    if(nr<=0) nr= grafiki.length -1; else nr--;

                    zaladuj(nr);
            }
        };
        next.setOnClickListener(sluchacz);
        back.setOnClickListener(sluchacz);
    }

    private void zaladuj(int nr) {
        ramka.setImageResource(grafiki[nr]);
        nazwa.setText(nazwy[nr]);
        opis.setText(opisy[nr]);
    }
}