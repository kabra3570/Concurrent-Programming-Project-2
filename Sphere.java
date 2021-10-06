/**File: Sphere.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Sphere class which extends ThreeDimensionalShape, providing a definition for spheres in the program.
 */
public class Sphere extends ThreeDimensionalShape {
	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public Sphere(int numberOfDimensions) {
		super(numberOfDimensions);
	}

	/**
	 * Calculate the area
	 */
	public void calculateArea() {
		area = (4 * Math.PI) * (Math.pow(dimensions[0], 2));
	}

	/**
	 * Calculate the volume
	 */
	public void calculateVolume() {
		volume = (1.3333 * Math.PI) * (Math.pow(dimensions[0], 3));
	}

	/**
	 * Display sphere information
	 */
	@Override
	public String toString() {
		return String.format("%sRadius: %.2f", super.toString(), dimensions[0]);
	}
}
