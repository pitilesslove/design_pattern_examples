package com.codewithcolin.state.practice;

public class BicyclingMode implements TravelMode {

    private DirectionService directionService;

    public BicyclingMode(DirectionService directionService) {
        this.directionService = directionService;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
