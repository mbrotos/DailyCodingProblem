import java.util.Arrays;
import java.util.List;

/**
 * @author Adam Sorrenti
 * @date 2019-01-10
 * @description This problem was asked by Stripe.

    Given an array of integers, find the first missing positive integer in linear time and constant space. In other words,
    find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers
    as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

    You can modify the input array in-place.
 */

public class Problem3 {
    int[] integers;

    Problem3(int[] integers){

        this.integers = integers;
    }
    private static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    int findMissing(){
        int missing = 1;

        while (contains(integers,missing))
            missing++;

        return missing;
    }
}
