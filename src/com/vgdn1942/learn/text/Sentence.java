package com.vgdn1942.learn.text;

public class Sentence {
    private String sentence = "";

    public String getSentence() {
        return sentence;
    }

    public void addWord(Word word) {
        sentence += " " + word.getWord();
    }
}
