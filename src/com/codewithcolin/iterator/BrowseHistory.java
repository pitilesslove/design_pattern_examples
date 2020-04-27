package com.codewithcolin.iterator;

public class BrowseHistory {

    private DataCollection urls;

    private Iterator<String> iterator;

    public BrowseHistory() {
        urls = new DataCollection();
        createIterator();
    }

    public Iterator<String> getIterator() {
        return iterator;
    }

    public void createIterator() {
        //iterator = new ArrayIterator(this);
        iterator = new ListIterator(this);
    }

    public void push(String url) {
        iterator.add(url);
        iterator.next();
    }

    public DataCollection getUrls() {
        return urls;
    }

    public void setUrls(DataCollection urls) {
        this.urls = urls;
    }
}
