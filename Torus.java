/**File: Torus.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Torus class which extends ThreeDimensionalShape, providing a definition for toruses in the program.
 */
public class Torus extends ThreeDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Torus(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	@Override
	public void calculateVolume() {
		volume = (Math.PI * dimensions[0] * dimensions[0]) * (2 * Math.PI * dimensions[1]);
	}

	@Override
	public void calculateArea() {
		area = 2 * Math.PI * dimensions[0] * 2 * Math.PI * dimensions[1];
	}
	/**
	 * Display Torus information
	 */
	@Override
	public String toString() {
		return String.format("%sMinor Radius: %.2f and Major Radius: %.2f", super.toString(), dimensions[0], dimensions[1]);
	}
}
