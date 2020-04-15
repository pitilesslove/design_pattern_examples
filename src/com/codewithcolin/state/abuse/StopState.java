package com.codewithcolin.state.abuse;

public class StopState implements State {

    private StopWatch stopwatch;

    public StopState(StopWatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new RunningState(stopwatch));
        System.out.println("Running");
    }
}
