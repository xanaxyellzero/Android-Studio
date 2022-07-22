package com.example.foodmood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cart extends AppCompatActivity {

    ListView list;

    public String dataUser [] = {"Nama : ", "Caezar Brian R. S", "Alamat : ", "Jalan Klentengsari no. 11f", "Nomor Telefon : ", "082220263772"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        list = (ListView) findViewById(R.id.info);

        ArrayAdapter adapter = new ArrayAdapter(cart.this,R.layout.support_simple_spinner_dropdown_item,dataUser);
        list.setAdapter(adapter);
    }

    public void BACK(View view) {
        Intent intent = new Intent(cart.this, MenuMakanan.class);
        startActivity(intent);
    }
}