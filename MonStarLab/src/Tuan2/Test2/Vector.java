package Tuan2.Test2;

import java.util.Scanner;

public class Vector {
	private int Hoanhdo1;
	private int Tungdo1;
	private int Hoanhdo2;
	private int Tungdo2;

	public Vector() {

	}

	public Vector(int Hoanhdo1, int Tungdo1, int Hoanhdo2, int Tungdo2) {
		this.Hoanhdo1 = Hoanhdo1;
		this.Tungdo1 = Tungdo1;
		this.Hoanhdo2 = Hoanhdo2;
		this.Tungdo2 = Tungdo2;

	}

	public int getHoanhdo1() {
		return Hoanhdo1;
	}

	public void setHoanhdo1(int hoanhdo1) {
		Hoanhdo1 = hoanhdo1;
	}

	public int getTungdo1() {
		return Tungdo1;
	}

	public void setTungdo1(int tungdo1) {
		Tungdo1 = tungdo1;
	}

	public int getHoanhdo2() {
		return Hoanhdo2;
	}

	public void setHoanhdo2(int hoanhdo2) {
		Hoanhdo2 = hoanhdo2;
	}

	public int getTungdo2() {
		return Tungdo2;
	}

	public void setTungdo2(int tungdo2) {
		Tungdo2 = tungdo2;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Toa do diem dau: ");
		Hoanhdo1 = sc.nextInt();
		Tungdo1 = sc.nextInt();
		System.out.println("Toa do diem cuoi: ");
		Hoanhdo2 = sc.nextInt();
		Tungdo2 = sc.nextInt();

	}

	public void Xuat() {
		int Hoanhdo = Hoanhdo2 - Hoanhdo1;
		int Tungdo = Tungdo2 - Tungdo1;
		System.out.println("Toa do vecto: " + "(" + Hoanhdo + "," + Tungdo + ")");
	}

	public void KtraBangNhau(Vector vt) {
		if ((this.getHoanhdo2() - this.getHoanhdo1()) == (vt.getHoanhdo2() - vt.getHoanhdo1())
				&& (this.getTungdo2() - this.getTungdo1()) == (vt.getTungdo2() - vt.getTungdo1()))
			System.out.println("Hai vecto bằng nhau");
		else
			System.out.println("Hai vecto không bằng nhau");
	}

	public void gocgiua2VT(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();
		double cos = (a1 * a2 + b1 * b2) / (Math.sqrt(a1 * a1 + b1 * b1)) * (Math.sqrt(a2 * a2 + b2 * b2));
		System.out.println("Cos góc giữa 2 vector:" + cos);
	}

	public void module(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();
		double module = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("Module: " + module);
	}

	public void KtraCungPhuong(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();

		int k = a2 / a1;
		if (k != 0) {
			System.out.println("Hai vector cùng phương");
		} else
			System.out.println("Hai vecter không cùng phương");
	}

	public void Tong(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();
		int sumhd = a1 + a2;
		int sumtd = b1 + b2;
		System.out.println("Tổng 2 vector: " + "(" + sumhd + "," + sumtd + ")");
	}

	public void Hieu(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();
		int hieuhd = a1 - a2;
		int hieutd = b1 - b2;
		System.out.println("Hiệu 2 vector: " + "(" + hieuhd + "," + hieutd + ")");
	}

	public void Tich(Vector vt) {
		int a1 = this.getHoanhdo2() - this.getHoanhdo1();
		int a2 = vt.getHoanhdo2() - vt.getHoanhdo1();
		int b1 = this.getTungdo2() - this.getTungdo1();
		int b2 = vt.getTungdo2() - vt.getTungdo1();
		int tichhd = a1 * a2;
		int tichtd = b1 * b2;
		System.out.println("Tích 2 vector: " + "(" + tichhd + "," + tichtd + ")");
	}

	public static void main(String[] args) {
		Vector vector = new Vector();
		Vector vector2 = new Vector(3, 3, 9, 6);
		vector.Nhap();
		vector.Xuat();
		vector.KtraBangNhau(vector2);
		vector.gocgiua2VT(vector2);
		vector.module(vector2);
		vector.KtraCungPhuong(vector2);
		vector.Tong(vector2);
		vector.Hieu(vector2);
		vector.Tich(vector2);
	}
}
