import java.util.Scanner;

public class Java_Lab_15
{
	public static void calculateCircle(double r)
	{
		double area = Math.PI*r*r;
		double circumference = 2*Math.PI*r;
		System.out.printf("Area: %.3f\n", area);
		System.out.printf("Circumference: %.3f\n", circumference);
	}
	public static void calculatePyramid(double l, double w, double h)
	{
		double baseArea = l*w;
		double volume = (l*w*h)/3.0;
		System.out.printf("Base Area: %.3f\n", baseArea);
		System.out.printf("Volume: %.3f\n", volume);
	}
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter \"1\" to calculate a circle, and enter \"2\" to calculate a pyramid:");
		int input = scnr.nextInt();
		
		if(input == 1)
		{
			System.out.print("Radius: ");
			double radius = scnr.nextDouble();
			calculateCircle(radius);
		}
		else if(input == 2)
		{
			System.out.print("Length: ");
			double length = scnr.nextDouble();
			System.out.print("Width: ");
			double width = scnr.nextDouble();
			System.out.print("Height: ");
			double height = scnr.nextDouble();
			calculatePyramid(length, width, height);
		}
		else
		{
			System.out.println("Not a valid entry");
		}
		
	}
}