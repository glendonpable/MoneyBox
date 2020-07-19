package com.fmpdroid.moneybox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CreateMoneyBox extends AppCompatActivity {

    private static String PREFERENCE = "moneybox_preference"; //temp variable
    private static String TEMP_CHECK = "moneybox_isEmpty"; //temp variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_money_box);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title_activity_create_money_box);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    public void createMoneyBox(View v){

        Toast.makeText(CreateMoneyBox.this, "No no no", Toast.LENGTH_SHORT).show(); //temp
        /*
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(PREFERENCE, 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(TEMP_CHECK, false);
        editor.commit();

        Intent intent = new Intent(CreateMoneyBox.this, MainActivity.class);
        startActivity(intent);
        */
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}