package com.example.jugandoconanimaciones22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button buttonParapadeo,buttonRotación,buttonStop;
ImageView coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonParapadeo = findViewById(R.id.buttonParpadeo);
        buttonRotación = findViewById(R.id.buttonRotación);
        buttonStop=findViewById(R.id.buttonStop);
        coche=findViewById(R.id.imageView);

        buttonParapadeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animación = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.parpadeo);
                coche.startAnimation(animación);
            }
        });
        buttonRotación.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animación = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotacion);
                buttonParapadeo.startAnimation(animación);
            }
        });
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coche.clearAnimation();
            }
        });


    }
}