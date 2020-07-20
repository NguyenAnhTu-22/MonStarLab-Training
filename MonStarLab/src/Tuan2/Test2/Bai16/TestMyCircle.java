package Tuan2.Test2.Bai16;

public class TestMyCircle {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(3,0);
		MyCircle mc = new MyCircle(p1, 8);
		System.out.println(mc.toString());
		mc.getArea();
		
	}
}
