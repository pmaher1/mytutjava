package stringsplit;

public class Delimiters {

    /**
     * Determines the number number of tokens which exist when the given
     * delimiter is applied to the given string.
     * @param toSplit the string to be split
     * @param delimiter the delimiter used to split the string
     * @return the number of tokens
     */
    public static int countTokens(String toSplit, String delimiter) {
        String arr[] = toSplit.split(delimiter);
        return arr.length;
    }
}
