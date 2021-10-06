/**File: Rectangle.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Rectangle class which extends TwoDimensionalShape, providing a definition for rectangles in the program.
 */
public class Rectangle extends TwoDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Rectangle(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the area
	 */
	@Override
	public void calculateArea() {
		area = dimensions[0] * dimensions[1];
	}

	@Override
	public String toString() {
		return String.format("%sWidth: %.2f and Length: %.2f ", super.toString(), dimensions[0], dimensions[1]);
	}
}
