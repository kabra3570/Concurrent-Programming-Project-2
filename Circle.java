/**File: Circle.java
 * Author: Kevin Abrahams
 * Date: 26-01-2021
 * Purpose: Implement the Circle class which extends TwoDimensionalShape, providing a definition for rectangles in the program.
 */
public class Circle extends TwoDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Circle(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the area
	 */
	public void calculateArea() {
		area = Math.PI * (Math.pow(dimensions[0], 2));
	}

	@Override
	public String toString() {
		return String.format("%sRadius: %.2f", super.toString(), dimensions[0]);
	}
}
