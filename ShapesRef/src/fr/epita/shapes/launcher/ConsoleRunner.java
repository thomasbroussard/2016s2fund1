/**
 * 
 */
package fr.epita.shapes.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.epita.shapes.datamodel.Shape;
import fr.epita.shapes.datamodel.Square;
import fr.epita.shapes.datamodel.Triangle;

/**
 * @author tbrou
 *
 */
public class ConsoleRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		List<Shape> listOfShapes = new ArrayList<>();
		
		initializeShapes(scanner, listOfShapes);
		
		displayMetrics(listOfShapes);
		
	}

	/**
	 * @param listOfShapes
	 */
	private static void displayMetrics(List<Shape> listOfShapes) {
		double globalArea = 0.0;
		double globalPerimeter = 0.0;
		for (int i = 0 ; i < listOfShapes.size() ; i ++){
			globalArea += listOfShapes.get(i).calculateArea();
			globalPerimeter += listOfShapes.get(i).calculatePerimeter();
		}
		
		System.out.println("global perimeter :" + globalPerimeter);
		System.out.println("global area :" + globalArea);
	}

	/**
	 * @param scanner
	 * @param listOfShapes
	 */
	private static void initializeShapes(Scanner scanner, List<Shape> listOfShapes) {
		System.out.println("Enter the triangles list size");
		int trianglesListSize = scanner.nextInt();
		
		for (int i = 0; i < trianglesListSize ; i++){
			Triangle triangle = getTriangle(scanner);
			listOfShapes.add(triangle);
			
		}
		
	
		
		System.out.println("Enter the square list size");
		int squareListSize = scanner.nextInt();
		
		for (int i = 0; i < squareListSize ; i++){
			Square square = getSquare(scanner);
			listOfShapes.add(square);
		}
	}

	/**
	 * 
	 */
	private static Triangle getTriangle(Scanner scanner) {
		System.out.println("Triangle init");
		System.out.println("Enter the side A");
		double sideA = scanner.nextDouble();
		System.out.println("Enter the side B");
		double sideB = scanner.nextDouble();
		System.out.println("Enter the side C");
		double sideC = scanner.nextDouble();
		System.out.println("Enter the height for side B");
		double heightForB = scanner.nextDouble();

		Triangle triangle = new Triangle(sideA, sideB, sideC, heightForB);

		double area = triangle.calculateArea();
		double perimeter = triangle.calculatePerimeter();

		System.out.println("triangle perimeter : " + perimeter + " area : " + area);
		return triangle;
	}

	/**
	 * 
	 */
	private static Square getSquare(Scanner scanner) {

		System.out.println("Square init : ");
		System.out.println("Enter the side");
		double side = scanner.nextDouble();

		Square square = new Square(side);

		double area = square.calculateArea();
		double perimeter = square.calculatePerimeter();

		System.out.println("square perimeter : " + perimeter + " area : " + area);
		return square;
	}

}
