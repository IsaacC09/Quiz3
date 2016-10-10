package base;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	double s = (side1 + side2 + side3) / 2;

	public Triangle() {
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	/**
	 * Creates a real triangle
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @throws TriangleException
	 * 
	 */
	public Triangle(double side1, double side2, double side3) throws TriangleException {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		if (((side1 + side2) >= side3) && ((side3 + side1) >= side2) && ((side2 + side3) >= side1)) {

		} else {
			throw new TriangleException(this);
		}
	}

	/**
	 * Returns side1 of triangle
	 * 
	 * @param getSide1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * Returns side2 of triangle
	 * 
	 * @param getSide2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * Returns side3 of triangle
	 * 
	 * @param getSide3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Returns the area of the given triangle
	 * 
	 * @param getArea()
	 */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;

	}

	/**
	 * Returns the perimeter of the given triangle
	 * 
	 * @param getPerimeter()
	 */
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	/**
	 * Returns a description of the given triangle which includes side lengths,
	 * area and perimeter.
	 * 
	 * @param toString()
	 */
	@Override
	public String toString() {
		return "This triangle has side lengths " + getSide1() + ", " + getSide2() + " and " + getSide3()
				+ ". It's area is " + getArea() + " and perimeter is " + getPerimeter() + ".";

	}

}
