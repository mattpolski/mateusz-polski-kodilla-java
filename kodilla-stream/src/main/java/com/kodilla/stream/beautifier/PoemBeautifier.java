package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("Word: " + "'"+text+"'" + " has been beautified and now looks like this: " + result);
    }
}
