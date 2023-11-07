package programs;

public class Multiplication {

	    public static int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public static void main(String[] args) {
	        int num1 = 5;
	        int num2 = 7;

	        int result = multiply(num1, num2);

	        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
	    }

}
