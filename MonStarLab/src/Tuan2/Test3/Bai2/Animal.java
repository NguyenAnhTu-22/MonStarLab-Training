package Tuan2.Test3.Bai2;

import java.util.Scanner;

public abstract class Animal {
	private String ten;
	private int tuoi;
	private String moTa;
	public static Scanner sc = new Scanner(System.in);

	public abstract void tiengKeu();

	public Animal() {

	}

	public Animal(String ten) {
		this.ten = ten;
	}

	public Animal(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public Animal(String ten, int tuoi, String moTa) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.moTa = moTa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public void inputAnimal() {
		System.out.println("Nhập tên:");
		setTen(sc.nextLine());
		System.out.println("Nhập tuổi:");
		setTuoi(sc.nextInt());
		System.out.println("Nhập mô tả:");
		setMoTa(sc.nextLine());
	}
	public void xemThongTin() {
		System.out.println("Tên: "+ten);
		System.out.println("Tuổi"+tuoi);
		System.out.println("Mô tả"+moTa);
	}
}
