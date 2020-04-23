package com.codewithcolin.iterator.problem;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a site");
        browseHistory.push("b site");
        browseHistory.push("c site");

        for( var i = 0; i<browseHistory.getUrls().size();i++) {
            var url = browseHistory.getUrls().get(i);
            System.out.println("url = " + url);
        }

        System.out.println("if....data structure of url had been changed..?");
        // you can have to change for loop.
    }
}
