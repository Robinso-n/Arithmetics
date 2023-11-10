package programs;
import java.util.Scanner;

public class Multiplication {

	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public static void main(String[] args) {
		    int num1, num2;
		    scanner mut= new Scanner(System.in);
		    num1 = mut.nextInt();	
		    num2 = mut.nextInt();
		    System.out.println("num1= "+num1+ "\nnum2= "+num2);
	        int result = multiply(num1, num2);

	        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
	    }

}
