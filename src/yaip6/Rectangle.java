package yaip6;

public class Rectangle  implements GeometricObject {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	@Override
	public double getArea() {
		return this.length * this.width;
	}
	
	@Override
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
}
