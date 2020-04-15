package com.codewithcolin.state.practice;

public class TransitMode implements TravelMode {
    private DirectionService directionService;

    public TransitMode(DirectionService directionService) {
        this.directionService = directionService;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
