package com.example.javaanimation;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button blinkButton;
    private Button rotateButton;
    private Button fadeButton;
    private Button moveButton;
    private Button slideButton;
    private Button zoomButton;
    private Button stopButton;
    private  Button combinationBTN;

    private LinearLayout layoutAnimLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageviewIV);
        blinkButton = findViewById(R.id.blinkBTN);
        rotateButton = findViewById(R.id.rotateBTN);
        fadeButton = findViewById(R.id.fadeBTN);
        moveButton = findViewById(R.id.moveBTN);
        slideButton = findViewById(R.id.slideBTN);
        zoomButton = findViewById(R.id.zoomBTN);
        stopButton = findViewById(R.id.stopBTN);
        combinationBTN = findViewById(R.id.combinationBTN);
        layoutAnimLL = findViewById(R.id.layoutAnimLL);

        // Моргание
        blinkButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
            imageView.startAnimation(animation);
        });

        // Вращение
        rotateButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
            imageView.startAnimation(animation);
        });

        // Выцветание
        fadeButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
            imageView.startAnimation(animation);
        });

        // Движение
        moveButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
            imageView.startAnimation(animation);
        });

        // Слайд
        slideButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
            imageView.startAnimation(animation);
        });

        // Увеличение
        zoomButton.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
            imageView.startAnimation(animation);
        });

        // Очистка анимации
        stopButton.setOnClickListener(v -> imageView.clearAnimation());

        combinationBTN.setOnClickListener(v -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.combination);
            layoutAnimLL.startAnimation(animation);
        });
    }
}