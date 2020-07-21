package Tuan2.Test3.Bai2;

import java.util.ArrayList;

public class Zoo {
	public static ArrayList<Chuong> danhSachChuong = new ArrayList<>();
	public void themChuong(Chuong c) {
		danhSachChuong.add(c);
	}
	public void xoaChuong(int maChuong) {
		for(int i=0;i<danhSachChuong.size();i++) {
			if(danhSachChuong.get(i).getMaChuong() == maChuong)
				danhSachChuong.remove(i);
		}
	}

}

