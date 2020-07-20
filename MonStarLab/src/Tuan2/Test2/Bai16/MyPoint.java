package Tuan2.Test2.Bai16;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(x,y) = (" + x + ", " + y + ")";
	}

	public double distance(int x, int y) {
		int hoanhDo = (x - this.x);
		int tungDo = (y - this.y);
		return Math.sqrt(hoanhDo * hoanhDo + tungDo * tungDo);
	}

	public double distance(MyPoint point1) {
		int hoanhDo = (x - point1.x);
		int tungDo = (y - point1.y);
		return Math.sqrt(hoanhDo * hoanhDo + tungDo * tungDo);
	}

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5, 6));
	}
}
