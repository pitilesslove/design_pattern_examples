package com.codewithcolin.momento.practice;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("content1");
        document.setFontName("font1");
        document.setFontSize(11);
        history.push( document.createState() );
        System.out.println("document  " + document);
        document.setContent("content2");
        document.setFontName("font2");
        document.setFontSize(12);
        history.push( document.createState() );
        System.out.println("document  " + document);
        document.backToBefore(history.pop());
        System.out.println("document  " + document);

    }

}
