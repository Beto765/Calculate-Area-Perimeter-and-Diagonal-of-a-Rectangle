package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter rectangle width and height:");
	Rectangle rectangle = new Rectangle();
	rectangle.width = sc.nextDouble();
	rectangle.height = sc.nextDouble();
	
	System.out.printf("Area = %.2f%n ", rectangle.area());
    System.out.printf("Perimiter = %.2f%n ", rectangle.perimeter());
	System.out.printf("Diagonal = %.2f%n ", rectangle.diagonal());
	
	sc.close();
	}

}
