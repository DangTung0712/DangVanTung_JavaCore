package DangVanTung_0853324288.maytinh.dell;

import DangVanTung_0853324288.maytinh.MayTinh;
import DangVanTung_0853324288.maytinh.apple.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MipComputer {
    public static void menu(){
        System.out.println("=====Danh sách chức năng=====");
        System.out.println("1.Thêm thông tin");
        System.out.println("2.Hiển thị danh sách");
        System.out.println("3.Sắp xếp danh sách");
        System.out.println("4.Tìm kiếm thông tin");
        System.out.println("5.Thoát chương trình");
        System.out.println("=============================");

    }
    static void input(List<MayTinh> lists) {
        System.out.println("Nhập 3 Apple:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin Apple thứ "+(i+1));
            Apple apple = new Apple();
            apple.inputInfor();
            lists.add(apple);
        }
        System.out.println("Nhập 3 Dell:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin Dell thứ "+(i+1));
            Dell dell = new Dell();
            dell.inputInfor();
            lists.add(dell);
        }
    }
    static void display(List<MayTinh> lists) {
        System.out.println("Danh sách thông tin:");
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i).displayInfor();
        }
    }
    static void sort(List<MayTinh> lists) {
        System.out.println("Danh sách trước khi sắp xếp:");
        display(lists);
        System.out.println("Danh sách sau khi sắp xếp:");
        Collections.sort(lists,(x, y)->{
            int warantyx = 0;
            int warantyy = 0;
            if(x instanceof Dell) {
                Dell dell = (Dell) x;
                warantyx = dell.getWarranty();
            } else {
                Apple apple= (Apple) x;
                warantyx=apple.getWarranty();
            }
            if(y instanceof Dell) {
                Dell dell = (Dell) y;
                warantyy = dell.getWarranty();
            } else {
                Apple apple= (Apple) y;
                warantyy=apple.getWarranty();
            }
            return warantyx - warantyy;
        });
        display(lists);
    }
    static void search(List<MayTinh> lists) {
        boolean flag = false;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getName().equals("apple")) {
                lists.get(i).displayInfor();
                flag = true;
            }
        }
        if (flag == false) System.out.println("Không tìm thấy");
    }
    public static void main(String[] args) {
        List<MayTinh> lists = new ArrayList<>();
        Scanner s= new Scanner(System.in);
        boolean run = true;
        int choice = 0;
        while (run){
            menu();
            boolean isContinue = true;
            do{ //Sử dụng vòng lặp để mỗi khi nhập sai sẽ yêu cầu nhập lại cho đến khi đúng
                try {
                    System.out.print("Chọn chức năng: ");
                    choice = Integer.parseInt(s.nextLine());
                    isContinue = false;
                }catch (Exception e){ //Do có hai ngoại lệ có thể sảy ra nên sử dụng khối catch để xử lý
                    System.out.println("Nhập lại!!");
                }
            }while(isContinue);
            switch (choice){
                case 1:
                    input(lists);
                    break;
                case 2:
                    display(lists);
                    break;
                case 3:
                    sort(lists);
                    break;
                case 4:
                    search(lists);
                    break;
                case 5:
                    run = false;
                    System.out.println("Thoát chương trình thành công!!!");
                    break;
                default:
                    System.out.println("Chọn lại chức năng(1-5)!!!");
                    break;
            }
        }
    }
}
