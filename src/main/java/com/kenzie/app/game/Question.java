package com.kenzie.app.game;

import com.kenzie.app.data.DTO.ClueDTO;

import java.util.List;

public class Question {
    //gets response from user and gets question
    String questionStr;

    public void setQuestionStr(String questionStr) {
        this.questionStr = questionStr;
    }

    public String getQuestionStr(String catTitle, List<ClueDTO> clueList) {
        String question = "";
        for (int i = 0; i < clueList.size(); i++) {
            if (clueList.get(i).getCategory().getTitle().equalsIgnoreCase(catTitle)) {
                question = (clueList.get(i).getQuestion());
            }
        }
        return question;
    }
}
