package Tuan2.Test3.Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TeacherTest {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Teacher> teachers = new ArrayList<>();

	public static void menu() {
		System.out.println("1- Nhập vào n giảng viên");
		System.out.println("2- Hiện thị thông tin tất cả các giảng viên");
		System.out.println("3- Hiện thị giảng viên có lương cao nhất");
		System.out.println("4- Thoát");
	}

	public static void func1() {
		System.out.println("Nhập n giảng viên");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Teacher teacher = new Teacher();
			teacher.inputInfo();
			System.out.println(" ");
			teachers.add(teacher);
		}
	}

	public static void func2() {
		for (Teacher teacher : teachers) {
			teacher.showInfo();
		}
	}
	public static void func3() {
		Comparator<Teacher> comparator = (s1,s2) -> (int) (s2.getLuongThucNhan() - s1.getLuongThucNhan());
        Collections.sort(teachers,comparator);
        System.out.println("Giảng viên có lương cao nhất");
        teachers.get(0).showInfo();
	}
	public static void option(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i > 0){
            System.out.println(" ");
            menu();
            System.out.println("Option");
            int index = sc.nextInt();
            switch(index) {
                case 1:
                    func1();
                    break;
                case 2:
                    func2();
                    break;
                case 3:
                    func3();
                    break;
                case 4 :
                	i = i-1;
                	break;
            }
        }
    }

    public static void main(String[] args) {
        option();
    }
}
