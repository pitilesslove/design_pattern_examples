package com.codewithcolin.state;

public class SelectionTool implements Tool {

    @Override
    public void mouseDownAction() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUpAction() {
        System.out.println("Draw Dash Rectangle");
    }
}
