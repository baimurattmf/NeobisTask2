package com.example.android.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onePointTeamA(View view) {
        teamAScore+=1;
        display(teamAScore);
    }

    private void display(int teamAScore) {
        TextView teamAValue = findViewById(R.id.teamAValue);
        teamAValue.setText("" + teamAScore);

    }

    public void twoPointTeamA(View view) {
        teamAScore+=2;
        display(teamAScore);
    }

    public void threePointTeamA(View view) {
        teamAScore+=3;
        display(teamAScore);
    }

    public void onePointTeamB(View view) {
        teamBScore+=1;
        displayB(teamBScore);

    }

    private void displayB(int teamBScore) {
        TextView teamBValue = findViewById(R.id.teamBValue);
        teamBValue.setText("" + teamBScore);

    }

    public void twoPointTeamB(View view) {
        teamBScore+=2;
        displayB(teamBScore);
    }

    public void threePointTeamB(View view) {
        teamBScore+=3;
        displayB(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        display(teamAScore);
        display(teamBScore);
    }
}
