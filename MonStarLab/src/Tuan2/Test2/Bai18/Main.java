package Tuan2.Test2.Bai18;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("PRODUCT MANAGEMENT SYSTEM");
		System.out.println("1- Add new product");
		System.out.println("2- Remove product");
		System.out.println("3- Iterate product list");
		System.out.println("4- Search product");
		System.out.println("5- Sort product");
		System.out.println("6- Exit");
	}
	
	public static void option() {
		Scanner sc = new Scanner(System.in);
		Shop shop = new Shop();

		int i = 1;
		while (true) {
			menu();
			System.out.println("Option: ");
			int index = sc.nextInt();
			switch (index) {
			case 1:
				shop.addProduct();
				break;
			case 2:
				shop.removeProduct();
				break;
			case 3:
				shop.iterateProductList();
				break;
			case 4:
				shop.searchProduct();
				break;
//			case 5:
//				shop.sortProduct();
//				break;
			case 6:
				i = i - 1;
				break;
			}
		}
	}

	public static void main(String[] args) {
		option();
	}
}
