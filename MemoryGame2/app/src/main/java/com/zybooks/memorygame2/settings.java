package com.zybooks.memorygame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    //goes back to main menu
    public void intentB(View view) {
        startActivity(new Intent(this, start_menu.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.no_animation);
    }
}