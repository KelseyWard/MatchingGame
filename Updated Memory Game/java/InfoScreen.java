package com.zybooks.matchinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoScreen extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);


        button = (Button) findViewById(R.id.menuButton);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openGameScreen();

        }
    });

}
    public void openGameScreen() {
        Intent intent = new Intent(this, GameScreen.class);
        startActivity(intent);
    }
}