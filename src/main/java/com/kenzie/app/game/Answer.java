package com.kenzie.app.game;

import com.kenzie.app.data.DTO.ClueDTO;
import com.kenzie.app.game.Question;

import java.util.List;

public class Answer {
    public void checkAnswer(String userAnswer, Question question, List<ClueDTO> clueList) {
        String correctAnswer = "";
        for (int i = 0; i < clueList.size(); i++) {
            if (clueList.get(i).getQuestion().equalsIgnoreCase(question.getQuestionDTO().getQuestion())) {
                correctAnswer = clueList.get(i).getAnswer().toString();
            }
        }
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            System.out.println("Correct! Your score is: ");
        } else {
            System.out.println("Sorry. That is incorrect. The correct answer is: " + correctAnswer + "\n" + "Your score is still: ");
        }
    }
}
