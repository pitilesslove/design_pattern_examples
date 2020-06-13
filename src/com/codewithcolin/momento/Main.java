package com.codewithcolin.momento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History editorHistory = new History();

        editor.setContent("a");
        System.out.println("editor's content = " + editor.getContent());
        editorHistory.saveState(editor.createState());
        editor.setContent("b");
        editorHistory.saveState(editor.createState());
        System.out.println("editor's content = " + editor.getContent());
        editor.restoreState(editorHistory.undoState());
        System.out.println("editor's content = " + editor.getContent());
        //
        // This is just Test


    }

}
