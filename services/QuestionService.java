package com.ilp.services;

import com.ilp.entity.QuestionWithTextOptions;
import com.ilp.interfaces.DisplayQuestion;
import com.ilp.interfaces.PlayAudio;
import com.ilp.interfaces.QuestionResult;

public class QuestionService implements QuestionResult, DisplayQuestion {
	private QuestionWithTextOptions question;

	public QuestionService(QuestionWithTextOptions question) {
		this.question = question;
	}

	@Override
	public void checkAnswer(String userAnswer) {
		System.out.println("Checking answer");
	}

	@Override
	public void skipAnswer() {
		System.out.println("Skipping answer Checking");
	}

	@Override
	public void displayQuestion() {
		System.out.println(question.getQuestionText());
	}

}
