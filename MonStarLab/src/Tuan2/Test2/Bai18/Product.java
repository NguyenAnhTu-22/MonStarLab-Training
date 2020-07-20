package Tuan2.Test2.Bai18;

public class Product {
	String name;
	String description;
	double price;
	int[] rate;

	public Product() {
		// TODO Auto-generated constructor stub
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public int[] getRate() {
//		return rate;
//	}
//
//	public void setRate(int[] rate) {
//		this.rate = rate;
//	}

	public String toString() {
		return "Name: " + name + "\n" + "Description: " + description + "\n" + "Price : " + price + "\n";

	}

	public void viewInfo() {
//		int sum = 0;
//		for (int i = 0; i < rate.length; i++) {
//			sum = sum + rate[i];
//		}
//		this.danhGia = (int) ((double) sum / rate.length);
		System.out.println(toString());
	}
}
