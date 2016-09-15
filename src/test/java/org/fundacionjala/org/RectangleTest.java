package org.fundacionjala.org;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Rectangle}
 */
public class RectangleTest {
    private static final double DELTA = 0.001;
    private Shape shape;

    @Before
    public void setUp() {
        final int sideA = 5;
        final int sideB = 6;
        shape = new Rectangle(sideA, sideB);
    }

    @Test
    public void test_CalculateArea() {
        final double expectResult = 30;
        final double actualResult = shape.calculateArea();
        assertEquals(expectResult, actualResult, DELTA);
    }

    @Test
    public void test_CalculatePerimeter() {
        final double expectResult = 22;
        final double actualResult = shape.calculatePerimeter();
        assertEquals(expectResult, actualResult, DELTA);
    }
}