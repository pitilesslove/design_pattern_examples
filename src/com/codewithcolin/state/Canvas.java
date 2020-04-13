package com.codewithcolin.state;

public class Canvas {

    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDownAction();
    }

    public void mouseUp() {
        currentTool.mouseUpAction();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

}
