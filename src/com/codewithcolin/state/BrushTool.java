package com.codewithcolin.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDownAction() {
        System.out.println("Draw Brush Icon");
    }

    @Override
    public void mouseUpAction() {
        System.out.println("Draw Paint");
    }
}
