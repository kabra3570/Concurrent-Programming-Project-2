/**File: Cylinder.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Cylinder class which extends ThreeDimensionalShape, providing a definition for cylinders in the program.
 */
public class Cylinder extends ThreeDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Cylinder(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the volume
	 */
	@Override
	public void calculateVolume() {
		volume = Math.PI * dimensions[0] * dimensions[0] * dimensions[1];
	}

	/**
	 * Calculate the area
	 */
	@Override
	public void calculateArea() {
		area = 2 * Math.PI * dimensions[0] * (dimensions[0] + dimensions[1]);
	}
	/**
	 * Display cylinder information
	 */
	@Override
	public String toString() {
		return String.format("%sRadius: %.2f and Height: %.2f", super.toString(), dimensions[0], dimensions[1]);
	}
}
