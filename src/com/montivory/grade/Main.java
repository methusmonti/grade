package com.montivory.grade;

public class Main {

    public static void main(String[] args) {
        Grade g = new Grade();

        int score = 50;

        // calculate result
        String result = g.calculateGrade(score);

        // display result
        System.out.println("Score = "+score+" | Grade = "+result);
    }
}
