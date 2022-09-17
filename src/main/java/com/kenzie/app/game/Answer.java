package com.kenzie.app.game;

import com.kenzie.app.data.DTO.ClueDTO;
import com.kenzie.app.game.Question;

import java.util.List;

public class Answer {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void checkAnswer(String userAnswer, Question question, List<ClueDTO> clueList) {
        int score = 0;
        String correctAnswer = "";
        for (int i = 0; i < clueList.size(); i++) {
            if (clueList.get(i).getQuestion().equalsIgnoreCase(question.questionStr)) {
                correctAnswer = clueList.get(i).getAnswer().toString();
            }
        }
        if (correctAnswer.equalsIgnoreCase(userAnswer)) {
            this.score++;
            System.out.println("Correct! Your score now is: " + score);
        } else {
            System.out.println("Sorry. That is incorrect. The correct answer is: " + correctAnswer + "\n" + "Your score is still: " + score);
        }
    }
}
