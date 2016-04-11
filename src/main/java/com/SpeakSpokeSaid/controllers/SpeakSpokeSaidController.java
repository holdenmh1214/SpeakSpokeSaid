package com.SpeakSpokeSaid.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by holdenhughes on 2/22/16.
 */
@RestController
public class SpeakSpokeSaidController {


    @RequestMapping("/submitSpeech")
    public int Submit(String finalTranscript) {

        int likes=0;
        int ums = 0;
        int youKnows=0;
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

        return likes + ums + youKnows;
    }

}

