package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int likes = 0;


    public void like(View view){
        TextView wynik = findViewById(R.id.wynik);
        likes++;
        wynik.setText(likes + " Polubień");
    }

    public void dislike(View view){
        TextView wynik = findViewById(R.id.wynik);
        if(likes>0){
            likes--;
            wynik.setText(likes + " Polubień");
        }
    }
}