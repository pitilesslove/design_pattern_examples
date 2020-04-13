package com.codewithcolin.momento;

import java.util.Stack;

public class History {
    private Stack<EditorState> stateList;
    public History() {
        stateList = new Stack<>();
    }

    public void saveState(EditorState state) {
        stateList.push(state);
    }
    public EditorState undoState() {
        stateList.pop();
        return stateList.peek();
    }
}
