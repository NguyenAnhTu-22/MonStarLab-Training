package Tuan2.Test2;

import java.util.Scanner;

public class SoNguyenTo {
	private int a;

	public SoNguyenTo() {
		a=0;
	}

	public SoNguyenTo(int x) {
		if (isSoNguyenTo(x) == true) {
			this.a = x;
			System.out.println("x là số nguyên tố");
			System.out.println("Số nguyên tố tiếp theo: "+ timSoNguyenToTiepTheo());
		}else
			System.out.println("x không phải số nguyên tố");
	}

	public boolean isSoNguyenTo(int x) {
		if (x < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int timSoNguyenToTiepTheo() {
		int ngtotiep;
		int i =0;
		while (true){
			if (isSoNguyenTo(this.a + ++i)== true)
				return this.a +i;
		}
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (isSoNguyenTo(a) == true)
			this.a = a;
	}
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập x:");
		x = sc.nextInt();
		SoNguyenTo snt = new SoNguyenTo(x);
	}
}
