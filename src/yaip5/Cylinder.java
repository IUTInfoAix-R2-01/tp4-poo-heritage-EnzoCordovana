package yaip5;

public class Cylinder extends Circle {
	private Circle base;
	private double height;
	
	public Cylinder() {
		this.base = new Circle();
		this.height = 1.0;
	}
}
