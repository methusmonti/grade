package com.montivory.grade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Grade g = new Grade();

        System.out.print("Enter a Score: ");

        // input score
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        // parse score to integer
        int score = Integer.parseInt(input);

        // calculate result
        String result = g.calculateGrade(score);

        // display result
        System.out.println("Score = "+score+" | Grade = "+result);
    }
}
