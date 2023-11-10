package programs;
import java.util.Scanner;

public class Division {
	
	public static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		int x , y;
		Scanner div= new Scanner(System.in);
		    x = div.nextInt();	
		    y = div.nextInt();
		    System.out.println("x = "+ x + "\ny= "+ y);
		
		int result = divide(x,y);
		
		System.out.println(""+ x + " / "+ y + " = " +result);
	}

}
