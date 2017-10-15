package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape retrievedFigure = null;

        if (n >= 0 && n < shapes.size()) {
            retrievedFigure = shapes.get(n);
        }
        return retrievedFigure;
    }

    public String showFigures() {
        for (Shape listShapes : shapes) {

        }
        return null;
    }
}