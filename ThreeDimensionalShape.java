/**File: ThreeDimensionalShape.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the ThreeDimensionalShape class which extends shape, providing a broad categorization,
 * classification, and grouping of more specific types of shapes.
 */
public abstract class ThreeDimensionalShape extends Shape {
	protected double volume;// Volume of three dimensional shape

	/**
	 * Constructor used to set number of dimensions
	 * 
	 * @param numberOfDimensions - Number of Dimensions
	 */
	public ThreeDimensionalShape(int numberOfDimentions) {
		super(numberOfDimentions);
	}

	/**
	 * Get the volume three dimensional shape
	 * 
	 * @return Volume of three dimensional shape
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * Calculate volume
	 */
	public abstract void calculateVolume();
}
