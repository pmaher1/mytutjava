package loops;

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
    public static boolean hasGreaterFor(List<Integer> numbers, int number) {
        // write your code here
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

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterWhile(List<Integer> numbers, int number) {
        // write your code here
        Iterator<Integer> it = numbers.iterator();
        boolean greater = false;
        while(it.hasNext()){
            if (it.next()>number){
                greater = true;
            }
        }
        return greater;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterForEach(List<Integer> numbers, int number) {
        // write your code here
        Iterator<Integer> it = numbers.iterator();
        boolean greater = false;
        for (int num: numbers){
            if (it.next()>number){
                greater = true;
            }
        }
        return greater;
    }

    /**
     * Returns true if the first argument contains a number greater than the
     * second argument; returns false otherwise.
     * @param numbers A list of numbers
     * @param number A number to compare
     * @return whether first parameter contains a number greater than the
     * second parameter
     */
    public static boolean hasGreaterDoWhile(List<Integer> numbers, int number) {
        // write your code here
        Iterator<Integer> it = numbers.iterator();
        boolean greater = false;
        if (numbers.size() == 0){
            return greater;
        }
        do {
            if (it.next()>number){
                greater = true;
            }
        }while (it.hasNext());
        return greater;
    }
}

