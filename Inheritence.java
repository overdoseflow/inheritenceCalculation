package inheritence;

import java.util.Random;
import java.util.Scanner;

public class Inheritence {

    public static void main(String[] args) {
        
        My_Calculation demo = new My_Calculation();
        // Calling class
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please give a number to calculate with random number: ");
        int a = s.nextInt();
        int b = r.nextInt(9)+1;
        System.out.printf("The other RANDOM number is: %d\n",b);
        
        System.out.println("Do you want to continue? Y/N");
        // Interactivite with user
        
        String answer = s.next();
       
        if (answer.equals("Y")) {
            
            demo.addition(a, b);
            demo.substruction(a, b);
            demo.multiplication(a, b);
        }
        else if(answer.equals("N"))
        {
            System.out.println("Thank you! See you again!");
        }
        else{
        
        System.out.println("Please just write right letters: Y/N");
        
        }
        
    }
    
}
