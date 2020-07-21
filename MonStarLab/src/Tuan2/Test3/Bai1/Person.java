package Tuan2.Test3.Bai1;

import java.util.Scanner;

public class Person {
	private String ten;
	private String gioiTinh;
	private String ngaySinh;
	private String diaChi;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên :");
		setTen(sc.nextLine());
		System.out.println("Nhập giới tính:");
		setGioiTinh(sc.nextLine());
		System.out.println("Nhập ngày sinh:");
		setNgaySinh(sc.nextLine());
		System.out.println("Nhập địa chỉ:");
		setDiaChi(sc.nextLine());
	}
	public void showInfo() {
		System.out.println("Tên: "+ten);
		System.out.println("Giới tính: "+gioiTinh);
		System.out.println("Ngày sinh: "+ngaySinh);
		System.out.println("Địa chỉ: "+diaChi);
	}
}
