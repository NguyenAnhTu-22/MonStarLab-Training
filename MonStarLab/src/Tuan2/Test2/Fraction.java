package Tuan2.Test2;

import java.util.Scanner;

public class Fraction {
	private int TuSo;
	private int MauSo;
	public static Scanner sc;

	public Fraction() {

	}

	public Fraction(int TuSo, int MauSo) {
		this.TuSo = TuSo;
		this.MauSo = MauSo;
	}

	public int getTuSo() {
		return TuSo;
	}

	public void setTuSo(int tuSo) {
		TuSo = tuSo;
	}

	public int getMauSo() {
		return MauSo;
	}

	public void setMauSo(int mauSo) {
		MauSo = mauSo;
	}

	public void Nhap() {
		sc = new Scanner(System.in);
		System.out.println("Nhap Tu So: ");
		TuSo = sc.nextInt();

		System.out.println("Nhap Mau So: ");
		MauSo = sc.nextInt();
	}

	public void Xuat() {
		System.out.println("Phan So là :" + TuSo + "/" + MauSo);
	}

	public int timUCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public void rutgonPhanSo() {
		int i = timUCLN(TuSo, MauSo);
		this.setTuSo(this.getTuSo() / i);
		this.setMauSo(this.getMauSo() / i);
		System.out.println("Phan so rut gon: " + TuSo + "/" + MauSo);
	}

	public void nghichdaoPhanSo() {
		int tem = getTuSo();
		this.TuSo = getMauSo();
		this.MauSo = tem;
		System.out.println("Phan so nghich dao: " + TuSo + "/" + MauSo);
	}

	public void add(Fraction fr) {
		int ts = this.getTuSo() * fr.getMauSo() + fr.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * fr.getMauSo();
		Fraction PhanSoTong = new Fraction(ts,ms);
		PhanSoTong.rutgonPhanSo();
		System.out.println("Tong phan so: " + PhanSoTong.TuSo + "/" + PhanSoTong.MauSo);
	}

	public void sub(Fraction fr) {
		int ts = this.getTuSo() * fr.getMauSo() - fr.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * fr.getMauSo();
		Fraction PhanSoHieu = new Fraction(ts,ms);
		PhanSoHieu.rutgonPhanSo();
		System.out.println("Tong phan so: " + PhanSoHieu.TuSo + "/" + PhanSoHieu.MauSo);
	}

	public void mul(Fraction fr) {
		int ts = this.getTuSo() * fr.getTuSo();
		int ms = this.getMauSo() * fr.getMauSo();
		Fraction PhanSoTich = new Fraction(ts,ms);
		PhanSoTich.rutgonPhanSo();
		System.out.println("Tong phan so: " + PhanSoTich.TuSo + "/" + PhanSoTich.MauSo);
	}

	public void div(Fraction fr) {
		int ts = this.getTuSo() * fr.getMauSo();
		int ms = this.getMauSo() * fr.getTuSo();
		Fraction PhanSoThuong = new Fraction(ts,ms);
		PhanSoThuong.rutgonPhanSo();
		System.out.println("Tong phan so: " + PhanSoThuong.TuSo + "/" + PhanSoThuong.MauSo);
	}
	public static void main(String[] args) {
		Fraction frac = new Fraction();
		Fraction frac2 = new Fraction(4,8);
		frac.Nhap();
		frac.Xuat();
		frac.rutgonPhanSo();
		frac.nghichdaoPhanSo();
		frac.add(frac2);
		frac.sub(frac2);
		frac.mul(frac2);
		frac.div(frac2);
	}
}
