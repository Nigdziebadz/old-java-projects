package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a Circle", result);
    }
}
