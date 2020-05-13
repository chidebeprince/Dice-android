package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
       final ImageView roll1;
       final ImageView roll2;

        button = findViewById(R.id.roll);
        roll1 = findViewById(R.id.dice1);
        roll2 = findViewById(R.id.dice2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int ran = random.nextInt(6);
                int ra = random.nextInt(6);

                int [] hello = {R.drawable.dice1,
                                R.drawable.dice2,
                                R.drawable.dice3,
                                R.drawable.dice4,
                                R.drawable.dice5,
                                R.drawable.dice6};
                roll1.setImageResource(hello[ran]);
                roll2.setImageResource(hello[ra]);
            }
        });















    }


    }





