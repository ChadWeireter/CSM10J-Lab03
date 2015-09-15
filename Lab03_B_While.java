/**
 *
 * Chad Weireter
 */

import java.util.Scanner;

public class Lab03_B_While {
    
    static Scanner console = new Scanner(System.in);
      
    
    public static void main(String[] args) {
    
    //variables
        int firstNum;
        int secondNum;
        int tempNumber;
        int evenSum;
    
        
    //a)
        //Prompt the user to enter two numbers with 1st# < 2nd
        System.out.print("a) Enter two positive integers: ");
        firstNum = console.nextInt();
        secondNum = console.nextInt();
        
        //verify 1st < 2nd
        
        while(firstNum <0 || secondNum <0 || firstNum >= secondNum)
        {
            System.out.print("Enter two positive integers with the first number "
                    + "being bigger than the second integer: ");
            firstNum = console.nextInt();
            secondNum = console.nextInt();
        }
        
        System.out.println();
        
    //b)
        //Display odd #'s between 2 integers
        System.out.print("b) The odd numbers between " + firstNum + " "
                + "and " + secondNum + " are: ");
        tempNumber = firstNum;
        while(tempNumber <= secondNum)
        {if(tempNumber % 2 !=0)
            System.out.print(tempNumber + " ");
        tempNumber++;
            }
        System.out.println();
        System.out.println();
        
    //c)
        //Calculate and display the sum of all even numbers between two integers
        tempNumber = firstNum;
        evenSum = 0;
        while(tempNumber <= secondNum)
        {
            if(tempNumber % 2 == 0)
                evenSum += tempNumber;
            tempNumber++;
        }
        //Display Results
        System.out.println("c) The sum of even numbers between " + firstNum + " "
                + "and " + secondNum + " is: " + evenSum);
        System.out.println();
        
        
    }
}
