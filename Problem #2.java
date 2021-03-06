/**
 * @author Adam Sorrenti
 * @date 2019-01-05
 * @description This problem was asked by Uber.
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of
 * all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was
 * [3, 2, 1], the expected output would be [2, 3, 6].
 * Follow-up: what if you can't use division?
 */
public class Problem2 {
    private int[] integers;
    private int[] newIntegers;
    Problem2(int[] integers){
        this.integers = integers;
        this.newIntegers = new int[integers.length];
    }

    int[] output(){
        for (int i = 0; i < integers.length; i++) {
            int product = 1;
            for (int j = 0; j < integers.length; j++)
                if (j != i)
                    product *= integers[j];
            newIntegers[i] = product;
        }
        return newIntegers;
    }
}
