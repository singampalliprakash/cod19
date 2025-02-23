/*Execption handling:
exception:
* it occurs in run time
*it is a class
*exception terminates normal flow of execution
*code=run----->-succes---->output
               -failure---->exception
*/


import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	  try{
	        System.out.println("enter the two numbers:");
    	    int a=sc.nextInt();
    	    int b=sc.nextInt();
    	    double c=a/b;
    	    System.out.println("sum:"+c);   
	    }
	    catch(ArithmeticException e1)
	    {
	        System.out.println("Error: Division by zero");
	    }
	    catch(InputMismatchException e2)
	    {
	        System.out.println( "Error: Invalid input type");
	    }
	    
	    
	}
}
