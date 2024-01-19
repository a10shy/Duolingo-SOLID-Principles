package com.ilp.entity;

import java.util.List;

public class ChallengeDialogue extends QuestionWithTextOptions {
    public ChallengeDialogue(String questionText, int correctIndex, List<OptionText> options) {
        super(questionText, correctIndex, options);
    }
}

