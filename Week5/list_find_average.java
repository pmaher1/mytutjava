package listfindaverage;

import java.util.Iterator;
import java.util.ArrayList;

public class ListAverage {
    /**
     * Returns the average of a list of numbers. If the list is empty,
     * NaN is returned.
     * @param numbers A list of numbers. Cannot be empty.
     * @return the average of the list of numbers
     */
    public static double findAverageDouble(ArrayList<Double> numbers) {
        double average = 0;
        for(int i=0; i<numbers.size(); i++){
            average += numbers.get(i);
        }
        average /= numbers.size();
        return average;
    }

}
