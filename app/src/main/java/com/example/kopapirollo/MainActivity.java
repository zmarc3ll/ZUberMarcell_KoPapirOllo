package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView playersImage;
    private ImageView computersImage;
    private TextView playersPoints;
    private TextView computersPoints;
    private Button koGomb;
    private Button olloGomb;
    private Button papirGomb;
    private int valasztas;
    private Random rnd=new Random();
    private int computerPoints;
    private int playerPoints;
    private int gepValasztasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListeners();
    }

    private void init() {
        playersImage =findViewById(R.id.playersImage);
        computersImage=findViewById(R.id.computersImage);
        playersPoints=findViewById(R.id.playersPoints);
        computersPoints=findViewById(R.id.computersPoints);
        koGomb=findViewById(R.id.koGomb);
        papirGomb=findViewById(R.id.papirGomb);
        olloGomb=findViewById(R.id.olloGomb);
        valasztas = -1;
        computerPoints = 0;
        playerPoints = 0;
    }

    private void addListeners() {
        koGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas = 0;
                gepValasztasa = rnd.nextInt(3);
                if (gepValasztasa == 0) {
                    computersImage.setImageResource(R.drawable.rock);
                } else if (gepValasztasa == 1) {
                    computersImage.setImageResource(R.drawable.paper);
                } else if (gepValasztasa == 2) {
                    computersImage.setImageResource(R.drawable.scissors);
                } else {
                    Toast.makeText(MainActivity.this, "Hiba!", Toast.LENGTH_SHORT).show();
                }
                playersImage.setImageResource(R.drawable.rock);
                if (valasztas == gepValasztasa) {
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                } else if (gepValasztasa == 1) {
                    Toast.makeText(MainActivity.this, "Vesztettél!", Toast.LENGTH_SHORT).show();
                    computerPoints++;
                    computersPoints.setText("Computer " +computerPoints);
                } else {
                    Toast.makeText(MainActivity.this, "Nyertél!", Toast.LENGTH_SHORT).show();
                    playerPoints++;
                    playersPoints.setText("Ember: "+playerPoints);

                }
            }
        });

        papirGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas = 1;
                playersImage.setImageResource(R.drawable.paper);
                gepValasztasa = rnd.nextInt(3);
                if (gepValasztasa == 0) {
                    computersImage.setImageResource(R.drawable.rock);
                } else if (gepValasztasa == 1) {
                    computersImage.setImageResource(R.drawable.paper);
                } else if (gepValasztasa == 2) {
                    computersImage.setImageResource(R.drawable.scissors);
                } else {
                    Toast.makeText(MainActivity.this, "Hiba!", Toast.LENGTH_SHORT).show();
                }
                if (valasztas == gepValasztasa) {
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                } else if (gepValasztasa == 2) {
                    Toast.makeText(MainActivity.this, "Vesztettél!", Toast.LENGTH_SHORT).show();
                    computerPoints++;
                    computersPoints.setText("Computer " +computerPoints);
                } else {
                    Toast.makeText(MainActivity.this, "Nyertél!", Toast.LENGTH_SHORT).show();
                    playerPoints++;
                    playersPoints.setText("Ember: "+playerPoints);

                }
            }
        });

        olloGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas = 2;
                gepValasztasa = rnd.nextInt(3);
                if (gepValasztasa == 0) {
                    computersImage.setImageResource(R.drawable.rock);
                } else if (gepValasztasa == 1) {
                    computersImage.setImageResource(R.drawable.paper);
                } else if (gepValasztasa == 2) {
                    computersImage.setImageResource(R.drawable.scissors);
                } else {
                    Toast.makeText(MainActivity.this, "Hiba!", Toast.LENGTH_SHORT).show();
                }
                playersImage.setImageResource(R.drawable.scissors);
                if (valasztas == gepValasztasa) {
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                } else if (gepValasztasa == 0) {
                    Toast.makeText(MainActivity.this, "Vesztettél!", Toast.LENGTH_SHORT).show();
                    computerPoints++;
                    computersPoints.setText("Computer " +computerPoints);
                } else {
                    Toast.makeText(MainActivity.this, "Nyertél!", Toast.LENGTH_SHORT).show();
                    playerPoints++;
                    playersPoints.setText("Ember: "+playerPoints);

                }
            }
        });
    }
}