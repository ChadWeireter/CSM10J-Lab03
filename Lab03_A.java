/**
 *
 * Chad Weireter
 */

import java.util.Scanner;

public class Lab03_A {

    //Creating an object to get input from the User
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        //Prompt and read input from User
        System.out.print("Input number of pages to be faxed!: ");
        int number = console.nextInt();
        System.out.println();
        
        //Compute charges
        if((number > 0) && (number <= 10))
            System.out.printf("Total Cost: $%.f %n", 3 + (number * 0.2));
        
        else if(number > 10)
            System.out.printf("Total Cost: $%.2f %n", 3 + (10 * 0.2) + (number - 10) *0.1);
        
        else
            System.out.println("Invalid number punk! (9-_-)9");
        //(9-_-)9 is the computer squinting with its fists up
       
    }
    
}
