package com.example.foodmood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FOOD(View view) {
        Intent intent = new Intent(MainActivity.this,MenuMakanan.class);
        startActivity(intent);
    }

    public void DRINKS(View view) {
        Intent intent = new Intent(MainActivity.this,MenuMinuman.class);
        startActivity(intent);
    }
}