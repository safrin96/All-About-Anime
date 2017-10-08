/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.allaboutanime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int rightAnswer = 0;
    int wrongAnswer = 0;
    int nr_answered = 0;

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitQuiz(View view) {

        // Figure out if the user chooses q1a1
        CheckBox q1a1 = (CheckBox) findViewById(R.id.q1a1);
        boolean checkedQ1A1 = q1a1.isChecked();
        // Figure out if the user chooses q1a2
        CheckBox q1a2 = (CheckBox) findViewById(R.id.q1a2);
        boolean checkedQ1A2 = q1a2.isChecked();

        // Figure out if the user chooses q2a1
        CheckBox q2a1 = (CheckBox) findViewById(R.id.q2a1);
        boolean checkedQ2A1 = q2a1.isChecked();
        // Figure out if the user chooses q2a2
        CheckBox q2a2 = (CheckBox) findViewById(R.id.q2a2);
        boolean checkedQ2A2 = q2a2.isChecked();

        // Figure out if the user chooses q3a1
        CheckBox q3a1 = (CheckBox) findViewById(R.id.q3a1);
        boolean checkedQ3A1 = q3a1.isChecked();
        // Figure out if the user chooses q3a2
        CheckBox q3a2 = (CheckBox) findViewById(R.id.q3a2);
        boolean checkedQ3A2 = q3a2.isChecked();

        // Figure out if the user chooses q4a1
        CheckBox q4a1 = (CheckBox) findViewById(R.id.q4a1);
        boolean checkedQ4A1 = q4a1.isChecked();
        // Figure out if the user chooses q4a2
        CheckBox q4a2 = (CheckBox) findViewById(R.id.q4a2);
        boolean checkedQ4A2 = q4a2.isChecked();

        // Figure out if the user chooses q5a1
        CheckBox q5a1 = (CheckBox) findViewById(R.id.q5a1);
        boolean checkedQ5A1 = q5a1.isChecked();
        // Figure out if the user chooses q5a2
        CheckBox q5a2 = (CheckBox) findViewById(R.id.q5a2);
        boolean checkedQ5A2 = q5a2.isChecked();

        // Figure out if the user chooses q6a1
        CheckBox q6a1 = (CheckBox) findViewById(R.id.q6a1);
        boolean checkedQ6A1 = q6a1.isChecked();
        // Figure out if the user chooses q6a2
        CheckBox q6a2 = (CheckBox) findViewById(R.id.q6a2);
        boolean checkedQ6A2 = q6a2.isChecked();

        // Figure out if the user chooses q7a1
        CheckBox q7a1 = (CheckBox) findViewById(R.id.q7a1);
        boolean checkedQ7A1 = q7a1.isChecked();
        // Figure out if the user chooses q7a2
        CheckBox q7a2 = (CheckBox) findViewById(R.id.q7a2);
        boolean checkedQ7A2 = q7a2.isChecked();

        // Figure out if the user chooses q8a1
        CheckBox q8a1 = (CheckBox) findViewById(R.id.q8a1);
        boolean checkedQ8A1 = q8a1.isChecked();
        // Figure out if the user chooses q6a2
        CheckBox q8a2 = (CheckBox) findViewById(R.id.q8a2);
        boolean checkedQ8A2 = q8a2.isChecked();

        // Figure out if the user chooses q9a1
        CheckBox q9a1 = (CheckBox) findViewById(R.id.q9a1);
        boolean checkedQ9A1 = q9a1.isChecked();
        // Figure out if the user chooses q9a2
        CheckBox q9a2 = (CheckBox) findViewById(R.id.q9a2);
        boolean checkedQ9A2 = q9a2.isChecked();

        // Figure out if the user chooses q10a1
        RadioButton q10a1 = (RadioButton) findViewById(R.id.q10a1);
        boolean checkedQ10A1 = q10a1.isChecked();
        // Figure out if the user chooses q10a2
        RadioButton q10a2 = (RadioButton) findViewById(R.id.q10a2);
        boolean checkedQ10A2 = q10a2.isChecked();

        EditText Name = (EditText) findViewById(R.id.edit_name);
        Editable newName = Name.getText();

        // Display the order summary on the screen

        int total_point = calculatePoints(checkedQ1A1,checkedQ2A2,checkedQ3A2, checkedQ4A2,checkedQ5A2,checkedQ6A1,
                checkedQ7A2,checkedQ8A2,checkedQ9A1,checkedQ10A2, checkedQ1A2,checkedQ2A1,checkedQ3A1, checkedQ4A1,
                checkedQ5A1,checkedQ6A2,checkedQ7A1,checkedQ8A1,checkedQ9A2,checkedQ10A1);
        String endMessage = createQuizSummary(newName, total_point, rightAnswer, wrongAnswer, nr_answered);
        displaySubmitMessage(endMessage);
    }

    private int calculatePoints(boolean corAns1, boolean corAns2, boolean corAns3, boolean corAns4, boolean corAns5,
                                boolean corAns6, boolean corAns7, boolean corAns8, boolean corAns9, boolean corAns10,
                                boolean wrAns1, boolean wrAns2, boolean wrAns3, boolean wrAns4, boolean wrAns5,
                                boolean wrAns6, boolean wrAns7, boolean wrAns8, boolean wrAns9, boolean wrAns10) {
        if (corAns1) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns2) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns3) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns4) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns5) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns6) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns7) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns8) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns9) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (corAns10) {
            rightAnswer += 1;
            nr_answered += 1;
        } else if (wrAns1) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns2) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns3) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns4) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns5) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns6) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns7) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns8) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns9) {
            wrongAnswer += 1;
            nr_answered += 1;
        } else if (wrAns10) {
            wrongAnswer += 1;
            nr_answered += 1;
        }
        return nr_answered - wrongAnswer;
    }
    /***
     * This method displays the given price on the screen.
     */
    private void displaySubmitMessage(String message) {
        TextView pointTextView = (TextView) findViewById(R.id.point_text_view);
        pointTextView.setText(message);
    }

    /**
     Create summary of the quiz game.*/

    private String createQuizSummary(Editable name, int totalPoints, int right, int wrong, int nrAns) {
        String priceMessage = "Hi, " + name + " . Thank you for playing!";
        priceMessage += "\n" + "You have answered " + nrAns + " out of 10 questions";
        priceMessage += "\n" + "You have got " + totalPoints + " out of 10 points";
        priceMessage += "\n" + "You have " + right + " right and " + wrong + " wrong answers";
        return priceMessage;
    }

}