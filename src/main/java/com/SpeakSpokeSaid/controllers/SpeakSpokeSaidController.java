package com.SpeakSpokeSaid.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by holdenhughes on 2/22/16.
 */
@RestController
public class SpeakSpokeSaidController {
    int likes=0;
    int ums = 0;
    int youKnows=0;


    @RequestMapping("/submitSpeech")
    public void Submit(String finalTranscript) {
        String[] words = finalTranscript.split(" ");
        for (int i=0; i <= words.length-1; i++ ) {
            if (words[i].toLowerCase().contains("like")){
                likes++;
            } else if (words[i].toLowerCase().contains("um")){
                ums++;
            } else if (words[i].toLowerCase().contains("you") && words[i+1].toLowerCase().contains("know")){
                youKnows++;
            }
        }
        System.out.println("number of 'likes'' "+likes);
        System.out.println("number of 'ums' "+ums);
        System.out.println("number of 'you knows' "+youKnows);
        likes =0;
        ums =0;
        youKnows =0;
    }

}

