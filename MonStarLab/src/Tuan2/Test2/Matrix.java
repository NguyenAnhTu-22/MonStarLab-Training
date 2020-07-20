package Tuan2.Test2;


import java.util.Scanner;

public class Matrix {
    public int soHang;
    public int soCot;
    public int[][] array;
    private Scanner sc;

    public Matrix() {
    }

    public void inputMaTran(){
        sc = new Scanner(System.in);
        System.out.println("Nhập sô hàng");
        int m = sc.nextInt();
        this.soHang = m;
        System.out.println("Nhập sô cột");
        int n = sc.nextInt();
        this.soCot = n;
        this.array = new int[n][m];
        System.out.println("Nhập ma trận");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                this.array[i][j] = sc.nextInt();
            }
        }
    }

    public void outputMaTran(Matrix mt){
        int m = mt.soHang;
        int n = mt.soCot;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mt.array[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public void tongMaTan(Matrix mt){
        int[][] tongMaTran = new int[this.soHang][this.soCot];
        if(this.soHang == mt.soHang && this.soCot == mt.soCot){
            System.out.println(this.soHang);
            System.out.println(mt.soHang);
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < this.soCot; j++){
                    tongMaTran[i][j] = this.array[i][j] + mt.array[i][j];
                }
            }
            System.out.println("Tổng của hai ma trận là: ");
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < this.soCot; j++){
                    System.out.print(tongMaTran[i][j] + "     ");
                }
                System.out.println();
            }
        }else System.out.println("Hai ma trận không cùng hàng cùng cột");

    }

    public void tichMaTran(Matrix mt){
        if(this.soCot == mt.soHang ){
            int[][] tichMaTran = new int[this.soHang][mt.soCot];
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < mt.soCot; j++){
                    tichMaTran[i][j] = 0;
                    for(int k = 0; k < this.soCot; k++){
                        tichMaTran[i][j] = tichMaTran[i][j] + this.array[i][j] * mt.array[i][j];
                    }
                }
            }
            System.out.println("Tích của hai ma trận là: ");
            for(int i = 0; i < this.soHang; i++){
                for(int j = 0; j < mt.soCot; j++){
                    System.out.print(tichMaTran[i][j] + "     ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
		System.out.println("Ma trận A");
		Matrix mtA = new Matrix();
		mtA.inputMaTran();
		mtA.outputMaTran(mtA);
		
		System.out.println("Ma trận B");
		Matrix mtB = new Matrix();
		mtB.inputMaTran();
		mtB.outputMaTran(mtB);
		
		mtA.tongMaTan(mtB);
		mtA.tichMaTran(mtB);
	}
}
