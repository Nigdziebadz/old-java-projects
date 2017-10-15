package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double wallLength;

    public Square(String shapeName, double wallLength) {
        this.shapeName = shapeName;
        this.wallLength = wallLength;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField(){
        return wallLength * wallLength;
    }
}
