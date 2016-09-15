package org.fundacionjala.org;

/**
 * Handles the calculates of area and perimeter.
 *
 * @autor Bruno Vasquez
 */
public class Rectangle implements Shape {

    public static final int FACTOR_MULTIPLY = 2;

    protected final int sideA;

    protected final int sideB;

    /**
     * It is the constructor of rectangle.
     *
     * @param sideA an integer to set a side
     * @param sideB an integer to set other side
     */
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Calculates the area
     *
     * @return the area.
     */
    public double calculateArea() {
        return sideA * sideB;
    }

    /**
     * Calculates the perimeter
     *
     * @return the perimeter.
     */
    public double calculatePerimeter() {
        return FACTOR_MULTIPLY * (sideA + sideB);
    }

}
