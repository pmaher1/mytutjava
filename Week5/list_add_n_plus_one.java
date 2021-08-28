package listaddnplusone;

import java.util.ArrayList;
import java.util.List;

public class ListAddNPlusOne {
    /**
     * Iterates through each of the numbers in the list. For each number,
     * insert the number plus one to the next position the list. Returns
     * the resulting list.
     * For example, if the list contains the numbers 11,28,43, then
     * 11,12,28,29,43,44 must be returned. If the list contains the numbers
     * 6,-4, then 6,7,-4-3 must be returned.
     * If there are no elements in the provided list throw an
     * IllegalArgumentException.
     * @param numbers the provided list of numbers
     * @return the resulting list to after elements have been added.
     */
    public static ArrayList<Integer> addNPlusOne(ArrayList<Integer> numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<Integer>();
        if (numbers.size() == 0){
            throw new IllegalArgumentException();
        }
        else {
            
            for(int i=0; i< numbers.size();i++){
                newNumbers.add(numbers.get(i));
                newNumbers.add(numbers.get(i)+1);
            }
            return newNumbers;
        }
        
    }
}
