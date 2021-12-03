package com.zybooks.memorygame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class start_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
    }


    //animation to go to game
    public void intentA(View view) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.slide_in_right,  R.anim.no_animation);
    }


    //goes to info page
    public void intentC(View view){
        startActivity(new Intent(this, settings.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.no_animation);
    }

}