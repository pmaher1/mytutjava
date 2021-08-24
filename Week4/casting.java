package casting;

public class Casting {
    /**
     * Converts a double value into an int value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static int castDoubleToInt(double number) {
        int casted = (int) number;
        return casted;
    }

    /**
     * Converts a double value into a String value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static String castDoubleToString(double number) {
        String casted = Double.toString(number);
        return casted;
    }

    /**
     * Converts a String value into an int value.
     * @param number A number to be converted. Will only be a whole number,
     *               and will not have decimal places.
     * @return The converted value.
     */
    public static int castStringToInt(String number) {
        Integer casted = Integer.parseInt(number);
        return casted;
    }

    /**
     * Converts a String value into a double value.
     * @param number A number to be converted.
     * @return The converted value.
     */
    public static double castStringToDouble(String number) {
        double casted = Double.parseDouble(number);
        return casted;
    }
}
