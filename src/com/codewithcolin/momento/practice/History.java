package com.codewithcolin.momento.practice;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<DocumentState> list = new ArrayList<>();

    public void push(DocumentState state) {
        list.add(state);
    }
    public DocumentState pop() {
        list.remove(list.size()-1);
        return list.get(list.size()-1);
    }
}
