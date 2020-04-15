package com.codewithcolin.state.practice;

public class WalkingMode implements TravelMode {

    private DirectionService directionService;

    public WalkingMode(DirectionService directionService) {
        this.directionService = directionService;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
