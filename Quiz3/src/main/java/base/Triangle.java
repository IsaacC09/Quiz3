package base;
 
public class Triangle {
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

	public Triangle(double side1, double side2, double side3) throws TriangleException {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if ( ((side1 + side2) >= side3) && ((side3 + side1) >= side2) && ((side2 + side3) >= side1) ) {

		} else {
			throw new TriangleException(this);
		}
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
			double s = (side1 + side2 + side3) / 2;
			double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			return area;

	}

	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	@Override
	public String toString(Triangle t) {	
		x= ("This traingle has area " + t.getArea() + " and periemter " + t.getPerimeter() ".");
		return super.toString(x);
		
	}

	
	




}
