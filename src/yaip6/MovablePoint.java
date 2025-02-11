package yaip6;

public class MovablePoint implements Moveable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "(" + this.x + "," + this.y +") speed=(" + this.xSpeed + "," + this.ySpeed + ")";
	}
	
	@Override
	public void moveUp() {
		this.y -= this.ySpeed;
	}
	@Override
	public void moveDown() {
		this.y += this.ySpeed;
	}
	@Override
	public void moveLeft() {
		this.y -= this.xSpeed;
	}
	@Override
	public void moveRight() {
		this.y += this.xSpeed;
	}
	
}
