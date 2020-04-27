package com.codewithcolin.iterator;

public class ArrayIterator implements Iterator<String> {

    private BrowseHistory browseHistory;
    private int currentIndex;
    private int arraySize;

    public ArrayIterator(BrowseHistory browseHistory) {
        this.browseHistory = browseHistory;
        this.currentIndex = 0;
        this.arraySize = browseHistory.getUrls().getDataArray().length;
    }

    @Override
    public void add(String item) {
        browseHistory.getUrls().getDataArray()[currentIndex] = item;
    }

    @Override
    public boolean hasNext() {
        return ( currentIndex < arraySize );
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public String current() {
        return browseHistory.getUrls().getDataArray()[currentIndex];
    }

}
