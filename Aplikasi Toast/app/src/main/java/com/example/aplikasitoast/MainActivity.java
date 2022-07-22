package com.example.aplikasitoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int angka = 0;
    TextView angkakounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkakounter = findViewById(R.id.kounter);
    }

    public void ToastClick(View view) {
        Toast.makeText(this, "Ini Aplikasi Toast", Toast.LENGTH_LONG).show();
    }

    public void CountClick(View view) {
        angka = angka + 1;
        angkakounter.setText(Integer.toString(angka));
    }
}