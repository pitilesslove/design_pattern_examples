package com.codewithcolin.state.practice;

public class Main {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        directionService.setTravelMode(new DrivingMode(directionService));
        directionService.getDirection();
        directionService.getEta();

        directionService.setTravelMode(new WalkingMode(directionService));
        directionService.getDirection();
        directionService.getEta();

        directionService.setTravelMode(new TransitMode(directionService));
        directionService.getDirection();
        directionService.getEta();
    }
}
