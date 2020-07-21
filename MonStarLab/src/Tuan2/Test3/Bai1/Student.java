package Tuan2.Test3.Bai1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student extends Person {
	private String maSinhVien;
	private double diemTB;
	private String email;
	public static Scanner sc = new Scanner(System.in);
	private static final String EMAIL_PATTERN = "(?=.*[@])";
	private Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	public boolean validate(final String email) {
		return pattern.matcher(email).matches();
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String maSinhVien, double diemTB, String email) {
		this.maSinhVien = maSinhVien;
		this.diemTB = diemTB;
		this.email = email;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		int i = 1;
		while (i == 1) {
			if (maSinhVien.length() == 8) {
				this.maSinhVien = maSinhVien;
				i = i - 1;
			} else {
				System.out.println("Error");
				maSinhVien = sc.nextLine();
			}
		}
		this.maSinhVien = maSinhVien;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		int i = 1;
		while (i == 1) {
			if (diemTB >= 0.0 && diemTB <= 10.0) {
				this.diemTB = diemTB;
				i = i - 1;
			} else {
				System.out.println("Error");
				diemTB = sc.nextDouble();
			}
		}
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
//		int i = 1;
//		while (i == 1) {
//			String str = "";
//			if (str.contains("@")) {
//				this.email = email;
//				i = i - 1;
//			} else {
//				System.out.println("Error");
//				email = sc.nextLine();
//			}
//		}
		int i = 1;
        while (i == 1){
            if(validate(email)==false){
                this.email = email;
                i = i - 1;
            }else {
                System.out.println("Error");
                email = sc.nextLine();
            }
        }
		this.email = email;
	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		System.out.println("Nhập mã sinh viên (8 kí tự): ");
		setMaSinhVien(sc.nextLine());
		System.out.println("Nhập điểm trung bình (0.0 -> 10.0): ");
		setDiemTB(sc.nextDouble());
		sc.nextLine();
		System.out.println("Email sinh viên: ");
		setEmail(sc.nextLine());
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Mã sinh viên: " + maSinhVien);
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Email: " + email);
	}

	public boolean isHocBong() {
		return getDiemTB() >= 8.0 ? true : false;
	}
}
