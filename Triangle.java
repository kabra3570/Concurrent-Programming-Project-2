/**File: Triangle.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Triangle class which extends TwoDimensionalShape, providing a definition for triangles in the program.
 */
public class Triangle extends TwoDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Triangle(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the area
	 */
	@Override
	public void calculateArea() {
		area = (dimensions[0] * dimensions[1]) / 2;
	}

	@Override
	public String toString() {
		return String.format("%sBase: %.2f and Height: %.2f", super.toString(), dimensions[0], dimensions[1]);
	}

}
