package unittestingarrays;
import java.util.ArrayList;
import java.util.List;

/* The import below is a support class which emulates JUnit behaviour.
*  Outside of MyJavaTutor you would need to say
*  import org.junit.*;
*  to import JUnit functionalities. */
import static unittestingarrays.Support.*;

public class ArrayUtilitiesTest {

    ArrayUtilities arrayUtilities; // do not initialise this variable, it will be done for you
    private int[] arr = new int[]{1,3,5};
    private int[] arr2 = new int[]{2,3,6,9};
    private int[] arr3 = null;
    private int[] arr4 = new int[]{};
    private int[] arr5 = new int[]{1,2,3,4};
    private int[] arr6 = new int[]{2,2,2,2};
    
    /* Does the findMiddle method correctly return the middle value? */
    @Test
    public void findMiddleFindsMiddleTest() {
        // add code here
        assertEquals(arrayUtilities.findMiddle(arr),3);
    }

    /*
     * Does the findMiddle method return the correct value when the array has
     * an even number of elements?
     */
    @Test
    public void findMiddleFindsMiddleEvenTest() {
        // add code here
        
        assertEquals(arrayUtilities.findMiddle(arr5),3);
    }

    /* Does the findMiddle method handle a null array correctly? */
    @Test
    public void findMiddleAllowsNullTest() {
        // add code here
        assertEquals(arrayUtilities.findMiddle(arr3),-1);
    }

    /* Does the findMiddle method handle an empty array correctly? */
    @Test
    public void findMiddleAllowsEmptyTest() {
        // add code here
        assertEquals(arrayUtilities.findMiddle(arr4),-1);
    }

    /* Does the sum method handle summing even values correctly? */
    @Test
    public void sumEvenTest() {
        // add code here
        assertEquals(arrayUtilities.sum(arr2,true),8);
    }

    /* Does the sum method handle summing odd values correctly? */
    @Test
    public void sumOddTest() {
        // add code here
        assertEquals(arrayUtilities.sum(arr,false),9);
    }
}
