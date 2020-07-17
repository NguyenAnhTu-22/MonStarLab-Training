package Tuan2.Test2;

import java.util.Scanner;

public class SoNguyenTo {
	private static int a;
	private static int x;

	public SoNguyenTo() {
	}

	public SoNguyenTo(int a) {
		if (isSoNguyenTo(x) == true)
			this.a = x;
		else
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
		int nghiem = a + 1;
		int index = 1;
		while (index == 1) {
			if (isSoNguyenTo(nghiem) == false) {
				nghiem++;
			} else {
				index = index - 1;
			}
		}
		return -1;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		if (isSoNguyenTo(a) == true)
			this.a = a;
	}
	public static void main(String[] args) {
		SoNguyenTo SoNguyenTo = new SoNguyenTo(2);
		int nghiem = a.timSoNguyenToTiepTheo();
	}
}
