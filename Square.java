/**File: Square.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Square class which extends TwoDimensionalShape, providing a definition for squares in the program.
 */
public class Square extends TwoDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Square(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the area
	 */
	@Override
	public void calculateArea() {
		area = Math.pow(dimensions[0], 2);
	}

	@Override
	public String toString() {
		return String.format("%sLength: %.2f", super.toString(), dimensions[0]);
	}
}
