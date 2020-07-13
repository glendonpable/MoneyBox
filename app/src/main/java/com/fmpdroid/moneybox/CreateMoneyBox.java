package com.fmpdroid.moneybox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class CreateMoneyBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_money_box);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        //toolbar.set("");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("test");
        //toolbar.set(true);

    }


}