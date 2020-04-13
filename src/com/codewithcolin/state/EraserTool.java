package com.codewithcolin.state;

public class EraserTool implements Tool {
    @Override
    public void mouseDownAction() {
        System.out.println("Draw Erase Icon");
    }

    @Override
    public void mouseUpAction() {
        System.out.println("Erase Something");
    }
}
