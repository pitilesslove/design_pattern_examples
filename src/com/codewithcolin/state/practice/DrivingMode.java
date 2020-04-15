package com.codewithcolin.state.practice;

public class DrivingMode implements TravelMode{

    private DirectionService directionService;

    public DrivingMode(DirectionService directionService) {
        this.directionService = directionService;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
