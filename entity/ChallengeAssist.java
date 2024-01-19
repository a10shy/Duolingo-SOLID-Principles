package com.ilp.entity;

import java.util.List;

public class ChallengeAssist extends QuestionWithTextOptions {
    public ChallengeAssist(String questionText, int correctIndex, List<OptionText> options) {
        super(questionText, correctIndex, options);
    }
}
