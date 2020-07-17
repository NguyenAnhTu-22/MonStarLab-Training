package Tuan2.Test2;

import java.util.Scanner;

public class SoPhuc {
	private double phanthuc;
	private double phanao;

	public SoPhuc() {

	}

	public SoPhuc(double phanthuc, double phanao) {
		this.phanthuc = phanthuc;
		this.phanao = phanao;
	}

	public double getPhanthuc() {
		return phanthuc;
	}

	public void setPhanthuc(double phanthuc) {
		this.phanthuc = phanthuc;
	}

	public double getPhanao() {
		return phanao;
	}

	public void setPhanao(double phanao) {
		this.phanao = phanao;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Phan Thuc: ");
		phanthuc = sc.nextInt();

		System.out.println("Nhap Phan Ao: ");
		phanao = sc.nextInt();
	}

	public void Xuat() {
		System.out.println("So phuc là :" + phanthuc + "+" + phanao + "i");
	}

	public void Tong(SoPhuc sp) {
		double pt = this.getPhanthuc() + sp.getPhanthuc();
		double pa = this.getPhanao() + sp.getPhanao();
		SoPhuc Tong = new SoPhuc(pt,pa);
		System.out.println("Tong so phuc: " + Tong.phanthuc + "+" + Tong.phanao+"i");
	}
	public void Tru(SoPhuc sp) {
		double pt = this.getPhanthuc() - sp.getPhanthuc();
		double pa = this.getPhanao() - sp.getPhanao();
		SoPhuc Tru = new SoPhuc(pt,pa);
		System.out.println("Hieu so phuc: " + Tru.phanthuc + "+" + Tru.phanao+"i");
	}
	public void Tich(SoPhuc sp) {
		double pt = this.getPhanthuc()*sp.getPhanthuc() + this.getPhanao()*sp.getPhanao();
		double pa = this.getPhanthuc()*sp.getPhanao() + this.getPhanao()*sp.getPhanthuc();
		SoPhuc Tich = new SoPhuc(pt,pa);
		System.out.println("Tich so phuc: " + Tich.phanthuc + "+" + Tich.phanao+"i");
	}
	
	public static void main(String[] args) {
		SoPhuc sophuc = new SoPhuc();
		SoPhuc sp1 = new SoPhuc(2,3);
		sophuc.Nhap();
		sophuc.Xuat();
		sophuc.Tong(sp1);
		sophuc.Tru(sp1);
		sophuc.Tich(sp1);
	}
}
