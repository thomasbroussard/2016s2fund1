/**
 * 
 */
package demo;

/**
 * @author tbrou
 *
 */
public class Rectangle {
	
	private double width;
	private double height;
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	public double calculatePerimeter(){
		return this.height * this.width;
	}
}
