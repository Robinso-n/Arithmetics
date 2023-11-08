import java.util.Scanner;

public class CirclePerimeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double perimeter = calculateCirclePerimeter(radius);

        System.out.println("The perimeter of the circle with radius " + radius + " is: " + perimeter);

        input.close();
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
