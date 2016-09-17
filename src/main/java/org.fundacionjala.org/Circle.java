package org.fundacionjala.org;

/**
 * Handles the calculates of area and perimeter.
 *
 * @autor Bruno Vasquez
 */
public class Circle implements Shape {

    private final int radio;

    /**
     * It is the constructor of rectangle.
     *
     * @param radio an integer to set the radio
     */
    public Circle(int radio) {
        this.radio = radio;
    }

    /**
     * Calculates the area
     *
     * @return the area.
     */
    public double calculateArea() {
        return radio * radio * Math.PI;
    }

    /**
     * Calculates the perimeter
     *
     * @return the perimeter.
     */
    public double calculatePerimeter() {
        return 2 * radio * Math.PI;
    }
}

