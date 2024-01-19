package com.ilp.services;

import com.ilp.entity.QuestionWithTextOptions;
import com.ilp.interfaces.PlayAudio;

public class QuestionServiceWithAudio extends QuestionService implements PlayAudio {
    public QuestionServiceWithAudio(QuestionWithTextOptions question) {
        super(question);
    }
    @Override
    public void playAudio(String questionText) {
        System.out.println("Playing audio for: " + questionText);
    }
}

