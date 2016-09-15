package org.fundacionjala.org;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Circle}
 */
public class CircleTest {

    private static final double DELTA = 0.016;

    private Shape shape;

    @Before
    public void setUp() {
        final int radio = 5;
        shape = new Circle(radio);
    }

    @Test
    public void test_CalculateArea() {
        final double result = 78.53;
        assertEquals(result, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_CalculatePerimeter() {
        final double result = 31.4;
        assertEquals(result, shape.calculatePerimeter(), DELTA);
    }

}
