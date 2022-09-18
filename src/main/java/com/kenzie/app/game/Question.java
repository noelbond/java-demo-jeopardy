package com.kenzie.app.game;

import com.kenzie.app.data.DTO.ClueDTO;

import java.util.List;

public class Question {
    ClueDTO questionDTO;

    public ClueDTO getQuestionDTO() {
        return questionDTO;
    }

    public void setQuestionDTO(ClueDTO questionDTO) {
        this.questionDTO = questionDTO;
    }

    public ClueDTO getQuestionDTO(String catTitle, List<ClueDTO> clueList) {
        for (int i = 0; i < clueList.size(); i++) {
            if (clueList.get(i).getCategory().getTitle().equalsIgnoreCase(catTitle)) {
                questionDTO = (clueList.get(i));
            }
        }
        return questionDTO;
    }
}
