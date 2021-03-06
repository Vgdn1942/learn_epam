package com.vgdn1942.learn.text;

public class Text {
    private final String header;
    private String body = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence sentence) {
        header = sentence.getSentence();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence) {
        body += " " + sentence.getSentence();
    }

    public String getBody() {
        return body;
    }
}
