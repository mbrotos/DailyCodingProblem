package daily.coding.problem;

/**
 *
 * @author Adam Sorrenti
 * @date 4-Jan-2019
 * @description Given a list of numbers and a number k, return whether any two
 * numbers from the list add up to k. For example, given [10, 15, 3, 7] and k 
 * of 17, return true since 10 + 7 is 17.
 * 
 */
public class Problem1 {
    int[] list;
    int k;
    Problem1(int[] list, int k){
        this.list = list;
        this.k = k;
    }
    boolean checkList(){
        int a;
        int sum;
        for(int i = 0; i < list.length; i++){
            a = list[i];
            for(int j = i+1; j > i && j < list.length; j++){
                sum = a + list[j];
                if(sum == k){
                    return true;
                }
            }
        }
        return false;
    }

}
