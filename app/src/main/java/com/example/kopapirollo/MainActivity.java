package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView playersImage;
    private ImageView computersImage;
    private TextView playersPoints;
    private TextView computersPoints;
    private Button koGomb;
    private Button olloGomb;
    private Button papirGomb;
    private int valasztas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListeners();
    }

    private void init() {
        playersImage.findViewById(R.id.playersImage);
        computersImage.findViewById(R.id.computersImage);
        playersPoints.findViewById(R.id.playersPoints);
        computersPoints.findViewById(R.id.computersPoints);
        koGomb.findViewById(R.id.koGomb);
        papirGomb.findViewById(R.id.papirGomb);
        olloGomb.findViewById(R.id.olloGomb);
        valasztas=0;
    }

    private void addListeners(){
        koGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas=1;
            }
        });

        papirGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas=2;
            }
        });

        olloGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas=3;
            }
        });
    }
}