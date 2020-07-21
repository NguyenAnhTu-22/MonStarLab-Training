package Tuan2.Test3.Bai2;

import java.util.Scanner;

public class TestZoo {
	public static Zoo zoo = new Zoo();
	public static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("1- Thêm chuồng");
		System.out.println("2- Xóa chuồng");
		System.out.println("3- Thêm con vật");
		System.out.println("4- Xóa con vật");
		System.out.println("5- Xem tất cả con vật");
		System.out.println("6- Thoát");
	}

	public static void menuAnimal() {
		System.out.println("1- Add Tiger: ");
		System.out.println("2- Add Dog: ");
		System.out.println("3- Add Cat: ");
		System.out.println("4- Thoát: ");
	}

	public static void fun1() {
		System.out.println("Nhập mã chuồng cần thêm: ");
		Chuong chuong = new Chuong();
		chuong.setMaChuong(sc.nextInt());
		zoo.danhSachChuong.add(chuong);
	}

	public static void fun2() {
		System.out.println("Nhập mã chuồng cần xóa: ");
		int maChuong = sc.nextInt();
		zoo.xoaChuong(maChuong);
	}

	public static void fun3() {
		chooseAnimal();
	}

	public static void fun4() {
		System.out.println("Nhập tên con vật: ");
		String ten = sc.nextLine();
		for (Chuong chuong : zoo.danhSachChuong) {
			chuong.xoaConVat(ten);
		}
	}

	public static void fun5() {
		for (Chuong chuong : zoo.danhSachChuong) {
			chuong.inThongTinChuong();
		}
	}

	public static void choose() {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (i > 0) {
			System.out.println("----------------------");
			menu();
			System.out.println("Nhập số lựa chọn");
			int index = scan.nextInt();
			switch (index) {
			case 1:
				fun1();
				break;
			case 2:
				fun2();
				break;
			case 3:
				fun3();
				break;
			case 4:
				fun4();
				break;
			case 5:
				fun5();
				break;
			case 6:
				i = i - 1;
				break;
			}
		}
	}

	public static void funnew1() {
		System.out.println("Nhập mã số chuồng(Chưa có phải tạo): ");
		int maChuong = sc.nextInt();
		for (Chuong chuong : zoo.danhSachChuong) {
			if (chuong.getMaChuong() == maChuong) {
				Tiger tiger = new Tiger();
				tiger.inputAnimal();
				chuong.animalList.add(tiger);
			}
		}
	}

	public static void funnew2() {
		System.out.println("Nhập mã số chuồng(Chưa có phải tạo): ");
		int maChuong = sc.nextInt();
		for (Chuong chuong : zoo.danhSachChuong) {
			if (chuong.getMaChuong() == maChuong) {
				Dog dog = new Dog();
				dog.inputAnimal();
				chuong.animalList.add(dog);
			}
		}
	}

	public static void funnew3() {
		System.out.println("Nhập mã số chuồng(Chưa có phải tạo): ");
		int maChuong = sc.nextInt();
		for (Chuong chuong : zoo.danhSachChuong) {
			if (chuong.getMaChuong() == maChuong) {
				Cat cat = new Cat();
				cat.inputAnimal();
				chuong.animalList.add(cat);
			}
		}
	}

	public static void chooseAnimal() {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (i > 0) {
			menuAnimal();
			System.out.println("Chọn con vật");
			int index = scan.nextInt();
			switch (index) {
			case 1:
				funnew1();
				break;
			case 2:
				funnew2();
				break;
			case 3:
				funnew3();
				break;
			case 4:
				i = i - 1;
				break;
			}
		}
	}

	public static void main(String[] args) {
		choose();
	}

}
