package com.zybooks.memorygame2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
    private int microscope,atom,danger,rocket,science, astronaut,space,flower,math;
    private int clicked = 0;
    private boolean turnOver = false;
    private int lastClicked = -1;




    private void SetUp() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);

        space = R.drawable.space;
        microscope = R.drawable.microscope;
        atom =  R.drawable.atom;
        danger = R.drawable.danger;
        rocket = R.drawable.rocket;
        science = R.drawable.science;
        astronaut = R.drawable.astronaut;
        flower = R.drawable.flower;
        math = R.drawable.math;


    }


   //starts new game/activity
    public void onNewGameClick(View view) {
        finish();
        startActivity(getIntent());
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetUp();

        //creating lists for images and buttons
        final List<Integer> images = new ArrayList<>
                (Arrays.asList(microscope, atom, danger, rocket, science, astronaut,flower,math, microscope, atom, danger, rocket, science, astronaut, flower, math));


        final List<Button> buttons = new ArrayList<>
                (Arrays.asList(button1,button2,button3, button4, button5,button6, button7, button8,button9,button10, button11, button12, button13, button14, button15, button16 ));

//shuffling images
        Collections.shuffle(images);

        //looping through every button
        for (int i = 0; i <= 15; i++) {
            buttons.get(i).setText("cardBack");
            buttons.get(i).setTextSize(0.0F);
            final int finalI = i;
            buttons.get(i).setOnClickListener(v -> {


                //if text = cardback and turnover = false then it turns over
                if (buttons.get(finalI).getText() == "cardBack" && !turnOver){
                    buttons.get(finalI).setBackgroundResource(images.get(finalI));  //sets background to different image
                    buttons.get(finalI).setText(images.get(finalI));

                    //if click = 0 then it is the first card they clicked on
                    if (clicked == 0){
                        lastClicked = finalI;
                    }
                    clicked++;
                }

                //else statement to turn card back over to cardback
                else if (buttons.get(finalI).getText() != "cardBack" ){
                    //changes back to ocean image
                    buttons.get(finalI).setBackgroundResource(space); //changes back to cardback image
                    //changes hidden text back to cardBack
                    buttons.get(finalI).setText("cardBack");
                    clicked--;
                }


                if (clicked == 2) {
                   // have to flip them back over to continue the game if they are not matched
                    turnOver = true;

                    //getText is current card clicked and then compared with last card clicked
                    if (buttons.get(finalI).getText() == buttons.get(lastClicked).getText()) {
                        buttons.get(finalI).setEnabled(false);
                        buttons.get(lastClicked).setEnabled(false);
                        turnOver = false;
                        clicked = 0;
                    }
                }else if (clicked == 0){
                    turnOver = false;
                }
            });



        }

    }

}
