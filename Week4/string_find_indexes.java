package stringfindindexes;

import java.util.ArrayList;
import java.util.List;

public class StringIndices {

    /** Searches for all occurances of the given character in a string.
     * Returns a list of integers corresponding to the index positions where
     * the character appears in the string.
     * The search is case sensitive (i.e. 'a' and 'A' are different).
     * @param text Text to be searched.
     * @param searchingFor A character to search for in the text.
     * @return List of numbers corresponding to index positions in the text.
     * */
    public static List<Integer> positionsInString(String text, char searchingFor) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // Create an ArrayList object
        for (int i=0;i<text.length();i++){
            if (text.charAt(i) == searchingFor){
                list.add(i);
            }
        }
        return list;
    }
}
