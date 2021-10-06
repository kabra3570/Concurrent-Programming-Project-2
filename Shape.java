/**File: Shape.java
 * Author: Kevin Abrahams
 * Date: 9-02-2021
 * Purpose: Implement the Shape class which serves as the base class of all shapes.
 */
public abstract class Shape {
	// Number of dimensions
	private int numberOfDimensions;
	// Dimension value array
	protected double dimensions[];
	// Area of shape
	protected double area;
	// Counter for dimensions
	private int counter;

	/**
	 * Constructor used to set the number of dimensions and initialize the dimension
	 * 
	 * @param numberOfDimensions - Number of dimensions
	 */
	public Shape(int numberOfDimensions) {
		this.numberOfDimensions = numberOfDimensions;
		this.dimensions = new double[numberOfDimensions];
	}

	/**
	 * Get the area of shape
	 * 
	 * @return Area of shape
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Add the dimensions
	 * 
	 * @param dimension
	 */
	public void addDimension(double dimension) {
		if (counter < numberOfDimensions) {
			this.dimensions[counter++] = dimension;
		}
	}

	/**
	 * Calculate the area of shape
	 */
	public abstract void calculateArea();

	/**
	 * Get the number of dimensions
	 * 
	 * @return Number of dimensions
	 */
	public int getNumberOfDimensions() {
		return numberOfDimensions;
	}

	@Override
	public String toString() {
		return String.format("%s with ", getClass().getName());
	}
}
