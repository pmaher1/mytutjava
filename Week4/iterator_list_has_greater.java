package iteratorlisthasgreater;

import java.util.Iterator;
import java.util.List;

public class ListHasGreater {
    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreater(List<Integer> numbers, int number) {
        // write your code here
        Iterator<Integer> it = numbers.iterator();
        boolean greater = false;
        for (int i=0;i<numbers.size();i++){
            if (it.next()>number){
                greater = true;
            }
        }
        return greater;
    }
}
