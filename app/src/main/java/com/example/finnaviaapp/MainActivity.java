package com.example.finnaviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.finnaviaapp.Network.FinnaviaRequester;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FinnaviaRequester fr = new FinnaviaRequester();
        fr.loadData();
    }
}
