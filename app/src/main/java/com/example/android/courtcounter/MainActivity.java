package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method INCREASES!!!! score by 3
    public void displayForpoint_three(View view){
        score = score + 3;
        displayForTeamA(score);
    }

    //this method increases score by 2
    public void displayForpoint_two(View view){
        score = score + 2;
        displayForTeamA(score);
    }

    //this method increases score by 1
    public void displayForpoint_one(View view){
        score = score + 1;
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoredisplay) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoredisplay));
    }



    //this method INCREASES!!!! score by 3
    public void displayForpoint_three2(View view){
        score2 = score2 + 3;
        displayForTeamA2(score2);
    }

    //this method increases score by 2
    public void displayForpoint_two2(View view){
        score2 = score2 + 2;
        displayForTeamA2(score2);
    }

    //this method increases score by 1
    public void displayForpoint_one2(View view){
        score2 = score2 + 1;
        displayForTeamA2(score2);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA2(int scoredisplay) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score2);
        scoreView.setText(String.valueOf(scoredisplay));
    }
    public void reset(View view){
        score = 0;
        score2 = 0;
        displayForTeamA(score);
        displayForTeamA2(score2);

    }
}
