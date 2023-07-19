package DangVanTung_0853324288.maytinh;

import java.util.Scanner;

public class MayTinh implements IMayTinh{
    private String code;
    private String name;
    private double price;

    public MayTinh() {

    }

    public MayTinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập code: ");
        code = sc.nextLine();
        System.out.print("Nhập name: ");
        name = sc.nextLine();
        boolean isContinue = true;

        do{ //Sử dụng vòng lặp để mỗi khi nhập sai sẽ yêu cầu nhập lại cho đến khi đúng
            try {
                System.out.print("Nhập price: ");
                price = Float.parseFloat(sc.nextLine());
                isContinue = false;
            }catch (Exception e){ //Do có hai ngoại lệ có thể sảy ra nên sử dụng 2 khối catch để xử lý
                System.out.println("Nhập lại price!!");
            }
        }while(isContinue);
    }

    @Override
    public void displayInfor() {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }

    @Override
    public void changeInfor() {

    }

    public static void main(String[] args) {
        MayTinh a = new MayTinh();
        a.inputInfor();
        a.displayInfor();
    }
}
