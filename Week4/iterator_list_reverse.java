package iteratorlistreverse;

import java.util.List;
import java.util.ListIterator;

public class ListPrintStrings {
    /**
     * Prints the given list of strings to System.out, skipping every second
     * string. Then, prints the list of strings in reverse order, skipping
     * every second string. All output should be printed on the same line.
     *
     * For example, if the list of strings is ["a", "b", "c", "d"], the output
     * should be "acdb". If the list of strings is ["a", "b", "c"], the output
     * should be "acca".
     *
     * @param strings strings to print
     */
    public static void printStrings(List<String> strings) {
        // write your code here
        ListIterator<String> it = strings.listIterator();
        
        while(it.hasNext()){
            System.out.print(it.next());
            if(it.hasNext()){
                it.next();
            }
        }
        while(it.hasPrevious()){
            System.out.print(it.previous());
            if(it.hasPrevious()){
                it.previous();
            }
        }
    }
}
