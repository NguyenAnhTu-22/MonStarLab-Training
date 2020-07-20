package Tuan2.Test2.Bai18;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	public ArrayList<Product> productList = new ArrayList<>();
	private ArrayList<Integer> danhGia = new ArrayList();
	private Scanner sc;

	public void addProduct() {
		sc = new Scanner(System.in);
		Product pr = new Product();

		System.out.println("Name product");
		String name = sc.nextLine();

		System.out.println("Description");
		String description = sc.nextLine();

		do {
			System.out.println("Price(0<price<=100)");
			pr.price = sc.nextDouble();
		} while (!(0 < pr.price && pr.price <= 100));

		int n;
		do {
			System.out.println("Number of rates:");
			n = sc.nextInt();
		}while(n>0);
		pr.rate = new int[n];
		for (int i = 0; i < n; i++) {
			do {
				System.out.format("Rate %d:", i + 1);
				pr.rate[i] = sc.nextInt();
			} while (!(1 <= pr.rate[i] && pr.rate[i] <= 5));
		}
	}

	public void removeProduct() {
		String name;
		boolean timThay = false;
		System.out.println("Input name of product remove: ");
		name = sc.nextLine();
		for (Product p : productList) {
			if (p.name.equals(name)) {
				timThay = true;
				productList.remove(p);
				System.out.println("Removed product");
				break;
			}
		}
		if (!timThay)
			System.out.println("No product name" + name);
	}

	public void iterateProductList() {
		double avgRate;
		for (Product pList : productList) {
			pList.viewInfo();
			avgRate = 0;
			for (int i : pList.rate) {
				avgRate += i;
			}
			System.out.println("Averate rate: " + avgRate / pList.rate.length);
		}
	}

	public void searchProduct() {
		sc = new Scanner(System.in);
		System.out.println("Value min: ");
		int min = sc.nextInt();
		System.out.println("Value max: ");
		int max = sc.nextInt();
		for (Product product : productList) {
			if (product.price >= min && product.price <= max) {
				product.viewInfo();
			}
		}
	}

//	public void sortProduct() {
//		// TODO Auto-generated method stub
//		Product pr = new Product();
//		pr.getPrice();
//		int price = (int) pr.getPrice();
//		double arr[] = new double[(int) price];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = (int) arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//	}
}
