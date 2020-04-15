package com.codewithcolin.state.abuse;

public class StopWatch {

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void click() {
        currentState.click();
    }
}
