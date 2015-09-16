/**
 *
 Chad Weireter
 */

import java.util.Scanner;

public class Lab03_B_DoWhile {
    
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
    //a)
        System.out.print("Input two positive integers: ");
        
        int firstNum = console.nextInt();
        int secondNum = console.nextInt();
        System.out.println();
        
    //b)
        int i =firstNum, evenSum = 0;
        System.out.print("Odd numbers between " + firstNum + " "
                + "and " + secondNum + "are: ");
        do
        {
            if(i%2 !=0)
                System.out.print(i+" ");
            else
                evenSum = evenSum +i;
            i++;
        }
        while(i <= secondNum);
        
        System.out.println();
        
    //c)
        System.out.println("sum of even numbers: " + evenSum);
    }
    
}
