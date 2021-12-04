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
    }

    public void startEasyLevel(View view){
        Intent i= new Intent(getApplicationContext(), LevelOne.class);
        startActivity(i);
    }

    public void startMediumLevel(View view){
        Intent i= new Intent(getApplicationContext(), Level_Two.class);
        startActivity(i);
    }

    public void startHardLevel(View view){
        Intent i= new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }


}