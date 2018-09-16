package com.geophysics_consulting.myfirstdicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollingButton;
        rollingButton = findViewById(R.id.roll_button);

        final ImageView leftdice = findViewById(R.id.image_leftDice);
        final ImageView rightdice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rollingButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("Dicee", "Ze button has been pressed");
            Random randomNumberGenerator = new Random();

            int number = randomNumberGenerator.nextInt(6);

            Log.d("Dicee", "The random number is:" + number);

            leftdice.setImageResource(diceArray[number]);

            number = randomNumberGenerator.nextInt(6);

            rightdice.setImageResource(diceArray[number]);
        }
    });
    }
}
