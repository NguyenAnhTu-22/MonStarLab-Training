package Tuan2.Test3.Bai1;

import java.util.Scanner;

public class Teacher extends Person {
	private String lop;
	private int luongMotGio;
	private int gioDay;
	private int luongThucNhan;
	public static Scanner sc = new Scanner(System.in);

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String lop, int luongMotGio, int gioDay) {
		this.lop = lop;
		this.luongMotGio = luongMotGio;
		this.gioDay = gioDay;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getLuongMotGio() {
		return luongMotGio;
	}

	public void setLuongMotGio(int luongMotGio) {
		this.luongMotGio = luongMotGio;
	}

	public int getGioDay() {
		return gioDay;
	}

	public void setGioDay(int gioDay) {
		this.gioDay = gioDay;
	}

	public int getLuongThucNhan() {
		return luongThucNhan;
	}

	@Override
	public void inputInfo() {
		// TODO Auto-generated method stub
		super.inputInfo();
		System.out.println("Lớp dạy: ");
		setLop(sc.nextLine());
		sc.nextLine();

		System.out.println("Lương một giờ dạy: ");
		setLuongMotGio(sc.nextInt());

		System.out.println("Số giờ dạy trong tháng:");
		setGioDay(sc.nextInt());

		getLuongThucNhan();

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Lớp dạy: " + lop);
		System.out.println("Lương một giờ dạy: " + luongMotGio);
		System.out.println("Số giờ dạy trong tháng: " + gioDay);
		getluongThucNhan();
	}

	public void getluongThucNhan() {
        char[] lop = getLop().toCharArray();
        int x = lop.length;
        char kiTuLop = lop[x-1];
        if(Character.toString(kiTuLop).equals("L")
            || Character.toString(kiTuLop).equals("M") ){
            this.luongThucNhan = luongMotGio * gioDay + 200000;
        }else this.luongThucNhan = luongMotGio * gioDay;
		System.out.println("Lương thực được nhận: " + luongThucNhan);

	}

}
