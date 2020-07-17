package Tuan2.Test2;

import java.util.Scanner;

public class Rectangle {
	private int a;
	private int b;

	public static Scanner sc;

	public void Nhap() {
		sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		a = sc.nextInt();

		System.out.println("Nhập chiều rộng: ");
		b = sc.nextInt();
	}

	public void DienTich() {
		System.out.println("Diện tích là: " + a * b);
	}

	public void ChuVi() {
		System.out.println("Chu vi là: " + (a + b) * 2);
	}

	public static void main(String[] args) {
		Rectangle re = new Rectangle();
		re.Nhap();
		re.ChuVi();
		re.DienTich();
	}
}
