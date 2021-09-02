package unittestingsimple;

/* The import below is a support class which emulates JUnit behaviour.
 *  Outside of MyJavaTutor you would need to say
 *  import org.junit.*;
 *  to import JUnit functionalities. */
import static unittestingsimple.Support.*;

public class BusStopTest {

    BusStop busStop; // do not initialise this variable, it will be done for you

    /*
     * Does getName return the bus stop's name?
     * Does setName change the bus stop's name?
     */
    @Test
    public void getSetNameTest() {
        // add code here
        String name = "name";
        busStop.setName(name);
        assertEquals(busStop.getName(),name);
    }

    /*
     * Does getId return the bus stop's ID?
     * Does setId change the bus stop's ID?
     */
    @Test
    public void getSetIdTest() {
        // add code here
        int id = 12;
        busStop.setId(id);
        assertEquals(busStop.getId(),id);
    }

    /*
     * Does getLatitude return the bus stop's latitude?
     * Does setLatitude change the bus stop's latitude?
     */
    @Test
    public void getSetLatitudeTest() {
        // add code here
        double latitude = 1.0;
        busStop.setLatitude(latitude);
        assertEquals(busStop.getLatitude(),latitude);
    }

    /*
     * Does getLongitude return the bus stop's longitude?
     * Does setLongitude change the bus stop's longitude?
     */
    @Test
    public void getSetLongitudeTest() {
        // add code here
        double longitude = 1.0;
        busStop.setLongitude(longitude);
        assertEquals(busStop.getLongitude(),longitude);
        
    }
}
