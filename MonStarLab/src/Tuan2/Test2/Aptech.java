package Tuan2.Test2;

import java.util.Scanner;

public class Aptech {
	private boolean KhoaHoc;
	private int Diem;
	private boolean NoiQuy;
	private int KiThi;

	public Aptech() {
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Đăng kí khóa học HDSE");
		System.out.println("1- Có            2- Không");

		int i = sc.nextInt();
		if (i == 1)
			KhoaHoc = true;
		else
			KhoaHoc = false;

		System.out.println("Điểm tổng kết");
		this.Diem = sc.nextInt();

		System.out.println("Vi phạm nội quy");
		System.out.println("1- Có            2- Không");

		int i1 = sc.nextInt();
		if (i1 == 2)
			NoiQuy = true;
		else
			NoiQuy = false;

		System.out.println("Số lần thi của các kì thi");
		int i2 = sc.nextInt();
		this.KiThi = i2;
	}

	public void XetHocBong() {
		if (KhoaHoc == true && Diem >= 75 && NoiQuy == true && KiThi == 1) {
			System.out.println("Được học bổng");
		} else {
			System.out.println("Không được học bổng");
		}
	}

	public static void main(String[] args) {
		Aptech ap = new Aptech();
		ap.input();
		ap.XetHocBong();
	}

}
