import java.util.Scanner;
public class Calculator {
	
		public static void main(String[] args) {
			boolean x=true;
			while(x=true) {
				System.out.println("\t Advanced Calculator\nCalculations:");
				System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
				System.out.println("5.Area Of a triangle\n6.Area Of a Circle\n7.Perimeter Of a Circle\n8.Perimeter of a Rectangle");
				
				int choice;
				Scanner in=new Scanner(System.in);
				choice = in.nextInt();
				
				switch(choice) {
				
				case 1:{
					System.out.println("Enter the numbers to add");
					int num1;
					int num2;
					num1=in.nextInt();
					num2=in.nextInt();
					Addition w=new Addition(num1, num2);
					w.Addition(num1,num2);
					break;
					
				}
				
				case 2:{
					System.out.println("Enter the number to Subtract");
					int num1;
					int num2;
					num1=in.nextInt();
					num2=in.nextInt();
					Subtraction w=new Subtraction();
					w.Substraction(num1,num2);
					break;
					
				}
				
				case 3:{
					System.out.println("Enter the number to Multiply");
					int num1;
					int num2;
					num1=in.nextInt();
					num2=in.nextInt();
					Multiplication w=new Multiplication();
					w.Multiplication(num1,num2);
					break;
					
				}
				
				case 4:{
					System.out.println("Enter the number to Division");
					int num1;
					int num2;
					num1=in.nextInt();
					num2=in.nextInt();
					Division w=new division();
					w.Substraction(num1,num2);
					break;
					
				}
				
				case 5:{
					double Height,Base,Area;
					System.out.println("Enter The Height Of Triangle");
					Height=in.nextDouble();
					System.out.println("Enter The Base of Your Triangle");
					Base = in.nextDouble();
					
					AreOfTriangle A= new AreOfTriangle();
					A.area(Base,Height);
					break;
					
					
					
				}
				
				case 6:{
					double radius;
					System.out.print("Enter the radius of the circle:");
					radius=in.nextDouble();
					Area R = new Area(radius);
					R.Area1(radius);
					break;
				}
				
				case 7:{
					CirclePerimeterCalculator perimeters = new CirclePerimeterCalculator();
					perimeters.perimeter1();
					break;
				}
				
				case 8:{
					RectanglePerimeter rect=new	RectanglePerimeter();
					rect.perimeter2();
					break;
				}
			}
			
			
		}}}


