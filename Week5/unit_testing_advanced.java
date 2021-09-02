package unittestingadvanced;

/* The import below is a support class which emulates JUnit behaviour.
 *  Outside of MyJavaTutor you would need to say
 *  import org.junit.*;
 *  to import JUnit functionalities. */
import static unittestingadvanced.Support.*;

public class NameValidatorTest {
    NameValidator validator; // do not initialise this variable, it will be done for you
    private String name = "Michael Doyle";
    private String name2 = "";
    private String name3 = null;
    private String name4 = "MichaelDoyle";
    @Test
    public void validNameTest() {
        // add code here
        assertTrue(validator.validateName(name));
    }

    @Test
    public void handlesBlankTest() {
        // add code here
        assertFalse(validator.validateName(name2));
    }

    @Test
    public void checksForSpaceTest() {
        // add code here
        assertFalse(validator.validateName(name4));
    }

    @Test
    public void handlesNullTest() {
        // add code here
        try{
            validator.validateName(name3);
        }
        catch(IllegalArgumentException e){};
    }
}