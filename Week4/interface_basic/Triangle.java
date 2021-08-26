package interfacebasic;

/**
 * Represents a right-angle triangle.
 */
public class Triangle implements Shape{


    /** Initialises class variables.
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    private double triangleBase;
    private double triangleHeight;
    public Triangle(double base, double height) {
        triangleBase = base;
        triangleHeight = height;
    }
    
    @Override
    public double calculateArea(){
        return triangleBase*triangleHeight*0.5;
    }
}
