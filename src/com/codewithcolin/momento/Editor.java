package com.codewithcolin.momento;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(getContent());
    }

    public void restoreState(EditorState state) {
        this.setContent(state.getEditorState());
    }
}
