package Tuan2.Test2;

import java.util.Scanner;

public class Student {
	private String MaSinhVien;
	private double DiemTB;
	private int Tuoi;
	private String Lop;
	public static Scanner sc;

	public Student() {

	}

	public Student(String MaSinhVien, double DiemTB, int Tuoi, String Lop) {
		this.MaSinhVien = MaSinhVien;
		this.DiemTB = DiemTB;
		this.Tuoi = Tuoi;
		this.Lop = Lop;
	}

	public String getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		int i = 1;
		while (i == 1) {
			if (maSinhVien.length() == 8) {
				this.MaSinhVien = maSinhVien;
				i = i - 1;
			} else {
				System.out.println("Nhập sai");
				maSinhVien = sc.nextLine();
			}
		}
		this.MaSinhVien = maSinhVien;
	}

	public double getDiemTB() {
		return DiemTB;
	}

	public void setDiemTB(double diemTB) {
		int i = 1;
		while (i == 1) {
			if (diemTB >= 0.0 && diemTB <= 10.0) {
				this.DiemTB = diemTB;
				i = i - 1;
			} else {
				System.out.println("Nhập sai");
				diemTB = sc.nextDouble();
			}
		}
		this.DiemTB = diemTB;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		int i = 1;
        while (i == 1){
            if(tuoi >= 18){
                this.Tuoi = tuoi;
                i = i - 1;
            }else {
                System.out.println("Nhập sai");
                tuoi = sc.nextInt();
            }
        }
        this.Tuoi = tuoi;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		int i = 1;
        while (i == 1){
            char[] Lop = lop.toCharArray();
            if(Lop[0] == 'A' || Lop[0] == 'C'){
                this.Lop = lop;
                i = i - 1;
            }else {
                System.out.println("Nhập sai");
                lop = sc.nextLine();
            }
        }
        this.Lop = lop;
	}

	public void inputInfo() {
		sc = new Scanner(System.in);
		System.out.println("Nhap MSV (gồm 8 kí tự): ");
		MaSinhVien = sc.nextLine();
		setMaSinhVien(MaSinhVien);
		System.out.println("Nhap ĐTB (từ 0.0 đến 10.0): ");
		DiemTB = sc.nextDouble();
		setDiemTB(DiemTB);
		System.out.println("Nhap Tuoi (lớn hơn hoặc bằng 18): ");
		Tuoi = sc.nextInt();
		setTuoi(Tuoi);
		sc.nextLine();
		System.out.println("Nhap Lop (Bắt đầu bằng 'A' hoặc 'C'): ");
		Lop = sc.nextLine();
		setLop(Lop);
	}

	public void showInfo() {
		System.out.println("Mã Sinh Viên: " + MaSinhVien);
		System.out.println("Điểm trung bình: " + DiemTB);
		System.out.println("Tuổi: " + Tuoi);
		System.out.println("Lớp: " + Lop);
	}

	public void XetHocBong() {
		if (DiemTB > 8.0) {
			System.out.println("Sinh viên được học bổng");
		} else
			System.out.println("Sinh viên không được học bổng");
	}

	public static void main(String[] args) {
		Student st = new Student();
		st.inputInfo();
		st.showInfo();
		st.XetHocBong();
	}
}