/**File: Cone.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Cone class which extends ThreeDimensionalShape, providing a definition for cones in the program.
 */
public class Cone extends ThreeDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Cone(int numberOfDimentions) {
		super(numberOfDimentions);
	}

	/**
	 * Calculate the volume
	 */
	@Override
	public void calculateVolume() {
		volume = (1/3.00) * Math.PI * dimensions[0] * dimensions[0] * dimensions[1];
	}

	/**
	 * Calculate the area
	 */
	@Override
	public void calculateArea() {
		area = Math.PI * dimensions[0]
				* (dimensions[0] + Math.sqrt((Math.pow(dimensions[0], 2) + Math.pow(dimensions[1], 2))));
	}
	/**
	 * Display cone information
	 */
	@Override
	public String toString() {
		return String.format("%sRadius: %.2f and Height: %.2f", super.toString(), dimensions[0], dimensions[1]);
	}
}
