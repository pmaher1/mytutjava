package mapsum;

import java.util.Map;

public class MapSum{

    /**
     * Returns the sum of the values in the map where the corresponding key
     * string has a length less than or equal to maxLength.
     *
     * @param map map whose values to sum
     * @param maxLength maximum length of key strings
     * @return sum of values with a key length <= maxLength
     */
    public static int mapSum(Map<String, Integer> map, int maxLength) {
        // write your code here
        int sum = 0;
        //for(int i = 0; i< map.
        for(Map.Entry<String,Integer> i: map.entrySet()){
            if (i.getKey().length() <= maxLength){
                sum += i.getValue();
            }
        }
        return sum;
    };
}
