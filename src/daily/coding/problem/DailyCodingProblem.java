package daily.coding.problem;

import java.util.Scanner;

/**
 *
 * @author adams
 */
public class DailyCodingProblem {

    static boolean Problem1(){
        Problem1 p1;
        int[] list = {10, 15, 3, 6};
        p1 = new Problem1(list, 17);
        return(p1.checkList());
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
                case 0: System.exit(0);
                case 1: System.out.println(Problem1());
                        break;
                default:System.out.println("Try again");
                        break;                         
            
            }
        
        }
        
    }
    
}
