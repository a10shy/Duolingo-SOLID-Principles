package com.ilp.entity;

import java.util.List;

public class QuestionWithTextOptions extends QuestionBase {
    private List<OptionText> options;

    public QuestionWithTextOptions(String questionText, int correctIndex, List<OptionText> options) {
        super(questionText, correctIndex);
        this.options = options;
    }

    public List<OptionText> getOptions() {
        return options;
    }

    public void setOptions(List<OptionText> options) {
        this.options = options;
    }
}

