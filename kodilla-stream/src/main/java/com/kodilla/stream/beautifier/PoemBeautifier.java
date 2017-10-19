package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToImprove, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(textToImprove);
        System.out.println(decoratedText);
    }
}
