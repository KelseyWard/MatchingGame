package com.zybooks.matchinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseLevel extends AppCompatActivity {

    Button mainMenu;
    Button easyLevel;
    Button mediumLevel;
    Button hardLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);

        mainMenu= findViewById(R.id.MainMenuButton);
        easyLevel= findViewById(R.id.easyLevel);
        mediumLevel= findViewById(R.id.mediumLevel);
        hardLevel= findViewById(R.id.hardLevel);
    }

    public void startMainMenu(View view){
        Intent i= new Intent(getApplicationContext(), title_screen.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_left, R.anim.no_animation);
    }

    public void startEasyLevel(View view){
        Intent i= new Intent(getApplicationContext(), EasyLevel.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.no_animation);
    }

    public void startMediumLevel(View view){
        Intent i= new Intent(getApplicationContext(), MediumLevel.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.no_animation);
    }

    public void startHardLevel(View view){
        Intent i= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.no_animation);
    }


}