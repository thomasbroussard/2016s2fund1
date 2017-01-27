/**
 * 
 */
package demo;

/**
 * @author tbrou
 *
 */
public class Square{

	private Rectangle rectangle; 
	/**
	 * @param width
	 * @param height
	 */
	public Square(double side) {
		this.rectangle = new Rectangle(side, side);
		
	}

	
	public double calculatePerimeter(){
		return this.rectangle.calculatePerimeter();
	}
	
}
