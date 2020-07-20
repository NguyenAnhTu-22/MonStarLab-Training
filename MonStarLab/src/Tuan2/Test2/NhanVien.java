package Tuan2.Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {

	private String Ten;
	private int Tuoi;
	private String DiaChi;
	private double TienLuong;
	private int GioLam;

	public NhanVien() {
	}

	public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int GioLam) {
		this.Ten = Ten;
		this.Tuoi = Tuoi;
		this.DiaChi = DiaChi;
		this.TienLuong = TienLuong;
		this.GioLam = GioLam;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public double getTienLuong() {
		return TienLuong;
	}

	public void setTienLuong(double tienLuong) {
		TienLuong = tienLuong;
	}

	public int getGioLam() {
		return GioLam;
	}

	public void setGioLam(int gioLam) {
		GioLam = gioLam;
	}

	public void inputInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập tên");
		this.Ten = scan.nextLine();
		System.out.println("Nhập tuổi");
		this.Tuoi = scan.nextInt();
		System.out.println("Nhập địa chỉ");
		scan.nextLine();
		this.DiaChi = scan.nextLine();
		System.out.println("Nhập lương");
		this.TienLuong = scan.nextDouble();
		System.out.println("Nhập số giờ làm");
		this.GioLam = scan.nextInt();
	}



	public void outputInfo() {
		System.out.println("Tên: " + Ten);
		System.out.println("Tuổi: " + Tuoi);
		System.out.println("Địa chỉ: "+ DiaChi);
		System.out.println("Lương: "+ TienLuong);
		System.out.println("Giờ làm: "+ GioLam);
	}

	public double tinhThuong() {
		if (GioLam >= 200)
			TienLuong = TienLuong * 1.2;
		else if (GioLam < 200 && GioLam >= 100)
			TienLuong = TienLuong * 1.1;
		return TienLuong;
	}

	public static void menu() {
		System.out.println("1- Nhập thông tin nhân viên");
		System.out.println("2- In thông tin nhân viên");
		System.out.println("3- Thoát");
	}

	public static void main(String[] args) {
		ArrayList<NhanVien> nhanVien = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i > 0) {
			menu();
			System.out.println("Nhập số lựa chọn");
			int index = sc.nextInt();
			switch (index) {
			case 1:
				NhanVien nv = new NhanVien();
				nv.inputInfo();
				nhanVien.add(nv);
				break;
			case 2:
				for (int k = 0; k < nhanVien.size(); k++) {
					nhanVien.get(k).tinhThuong();
					nhanVien.get(k).outputInfo();
				}
				break;
			case 3:
				i = i - 1;
				break;
			}
		}
	}
}
