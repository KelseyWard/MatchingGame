package com.zybooks.matchinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class title_screen extends AppCompatActivity {

     Button game;
     Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        game= findViewById(R.id.startButton);
        info= findViewById(R.id.infoButton);


    }


    //animation to go to game
    public void startGameScreen(View view) {
        Intent i = new Intent(getApplicationContext(), chooseLevel.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right,  R.anim.no_animation);
    }


    public void startInfo(View view){
        Intent i= new Intent(getApplicationContext(), information.class);
        startActivity(i);
    }

}

