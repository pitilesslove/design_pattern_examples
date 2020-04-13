package com.codewithcolin.state.problem;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(ToolType.SELECTION);
        canvas.mouseDown();
        canvas.setCurrentTool(ToolType.BRUSH);
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(ToolType.ERASER);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
