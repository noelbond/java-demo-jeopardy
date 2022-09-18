package com.kenzie.app;

// import necessary libraries


import com.kenzie.app.data.DTO.ClueDTO;
import com.kenzie.app.game.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!

     */


    public static void main(String[] args)  {
        //Write main execution code here
        try {
            System.out.println("Welcome to Jeopardy! We will ask 10 questions. See if you can get them all correct");

            Answer answer = new Answer();
            Score score = new Score();
            List<ClueDTO> categoriesList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("\n" + "Choose a category");
                Categories.getCategoyList(categoriesList);
                String catTitle = scanner.nextLine();
                Question question = new Question();
                try {
                    System.out.println("\n" + "Category: " + question.getQuestionDTO(catTitle, categoriesList).getCategory().getTitle() + "\n" + "Question: "+question.getQuestionDTO(catTitle, categoriesList).getQuestion());
                } catch (Exception e) {
                    System.out.println("Sorry that is not a valid Category");
                }
                String userAnswer = scanner.nextLine();
                answer.checkAnswer(userAnswer, question, categoriesList);
                score.updateScore(userAnswer, question, categoriesList);
                System.out.println(score.getScore());
                categoriesList.clear();
                ;
            }

            System.out.println("Thank you for playing. Your final score is: " + score.getScore());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

