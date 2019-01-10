import java.util.Scanner;
import java.util.Arrays;



/**
 *
 * @author Adam Sorrenti
 * @date 4-Jan-2019
 * @description Main class with simple console based interface used for running,
 * configuring, and test Daily Coding Problems. These problems have been 
 * provided by https://www.dailycodingproblem.com/.
 * 
 */
public class DailyCodingProblem {
    
    static boolean Problem1(){
        Problem1 p1;
        int[] list = {10, 15, 3, 6};
        p1 = new Problem1(list, 17);
        return(p1.checkList());
    }
    static int[] Problem2(){
        Problem2 p2;
        int[] list = {10, 15, 3, 6};
        p2 = new Problem2(list);
        return(p2.output());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("Choose a program:");
            choice = scan.nextInt();
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(Problem1());
                        break;
                case 2:
                    System.out.println(Arrays.toString(Problem2()));
                        break;

                default:
                    System.out.println("Try again");
                        break;                         
            
            }
        
        }
        
    }
    
}
