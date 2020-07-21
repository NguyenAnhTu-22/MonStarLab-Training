package Tuan2.Test3.Bai1;

import java.util.*;

public class StudentTest {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Student> studentsHocBong = new ArrayList<>();



    public static void menu(){
        System.out.println("1- Nhập n sinh viên");
        System.out.println("2- Hiện thị thông tin sinh viên");
        System.out.println("3- Hiện thị sinh viên có điểm trung bình cao nhất và thấp nhất");
        System.out.println("4- Tìm kiếm sinh viên theo mã sinh viên");
        System.out.println("5- Hiện thị sinh viên theo bảng chữ cái");
        System.out.println("6- Hiện thị sinh viên có học bổng, sắp xếp điểm từ cao xuống thấp");
        System.out.println("7- Exit");
    }

    public static void fun1(){
        System.out.println("Nhập n sinh viên");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Student student = new Student();
            student.inputInfo();
            System.out.println(" ");
            students.add(student);
        }
    }

    public static void fun2(){
        for(Student student : students){
            student.showInfo();
        }
    }

    public static void fun3(){
        Comparator<Student> comparator = (s1,s2) -> (int) (s2.getDiemTB() - s1.getDiemTB());
        Collections.sort(students,comparator);
        System.out.println("Sinh viên có điểm trung bình cao nhất");
        students.get(0).showInfo();
        System.out.println("Sinh viên có điểm trung bình thấp nhất");
        students.get(students.size()-1).showInfo();

    }

    public static void fun4(){
        System.out.println("Nhập mã sinh viên cần tìm kiếm");
        String maSinhVien = sc.nextLine();
        int index = 0;
        for(Student student : students){
            if(student.getMaSinhVien().trim().compareTo(maSinhVien.trim()) == 0){
                student.showInfo();
                index = index -1;
            }
        }
        if(students.get(students.size()-1).getMaSinhVien().trim().compareTo(maSinhVien.trim()) == 0 && index == 0){
            System.out.println("Không có mã sinh viên " + maSinhVien);
        }

    }

    public static void fun5(){
        Comparator<Student> comparator = (s1,s2) -> s1.getTen().compareTo(s2.getTen());
        Collections.sort(students,comparator);
    }

    public static void fun6(){
        for (Student student: students){
            if(student.isHocBong()==true) studentsHocBong.add(student);
        }
        Comparator<Student> comparator = (s1,s2) -> (int) (s2.getDiemTB() - s1.getDiemTB());
        Collections.sort(studentsHocBong,comparator);
        for(Student student : studentsHocBong){
            student.showInfo();
        }


    }

    public static void option(){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i > 0){
            System.out.println("");
            menu();
            System.out.println("Option");
            int index = sc.nextInt();
            switch(index) {
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
                    fun2();
                    break;
                case 6:
                    fun6();
                    break;
                case 7:
                    i = i-1;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        option();
    }
}
