package com.kenzie.app.game;

import com.kenzie.app.data.DTO.ClueDTO;

import java.util.List;

public class Score {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void updateScore(String userAnswer, Question question, List<ClueDTO> clueList) {
        for (int i = 0; i < clueList.size(); i++) {
            String correctAnswer = "";
            if (clueList.get(i).getQuestion().equalsIgnoreCase(question.getQuestionDTO().getQuestion())) {
                correctAnswer = clueList.get(i).getAnswer().toString();
            }
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
    }
}
