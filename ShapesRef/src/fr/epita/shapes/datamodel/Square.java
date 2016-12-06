/**
 * 
 */
package fr.epita.shapes.datamodel;

/**
 * @author tbrou
 *
 */
public class Square implements Shape {
	
	private double side;
	
	/**
	 * @param side
	 */
	public Square(double side) {
		this.side = side;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}



	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * @return
	 */
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.side * this.side;
	}

	/**
	 * @return
	 */
	public double calculatePerimeter() {
		return this.side * 4;
	}
	
	
	

}
