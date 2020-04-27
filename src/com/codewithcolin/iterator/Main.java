package com.codewithcolin.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();

        history.push("a site");
        history.push("b site");
        history.push("c site");

        history.createIterator();
        Iterator iterator = history.getIterator();
        while(iterator.hasNext()) {
            System.out.println(" :" + iterator.current());
            iterator.next();
        }
    }
}
