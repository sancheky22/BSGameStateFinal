package com.example.bsgamestatefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 **/

public class MainActivity extends AppCompatActivity {

    private EditText multiLineText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiLineText = (EditText) findViewById(R.id.multi_line_text);
        Button runTestButton = (Button) findViewById(R.id.run_test_button);

        runTestButton.setOnClickListener(runTestListener); //set onClick listener for button

    }

    /**
     * runTestListener: listener for run test button
     **/
    private OnClickListener runTestListener = new OnClickListener() {
        public void onClick(View v) {
            /**
             External Citation
             Date: 23 October 2019
             Problem: Adding a multiline EditText
             Resource:
             https://stackoverflow.com/questions/4233626/allow-multi-line-in-edittext-view-in-android
             https://developer.android.com/reference/android/widget/EditText
             Solution: I used the example code from this post.
             */
            multiLineText.setText(""); //clear text from EditText

            BSGameState firstInstance = new BSGameState(); //create GameState instance using default constructor
            BSGameState secondInstance = new BSGameState(firstInstance); //create copy of firstInstance

            //call each method in game state class at least once, print descriptions to multiLineText
            firstInstance.getPlayerID();
            multiLineText.append("getPlayerTurn(): Get whether it is player1's turn or player2's turn.\n");
            firstInstance.setPlayerID(0);
            multiLineText.append("setPlayerTurn(): Set the current turn to 0 (or player1)\n");
            //call addShip method to add a ship
            firstInstance.addAllShips(0);
            firstInstance.p1Board[1][1].setSpot(2);
            multiLineText.append("addAllShips(): Place all ships on the board for player 1 in initial locations and horizontally:\n");
            multiLineText.append("Place carrier row 1, place destroyer row 2, place cruiser row 3, place submarine row 4.\n");

            firstInstance.setPlayerID(1);
            firstInstance.p2Board[1][1].setSpot(2);
            multiLineText.append("setPlayerTurn(): Set the current turn to 1 (or player2)\n");
            firstInstance.addAllShips(1);
            multiLineText.append("addAllShips(): Place all ships on the board for player 2 in initial locations and horizontally:\n");
            multiLineText.append("Place carrier row 1, place destroyer row 2, place cruiser row 3, place submarine row 4.\n");
            //call fire method to hit ship
            firstInstance.setPlayerID(0);
            firstInstance.fire(1, 1);
            multiLineText.append("Fire at coordinates 1,1. Changes values of location.\n");
            //call spotString
            String check1 = firstInstance.spotString(1, 1, firstInstance.getPlayerID());
            multiLineText.append("Check coordinates 1,1.\n");
            multiLineText.append(check1 + "\n");
            BSGameState thirdInstance = new BSGameState(); //create another GameState instance using default constructor
            BSGameState fourthInstance = new BSGameState(thirdInstance); //create copy of thirdInstance

            String instance2String = secondInstance.toString(); //call toString on secondInstance
            String instance4String = fourthInstance.toString(); //call toString on fourthInstance
            //verify both toString calls are identical, print both strings to multiLineText
            boolean equals = instance2String.equals(instance4String); //check if instance 2 is the same as instance 4
            if (equals) {
                multiLineText.append("SecondInstance: \n");
                multiLineText.append(instance2String + "\n");
                multiLineText.append("FourthInstance: \n");
                multiLineText.append(instance4String + "\n");
            } else {
                multiLineText.append("Error: instances 2 and 4 do not match.\n");
            }

        }
    };

}
