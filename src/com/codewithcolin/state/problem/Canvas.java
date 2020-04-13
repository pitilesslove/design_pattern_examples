package com.codewithcolin.state.problem;

public class Canvas {

    private ToolType currentTool;

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown() {
        if ( currentTool == ToolType.SELECTION )
            System.out.println("Selection Icon");
        else if (currentTool == ToolType.BRUSH )
            System.out.println("Brush Icon");
        else if (currentTool == ToolType.ERASER )
            System.out.println("Eraser Icon");
    }
    public void mouseUp() {
        if ( currentTool == ToolType.SELECTION )
            System.out.println("Draw Dash Rectangle");
        else if (currentTool == ToolType.BRUSH )
            System.out.println("Draw Paint");
        else if (currentTool == ToolType.ERASER )
            System.out.println("Erase Something");
    }


}
