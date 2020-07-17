package Tuan2.Test2;

import java.util.Scanner;

public class Triangle {
	private int a;
	private int b;
	private int c;
	public static Scanner sc;

	public void BaCanh() {
		sc = new Scanner(System.in);
		System.out.println("Nhập cạnh a: ");
		a = sc.nextInt();

		System.out.println("Nhập cạnh b: ");
		b = sc.nextInt();

		System.out.println("Nhập cạnh c: ");
		c = sc.nextInt();
	}

	public void KieuTamGiac() {
		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Đây là tam giác thường !");
		} else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Đây là tam giác đều !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
			System.out.println("Đây không phải tam giác");
		}
	}

	public void ChuVi() {

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Chu vi tam giác: " + (a + b + c));
		} else
			System.out.println("Đây không phải tam giác");
	}

	public void DienTich() {
		int p = (a + b + c) / 2;
		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Diện tích tam giác: " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
		}
	}

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.BaCanh();
		tri.KieuTamGiac();
		tri.ChuVi();
		tri.DienTich();
	}

}
