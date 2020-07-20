package Tuan2.Test2.Bai16;

public class MyCircle {
	private MyPoint myPoint;
	private int banKinh;
	private int x;
	private int y;

	public MyCircle(int x, int y, int banKinh) {
		this.myPoint = new MyPoint(x, y);
		this.banKinh = banKinh;
		this.x = x;
		this.y = y;
	}

	public MyCircle(MyPoint myPoint, int banKinh) {
		this.x = myPoint.getX();
		this.y = myPoint.getY();
		this.myPoint = myPoint;
		this.banKinh = banKinh;
	}

	public MyPoint getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(MyPoint myPoint) {
		this.myPoint = myPoint;
	}

	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}

	public String toString() {
		return "Hình tròn @(" + x + "," + y + "), bán kính = " + banKinh;
	}

	public void getArea() {
		double area = Math.PI * banKinh;
		System.out.println("Diện tích: " + area);
	}
}
