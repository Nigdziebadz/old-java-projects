package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName;
    private double baseLength;
    private double height;

    public Triangle(String shapeName, double baseLength, double height) {
        this.shapeName = shapeName;
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField(){
        return 0.5 * (baseLength + height);
    }
}
