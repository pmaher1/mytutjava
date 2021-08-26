package exceptioncustom;

public class NumberTooBigException extends Exception{

    /**
     * Constructs a normal NumberTooBigException with no error message.
     */
    // write constructor here
    public NumberTooBigException(){
    }
    /**
     * Constructs a NumberTooSmallException that contains a helpful message
     * detailing why the exception occurred.
     * @param message detail message
     */
    // write constructor here
    public NumberTooBigException(String message){
        super(message);
        System.out.print(message);
    }


}
