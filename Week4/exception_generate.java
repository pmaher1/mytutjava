package exceptiongenerate;

public class GenerateException {

    /** Throws a specific type of exception based on the given parameter.
     * If the parameter is "arithmetic" then an ArithmeticException must be
     * thrown, if the parameter is "index" then an IndexOutOfBoundsException
     * must be thrown, if the parameter is "null" then a NullPointerException
     * must be thrown. Otherwise, nothing should happen.
     * @param exceptionType the type of exception that needs to be thrown
     */
    public static void generateException(String exceptionType) {
       System.out.print("Hello");
       if (exceptionType == "arithmetic"){
           throw new ArithmeticException();
       }
       else if (exceptionType == "index"){
           throw new IndexOutOfBoundsException();
       }
       else if (exceptionType == "null"){
           throw new NullPointerException();
       }
    }
}
