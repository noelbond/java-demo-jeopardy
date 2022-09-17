package com.kenzie.app.data.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClueDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("question")
    private String question;
    @JsonProperty("category")
    private Category category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Category {
        @JsonProperty("id")
        private String id;
        @JsonProperty("title")
        private String title;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
//    {
//        "clues": [
//        {
//            "id": 1,
//                "answer": "sheep",
//                "question": "Let's all flock to read Psalm 95, in which humans are compared to these animals",
//                "value": 200,
//                "categoryId": 1,
//                "gameId": 1,
//                "invalidCount": 0,
//                "category": {
//            "id": 1,
//                    "title": "THE OLD TESTAMENT",
//                    "canon": true
//        },
//            "game": {
//            "aired": "2004-09-06",
//                    "canon": true
//        },
//            "canon": true
//        }
}
