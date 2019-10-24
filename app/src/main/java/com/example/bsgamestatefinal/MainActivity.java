package com.example.bsgamestatefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

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
            multiLineText.setText(""); //clear text from EditText

            BSGameState firstInstance = new BSGameState(); //create GameState instance using default constructor
            BSGameState secondInstance = new BSGameState(firstInstance); //create copy of firstInstance

            //call each method in game state class at least once, print descriptions to multiLineText
            firstInstance.getPlayerTurn();
            multiLineText.append("Get whether it is player1's turn or player2's turn.\n");
            firstInstance.setPlayerTurn(0);
            multiLineText.append("Set the current turn to 0 (or player1)");


            BSGameState thirdInstance = new BSGameState(); //create another GameState instance using default constructor
            BSGameState fourthInstance = new BSGameState(thirdInstance); //create copy of thirdInstance

            secondInstance.toString(); //call toString on secondInstance
            fourthInstance.toString(); //call toString on fourthInstance

            //verify both toString calls are identical, print both strings to multiLineText

        }
    };

}
