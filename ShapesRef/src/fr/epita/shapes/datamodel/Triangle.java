/**
 * 
 */
package fr.epita.shapes.datamodel;

/**
 * @author tbrou
 *
 */
public class Triangle implements Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	private double heightForB;
	
	
	
	
	/**
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * @param heightForB
	 */
	public Triangle(double sideA, double sideB, double sideC, double heightForB) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.heightForB = heightForB;
	}
	
	
	/**
	 * @return the sideA
	 */
	public double getSideA() {
		return sideA;
	}
	/**
	 * @param sideA the sideA to set
	 */
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	/**
	 * @return the sideB
	 */
	public double getSideB() {
		return sideB;
	}
	/**
	 * @param sideB the sideB to set
	 */
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	/**
	 * @return the sideC
	 */
	public double getSideC() {
		return sideC;
	}
	/**
	 * @param sideC the sideC to set
	 */
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	/**
	 * @return the heightForB
	 */
	public double getHeightForB() {
		return heightForB;
	}
	/**
	 * @param heightForB the heightForB to set
	 */
	public void setHeightForB(double heightForB) {
		this.heightForB = heightForB;
	}


	/**
	 * @return
	 */
	public double calculateArea() {
		return this.sideB * this.heightForB * 0.5;
	}


	/**
	 * @return
	 */
	public double calculatePerimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
	
	
	
	
}
