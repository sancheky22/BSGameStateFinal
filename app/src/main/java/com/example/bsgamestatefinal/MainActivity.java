package com.example.bsgamestatefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

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

    /** runTestListener: listener for run test button **/
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
            firstInstance.getPlayerTurn();
            multiLineText.append("getPlayerTurn(): Get whether it is player1's turn or player2's turn.\n");
            firstInstance.setPlayerTurn(0);
            multiLineText.append("setPlayerTurn(): Set the current turn to 0 (or player1)\n");


            BSGameState thirdInstance = new BSGameState(); //create another GameState instance using default constructor
            BSGameState fourthInstance = new BSGameState(thirdInstance); //create copy of thirdInstance

            String instance2String = secondInstance.toString(); //call toString on secondInstance
            String instance4String = fourthInstance.toString(); //call toString on fourthInstance

            //verify both toString calls are identical, print both strings to multiLineText
            boolean equals = instance2String.equals(instance4String); //check if instance 2 is the same as instance 4
            if (equals){
                multiLineText.append("SecondInstance: \n");
                multiLineText.append(instance2String +"\n");
                multiLineText.append("FourthInstance: \n");
                multiLineText.append(instance4String +"\n");
            } else{
                multiLineText.append("Error: instances 2 and 4 do not match.\n");
            }

        }
    };

}
