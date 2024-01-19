package com.ilp.utility;

import com.ilp.entity.ChallengeAssist;
import com.ilp.entity.ChallengeDialogue;
import com.ilp.entity.OptionText;
import com.ilp.services.QuestionService;
import com.ilp.services.QuestionServiceWithAudio;

import java.util.Arrays;

public class QuestionUtility {
    public static void main(String[] args) {
        OptionText optionOne = new OptionText("danke");
        OptionText optionTwo = new OptionText("ja");
        OptionText optionThree = new OptionText("kaffee");

        ChallengeAssist challengeAssist = new ChallengeAssist("Translate Thank you", 2, Arrays.asList(optionOne, optionTwo, optionThree));

        QuestionService questionService = new QuestionService(challengeAssist);
        questionService.displayQuestion();

        // Checking answer
        String userAnswer = "ja";
        questionService.checkAnswer(userAnswer);

        // Skipping answer
        questionService.skipAnswer();
        
        System.out.println("\n");
        
        ChallengeDialogue challengeDialogue = new ChallengeDialogue("How Are You", 2, Arrays.asList(optionOne, optionTwo, optionThree));

        QuestionServiceWithAudio questionServiceAudio = new QuestionServiceWithAudio(challengeDialogue);
        questionServiceAudio.playAudio(challengeDialogue.getQuestionText());

        // Checking answer
        userAnswer = "ja";
        questionServiceAudio.checkAnswer(userAnswer);

        // Skipping answer
        questionServiceAudio.skipAnswer();
  
        
    }
}

