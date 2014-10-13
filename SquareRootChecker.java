/**
*
* Prompts user to enter a value, checks if negative -- if not, prints out the square root
*
* @author Alex Gandhi
* @version 13/10/14
*
*/
import java.util.Scanner;

public class SquareRootChecker {
	
	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Enter Integer");
      double sqrtNumber = scnr.nextDouble();
      
      if (sqrtNumber >= 0) {
      sqrtNumber = Math.sqrt(sqrtNumber);
      System.out.println ("The square root of this number is " + sqrtNumber);
      
      } else {
         System.out.println ("Error 404");
      }
      return;
}   

}  

	