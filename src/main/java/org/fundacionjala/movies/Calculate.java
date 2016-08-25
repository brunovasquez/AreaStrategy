package org.fundacionjala.movies;
import java.util.HashMap;
/**
 * Created by brunovasquez on 8/24/2016.
 */



public class Calculate {
    public static final int SQUARE = 0;
    public static final int CIRCLE = 1;
    private HashMap<Integer, Form> strategyAvailable = new HashMap<Integer, Form>();
    private Form strategyUsed;
    public Calculate(int strategy) {
        strategyAvailable.put(SQUARE, new Square());
        strategyAvailable.put(CIRCLE, new Circle());
        strategyUsed = strategyAvailable.get(strategy);
    }

    public double calculateArea(int valour) {
        return strategyUsed.calculateArea(valour);
    }
}
