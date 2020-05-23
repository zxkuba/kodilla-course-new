package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle() {
        //Given
        Shape circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("This is a circle", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Shape triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("This is a triangle", result);
    }
}