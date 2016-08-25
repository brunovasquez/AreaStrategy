package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brunovasquez on 8/24/2016.
 */
public class TestArea {

    public static final double DELTA = 0.3;

    @Test
    public void test_calculateArea_square(){
        final int square = 0;
        final int side = 2;

        Calculate calculate = new Calculate(square);

        final double expectResult = 4;
        final double actualResult = calculate.calculateArea(side);
        assertEquals(expectResult, actualResult, DELTA);
    }

    @Test
    public void test_calculateAmount_circle(){
        final int circle = 1;
        final int ratio = 2;

        Calculate calculate = new Calculate(circle);

        final double expectResult = 6;
        final double actualResult = calculate.calculateArea(ratio);
        assertEquals(expectResult, actualResult, DELTA);
    }


}
