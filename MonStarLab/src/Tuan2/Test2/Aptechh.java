package Tuan2.Test2;

import java.util.Scanner;

public class Aptechh {

	private boolean laHocVien;
	private int diemTongKet;
	private boolean noiQuy;
	private int lanThi;

	public Aptechh() {
	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Là học viên đăng kí khóa học HDSE");
		System.out.println("1- Có            2- Không");

		int i = scan.nextInt();
		if (i == 1)
			laHocVien = true;
		else
			laHocVien = false;

		System.out.println("Nhập điểm tổng kết");
		this.diemTongKet = scan.nextInt();

		System.out.println("Vi phạm nội quy của trung tâm");
		System.out.println("1- Có            2- Không");

		int i1 = scan.nextInt();
		if (i1 == 2)
			noiQuy = true;
		else
			noiQuy = false;

		System.out.println("Số lần thi của các kì thi");
		int i2 = scan.nextInt();
		this.lanThi = i2;
	}

	public void ketQua() {
		if (laHocVien == true && diemTongKet >= 75 && noiQuy == true && lanThi == 1) {
			System.out.println("Nhận được học bổng");
		} else {
			System.out.println("Không đủ điều kiện nhận học bổng");
		}
	}

	public static void main(String[] args) {
		Aptechh ap = new Aptechh();
		ap.inputData();
		ap.ketQua();
	}

}
