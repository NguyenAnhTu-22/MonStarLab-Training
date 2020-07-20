package Tuan2.Test2.Bai12;



public class Main {
	public static void main(String[] args) {		
		HinhBinhHanh hbh = new HinhBinhHanh();
		hbh.setChieuDai(4);
		hbh.setChieuCao(3);
		hbh.setChieuRong(2);
		System.out.println(hbh.chuVi());
        System.out.println(hbh.dienTich());
        
        HinhChuNhat hcn = new HinhChuNhat();
		hcn.setChieuDai(4);
		hcn.setChieuCao(3);
		System.out.println(hcn.chuVi());
        System.out.println(hcn.dienTich());
        
		HinhVuong hv = new HinhVuong();
		hv.setChieuDai(4);
		hv.setChieuCao(4);
		System.out.println(hv.chuVi());
        System.out.println(hv.dienTich());
		
	}
	
}
