package exceptioncustom;

public class NumberTooSmallException extends Exception{

    /**
     * Constructs a normal NumberTooSmallException with no error message.
     */
    // write constructor here
    public NumberTooSmallException(int number){
    }
    /**
     * Constructs a NumberTooSmallException that contains a helpful message
     * detailing why the exception occurred.
     * @param message detail message
     */
    // write constructor here
    public NumberTooSmallException(String message){
        super(message);
        System.out.print(message);
    }

}
