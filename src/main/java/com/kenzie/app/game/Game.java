package com.kenzie.app.game;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenzie.app.CustomHttpClient;
import com.kenzie.app.data.DTO.ClueDTO;

import java.util.*;

import com.kenzie.app.game.Categories;
import com.kenzie.app.game.Question;
import com.kenzie.app.game.Answer;

public class Game {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Jeopardy! We will ask 10 questions. See if you can get them all correct. To start, choose a category");

            for (int i = 0; i < 10; i++) {
                List<ClueDTO> categoriesList = new ArrayList<>();
                Categories.getCategoyList(categoriesList);
                String catTitle = scanner.nextLine();
                Question question = new Question();
                System.out.println(question.getQuestionStr(catTitle, categoriesList));
                String userAnswer = scanner.nextLine();
                Answer answer = new Answer();
                answer.checkAnswer(userAnswer, question, categoriesList);
                System.out.println("Choose another category.");
            }

            System.out.println("Thank you for playing. Your final score is: ");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
