package pack1;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntergerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner Sc= new Scanner(System.in);
		        System.out.println("Enter first Number");

		       String input1=  Sc.nextLine();
		      System.out.println("Enter second number");

		       String input2= Sc.nextLine();
		       BigInteger a 
		            = new BigInteger(input1); 
		        BigInteger b 
		            = new BigInteger(input2); 
		    BigInteger sum;
		        // Using add() method 
		        sum = a.add(b); 
            BigInteger mult;
		        // Using multiply() method 
		        mult = a.multiply(b); 
		  
		        // Display the result in BigInteger 
		        System.out.println("The multiplication of\n"
		                           + a + " \nand\n" + b + " "
		                           + "\nis\n" + mult); 
		  
		        // Display the result in BigInteger 
		        System.out.println("The sum of\n"
		                           + a + " \nand\n" + b + " "
		                           + "\nis\n" + sum + "\n");
		    }
		

}
