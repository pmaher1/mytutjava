package printnumbers;

public class PrintNumbers {

    /**
     * Prints integer numbers to the console all on one line, starting at one,
     * and ending at the given limit (inclusive).
     * Each number is separated by a single space. The last number is
     * followed by single space.
     * For example, if limit is 5, then "1 2 3 4 5 " (no quotes) must be
     * printed to the console.
     * @param limit the maximum number to print
     */
    public void printNumbersOneToLimit(int limit) {
        // write your code here
        for(int i=0;i<limit;i++){
            System.out.print(i+1);
            System.out.print(' ');
        }
    }

}
