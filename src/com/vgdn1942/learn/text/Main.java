package com.vgdn1942.learn.text;

public class Main {
    public static void main(String[] args) {

        Word word = new Word("Pangram");
        Text text = new Text(word);

        Word word1 = new Word("The");
        Word word2 = new Word("quick");
        Word word3 = new Word("brown");
        Word word4 = new Word("fox");
        Word word5 = new Word("jumps");
        Word word6 = new Word("over");
        Word word7 = new Word("the");
        Word word8 = new Word("lazy");
        Word word9 = new Word("dog");

        Sentence sentence = new Sentence();
        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);
        sentence.addWord(word4);
        sentence.addWord(word5);
        sentence.addWord(word6);
        sentence.addWord(word7);
        sentence.addWord(word8);
        sentence.addWord(word9);

        text.addBody(sentence);

        System.out.println("Head: " + text.getHeader());
        System.out.println("Body: " + text.getBody());
    }
}
