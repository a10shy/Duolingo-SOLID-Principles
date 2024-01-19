package com.ilp.entity;

import java.util.List;

public class ChallengeSelect extends QuestionWithImageOptions {
    public ChallengeSelect(String questionText, int correctIndex, List<OptionImage> options) {
        super(questionText, correctIndex, options);
    }
}

