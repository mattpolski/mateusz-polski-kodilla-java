package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Decorating some words...");
        poemBeautifier.beautify("Chair", text -> "AAA" + text);
        poemBeautifier.beautify("Table", text -> text.toUpperCase());
        poemBeautifier.beautify("BED", text -> text.toLowerCase());
        poemBeautifier.beautify("aaaDESKaaa", text -> text.substring(3,7));

    }
}