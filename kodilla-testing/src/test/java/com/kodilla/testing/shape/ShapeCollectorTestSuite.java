package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Tests begins.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests ended");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("starting test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        Shape square = new Square("Square_01", 3);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(square);

        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }

    @Test
    public void testRemoveFigure() {
        Shape triangle = new Triangle
                ("Triangle_01", 3, 4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapes().size());
    }

    @Test
    public void testGetFigure() {
        Shape circle = new Circle("Circle_01", 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        Shape retrievedFigure = shapeCollector.getFigure(0);

        Assert.assertEquals(circle, retrievedFigure);
    }
}


