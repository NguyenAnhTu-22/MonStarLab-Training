package Tuan2.Test3.Bai2;

import java.util.ArrayList;

public class Chuong {
	public int maChuong;
	public static ArrayList<Animal> animalList = new ArrayList<>();

	public int getMaChuong() {
		return maChuong;
	}

	public void setMaChuong(int maChuong) {
		this.maChuong = maChuong;
	}

	public void themConVat(Animal a) {
		animalList.add(a);
	}

	public void xoaConVat(String ten) {
		for (int i = 0; i < animalList.size(); i++) {
			if (animalList.get(i).getTen().trim().equals(ten.trim()) == true)
				animalList.remove(i);
		}
	}
	public void inThongTinChuong() {
		System.out.println("Chuồng: "+maChuong);
		for(Animal animal : animalList) {
			System.out.println(animal.toString());
		}
	}
}
