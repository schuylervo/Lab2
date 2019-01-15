import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2 {
	public static void main(String[] args) {
		// calculate perimeter, area, and volume of a room based on user input.
		double length = 0;
		double width = 0;
		double height = 0; 
		String endProgram = "y";

		Scanner scnr = new Scanner(System.in);
		// print the calculations in decimal format using 0.## 
		DecimalFormat df = new DecimalFormat("0.##");

		System.out.println("Welcome to Grand Circus' Room Detail Generator");
		
		/* create a do while loop to prompt user for input to perform room calculations, prompt user for input 
		  regarding whether to continue performing new calculations, and then either continue or quit */ 
		do {
			length = 0;
			width = 0;
			height = 0; 
		System.out.println("Please enter length in feet: ");
			length = scnr.nextDouble();
		
		System.out.println("Please enter width in feet: ");
			width = scnr.nextDouble();
			
		System.out.println("Please enter height in feet: ");
			height = scnr.nextDouble();
			
			double area = length * width;
			double perimeter = (2*length) + (2*width);
			double volume = length * width* height;
			
			System.out.println("Area = " + df.format(area));
			System.out.println("Perimeter = " + df.format(perimeter));
			System.out.println("Volume = " + df.format(volume));
			
		System.out.println("Continue? (y/n): ");
			endProgram = scnr.next();
			// use equalsIgnoreCase so that user can input either N or n
        } while (!endProgram.equalsIgnoreCase("n"));

		scnr.close();
		
	}
}
