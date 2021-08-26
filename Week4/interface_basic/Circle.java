package interfacebasic;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Circle implements Shape{


    /** Initialises class variables.
     * @param radius the radius of the circle
     */
    private double circleRadius;
    public Circle(double radius) {
        circleRadius = radius;
    }
    
    @Override
    public double calculateArea(){
        return (Math.pow(circleRadius,2))*Math.PI;
    }


}
