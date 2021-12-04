package com.zybooks.matchinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class information extends AppCompatActivity {

    Button mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mainMenu= findViewById(R.id.menuButton);
    }


    public void startMainMenu(View view){
        Intent i= new Intent(getApplicationContext(), title_screen.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.no_animation);
    }
}