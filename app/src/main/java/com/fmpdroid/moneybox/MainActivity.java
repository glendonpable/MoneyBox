package com.fmpdroid.moneybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabAddMoneyBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAddMoneyBox = findViewById(R.id.fabAddMoneyBox);
    }

    public void addMoneyBox(View v){
        setContentView(R.layout.activity_create_money_box);
    }
}