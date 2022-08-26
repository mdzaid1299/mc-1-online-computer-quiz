package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String[] nameOfSchool, String[] scores) {
        int[] newScores = new int[scores.length];
        String value = "";
        try {


            for (int i = 0; i < scores.length; i++) {
                newScores[i] = Integer.parseInt(scores[i]);
            }
            int maxScore = 0;

            for (int i = 0; i < nameOfSchool.length; i++) {
                if (newScores[i] > maxScore) {
                    maxScore = newScores[i];
                    value = nameOfSchool[i];
                }

            }
        } catch (NumberFormatException e) {
            value = e.toString();
        }
        return value;

    }

    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String[] name) {
        String[] upperCase = new String[name.length];

        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return upperCase;
    }
}