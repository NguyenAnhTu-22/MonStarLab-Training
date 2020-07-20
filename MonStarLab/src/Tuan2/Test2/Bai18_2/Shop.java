package Tuan2.Test2.Bai18_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Shop {
    public ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<Integer> danhGia = new ArrayList();
    private Scanner scan;

    public void addProduct(){
        scan = new Scanner(System.in);
        Product prod = new Product();

        System.out.println("Input product");
        String name = scan.nextLine();
        prod.setName(name);

        System.out.println("Description");
        String description= scan.nextLine();
        prod.setDescription(description);

        System.out.println("Input cost");
        double price = Double.parseDouble(scan.nextLine());
        prod.setPrice(price);

        System.out.println("Rate(1-5)");
        int index = 1;

        while(index == 1){
            int k = scan.nextInt();
            if(k == 1 || k==2 || k==3|| k==4|| k==5 ) {
                index = index - 1;
                break;
            }else danhGia.add(k);
        }

        int n = danhGia.size();
        int[] rate = new int[n];
        for (int i = 0; i < n; i++) {
            rate[i] = (int) danhGia.get(i);
        }
        prod.setRate(rate);
        productList.add(prod);

    }

    public void removeProduct(){
        System.out.println("Input name of product remove: ");
        scan = new Scanner(System.in);
        String moveTu = scan.nextLine();

        for(int i = 0; i < productList.size();i++){
            if(moveTu.trim().equals(productList.get(i).getName().trim())){
                productList.remove(i);
            }
        }
    }

    public void iterateProductList(){
        for(Product pList: productList){
            pList.viewInfo();
        }
    }

    public void searchProduct(){
        scan = new Scanner(System.in);
        System.out.println("Cost min: ");
        int min = scan.nextInt();
        System.out.println("Cost max: ");
        int max = scan.nextInt();
        for(Product product : productList){
            if(product.getPrice() >= min && product.getPrice() <= max){
                product.viewInfo();
            }
        }
    }
//    void sortProduct() {
//    	Collection.sort(productList, new Comparator<Product>() {
//
//			@Override
//			public int compare(Product product, Product t1) {
//				// TODO Auto-generated method stub
//				if(product.getPrice()>t1.setPrice(0))
//					return 1;
//				return 0;
//			}
//		
//    	});
 //   }
}
