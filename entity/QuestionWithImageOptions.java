package com.ilp.entity;

import java.util.List;

public class QuestionWithImageOptions extends QuestionBase {
    private List<OptionImage> options;

    public QuestionWithImageOptions(String questionText, int correctIndex, List<OptionImage> options) {
        super(questionText, correctIndex);
        this.options = options;
    }

    public List<OptionImage> getOptions() {
        return options;
    }

    public void setOptions(List<OptionImage> options) {
        this.options = options;
    }
}

