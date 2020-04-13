package com.codewithcolin.momento.practice;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(getContent(), getFontName(), getFontSize());
    }
    public void backToBefore(DocumentState state) {
        setContent(state.getContent());
        setFontName(state.getFontName());
        setFontSize(state.getFontSize());
    }

    public String toString() {
        System.out.println("Content = " + getContent());
        System.out.println("fontName = " + getFontName());
        System.out.println("fontSize = " + getFontSize());

        return "Content = " + getContent() + "fontName = " + getFontName() + "fontSize = " + getFontSize();
    }
}
