package com.codewithcolin.state.abuse;

public class RunningState implements State {

    private StopWatch stopWatch;

    public RunningState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new StopState(stopWatch));
        System.out.println("Stop");
    }
}
