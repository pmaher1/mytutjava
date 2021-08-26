package interfacebasic;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static java.lang.Math.tan;

/**
 * Represents a multi-sided shape. Each side is has the same length.
 */
public class Polygon implements Shape{


    /** Initialises class variables.
     * @param numberSides the number sides the polygon has. e.g. a Hexagon has 6 sides
     * @param sideLength the length of each side (in metres)
     */
    private int polyNumberSides;
    private double polySideLength;
    public Polygon(int numberSides, double sideLength) {
        polyNumberSides = numberSides;
        polySideLength = sideLength;
    }

    @Override
    public double calculateArea(){
        return ((Math.pow(polySideLength,2))*polyNumberSides)/(4*Math.tan(Math.PI/polyNumberSides));
    }
}
