package com.example.foodmood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MenuMakanan extends AppCompatActivity {

    Spinner pembayaran;
    public String tipe [] = {"- Tipe Pembayaran -", "Tunai", "Kartu Kredit", "QRis", "e-Money"};

    int angka1 = 0;
    int angka2 = 0;
    int angka3 = 0;
    int itm = 0;
    int price = 0;
    int p1 = 151250;
    int p2 = 122712;
    int p3 = 128562;
    TextView angkakounter1;
    TextView angkakounter2;
    TextView angkakounter3;
    TextView totalitem;
    TextView totalprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        angkakounter1 = findViewById(R.id.kounter1);
        angkakounter2 = findViewById(R.id.kounter2);
        angkakounter3 = findViewById(R.id.kounter3);
        totalitem = findViewById(R.id.txt_item);
        totalprice = findViewById(R.id.txt_price);

        pembayaran = (Spinner) findViewById(R.id.bayar);
        ArrayAdapter adapter = new ArrayAdapter(MenuMakanan.this, R.layout.support_simple_spinner_dropdown_item, tipe);
        pembayaran.setAdapter(adapter);
    }

    public void BACK(View view) {
        Intent intent = new Intent(MenuMakanan.this,MainActivity.class);
        startActivity(intent);
    }

    public void plusclick1(View view) {
        angka1 = angka1 + 1;
        itm = itm + 1;
        angkakounter1.setText(Integer.toString(angka1));
        totalitem.setText(Integer.toString(itm));
        int prc1 = Integer.parseInt(angkakounter1.getText().toString());
        int prc2 = Integer.parseInt(angkakounter2.getText().toString());
        int prc3 = Integer.parseInt(angkakounter3.getText().toString());
        Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
        totalprice.setText(txt_price.toString());
    }

    public void minclick1(View view) {
        if (angka1 <= 0){
            angka1 = 0;
        }else {
            angka1 = angka1 - 1;
            itm = itm - 1;
            totalitem.setText(Integer.toString(itm));
            angkakounter1.setText(Integer.toString(angka1));
            int prc1 = Integer.parseInt(angkakounter1.getText().toString());
            int prc2 = Integer.parseInt(angkakounter2.getText().toString());
            int prc3 = Integer.parseInt(angkakounter3.getText().toString());
            Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
            totalprice.setText(txt_price.toString());
        }
    }

    public void plusclick2(View view) {
        angka2 = angka2 + 1;
        itm = itm + 1;
        angkakounter2.setText(Integer.toString(angka2));
        totalitem.setText(Integer.toString(itm));
        int prc1 = Integer.parseInt(angkakounter1.getText().toString());
        int prc2 = Integer.parseInt(angkakounter2.getText().toString());
        int prc3 = Integer.parseInt(angkakounter3.getText().toString());
        Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
        totalprice.setText(txt_price.toString());
    }

    public void minclick2(View view) {
        if (angka2 <= 0){
            angka2 = 0;
        }else {
            angka2 = angka2 - 1;
            itm = itm - 1;
            totalitem.setText(Integer.toString(itm));
            angkakounter2.setText(Integer.toString(angka2));
            int prc1 = Integer.parseInt(angkakounter1.getText().toString());
            int prc2 = Integer.parseInt(angkakounter2.getText().toString());
            int prc3 = Integer.parseInt(angkakounter3.getText().toString());
            Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
            totalprice.setText(txt_price.toString());
        }
    }

    public void plusclick3(View view) {
        angka3 = angka3 + 1;
        itm = itm + 1;
        angkakounter3.setText(Integer.toString(angka3));
        totalitem.setText(Integer.toString(itm));
        int prc1 = Integer.parseInt(angkakounter1.getText().toString());
        int prc2 = Integer.parseInt(angkakounter2.getText().toString());
        int prc3 = Integer.parseInt(angkakounter3.getText().toString());
        Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
        totalprice.setText(txt_price.toString());
    }

    public void minclick3(View view) {
        if (angka3 <= 0){
            angka3 = 0;
        }else {
            angka3 = angka3 - 1;
            itm = itm - 1;
            totalitem.setText(Integer.toString(itm));
            angkakounter3.setText(Integer.toString(angka3));
            int prc1 = Integer.parseInt(angkakounter1.getText().toString());
            int prc2 = Integer.parseInt(angkakounter2.getText().toString());
            int prc3 = Integer.parseInt(angkakounter3.getText().toString());
            Integer txt_price = ((prc1*p1) + (prc2*p2) + (prc3*p3));
            totalprice.setText(txt_price.toString());
        }
    }

    public void CART(View view) {
        Intent intent = new Intent(MenuMakanan.this, cart.class);
        startActivity(intent);
    }
}