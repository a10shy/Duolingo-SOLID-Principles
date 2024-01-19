package com.ilp.entity;

import java.util.List;

public abstract class QuestionBase {
    private String questionText;
    private int correctIndex;

    public QuestionBase(String questionText, int correctIndex) {
        this.questionText = questionText;
        this.correctIndex = correctIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCorrectIndex(int correctIndex) {
        this.correctIndex = correctIndex;
    }
}

