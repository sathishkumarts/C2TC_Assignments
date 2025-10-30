package com.sathish.assignmentSix;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Create object for StudentScores
        StudentScores student = new StudentScores(scores);

        // Get ArrayList from class
        ArrayList<Integer> scoreList = student.getScoresList();

        // Display output
        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        sc.close();
    }
}
