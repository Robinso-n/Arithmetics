package programs;

public class Division {
	
	public static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		int x = 2736;
		int y = 26;
		
		int result = divide(x,y);
		
		System.out.println(""+ x + " / "+ y + "= " +result);
	}

}
