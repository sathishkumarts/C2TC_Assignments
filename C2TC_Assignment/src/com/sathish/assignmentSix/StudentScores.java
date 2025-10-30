package com.sathish.assignmentSix;

import java.util.ArrayList;

public class StudentScores {
    private int[] scores;

    // Constructor to initialize array
    public StudentScores(int[] scores) {
        this.scores = scores;
    }

    // Method to convert array to ArrayList
    public ArrayList<Integer> getScoresList() {
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }
        return scoreList;
    }
}
