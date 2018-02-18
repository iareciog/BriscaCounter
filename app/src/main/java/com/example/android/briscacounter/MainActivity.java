package com.example.android.briscacounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    static final String score_team_a = "TeamAScore";
    static final String score_team_b = "TeamBScore";

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt(score_team_a,scoreTeamA);
        savedInstanceState.putInt(score_team_b,scoreTeamB);

        super.onSaveInstanceState(savedInstanceState);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState!= null){
            scoreTeamA = savedInstanceState.getInt(score_team_a);
            scoreTeamB = savedInstanceState.getInt(score_team_b);
        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
        }
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /*
     * Display the Teams Score
     */
    private void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
     * Points of different cards
     * for Team A and Team B
     */
    public void aceTeamA(View view){
        scoreTeamA = scoreTeamA + 11;
        displayForTeamA(scoreTeamA);
    }

    public void threeTeamA(View view){
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    public void kingTeamA(View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void horseTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void jackTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void aceTeamB(View view){
        scoreTeamB = scoreTeamB + 11;
        displayForTeamB(scoreTeamB);
    }

    public void threeTeamB(View view){
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    public void kingTeamB(View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    public void horseTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void jackTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /*
     * Reset the Score for Start Again
     */

    public void resetScore (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}