package findaverage;

public class FindAverage {
    /**
     * Calculates the average for an array of numbers.
     *
     * @param nums An array of numbers. Can include positive numbers, negative numbers, and zero.
     * @return The average of the array of numbers.
     */
    public static double average(int[] nums) {
        int length = nums.length;
        double total = 0;
        for(int i=0;i<length;i++){
            total += nums[i];
        }
        return total/length;
    }
}
