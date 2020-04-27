package com.codewithcolin.iterator;

public class ListIterator implements Iterator<String> {

    private BrowseHistory browseHistory;
    private int currentIndex = 0;

    public ListIterator(BrowseHistory browseHistory) {
        this.browseHistory = browseHistory;
    }

    @Override
    public void add(String url) {
        browseHistory.getUrls().getDataList().add(url);
    }

    @Override
    public boolean hasNext() {
        if( currentIndex < browseHistory.getUrls().getDataList().size())
            return true;
        else
            return false;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public String current() {
        return browseHistory.getUrls().getDataList().get(currentIndex);
    }
}
