import java.util.Scanner;

public class rectanglePerimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length Of Rectangle Is: ");
        double length = input.nextDouble();

        System.out.println("Width of rectangle is: ");
        double width = input.nextDouble();

        double perimeter = perimeterOfRectangle(length, width);

        System.out.println("Perimeter of Rectangle is: " + perimeter);

        input.close();
    }

    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }
}

 