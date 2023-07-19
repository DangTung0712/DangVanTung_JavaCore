package DangVanTung_0853324288.maytinh.dell;

import DangVanTung_0853324288.maytinh.MayTinh;

import java.util.Scanner;

public class Dell extends MayTinh {
    private int warranty;

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public Dell() {
        super();
    }

    public Dell(String code, String name, double price,int warranty) {
        super(code, name, price);
        this.warranty =warranty;
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        super.inputInfor();
        boolean isContinue = true;
        do{ //Sử dụng vòng lặp để mỗi khi nhập sai sẽ yêu cầu nhập lại cho đến khi đúng
            try {
                System.out.print("Nhập warranty: ");
                warranty = Integer.parseInt(sc.nextLine());
                isContinue = false;
            }catch (Exception e){ //Do có hai ngoại lệ có thể sảy ra nên sử dụng 2 khối catch để xử lý
                System.out.println("Nhập lại warranty!!");
            }
        }while(isContinue);
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: "+warranty);
    }

    @Override
    public void changeInfor() {
        super.changeInfor();
    }
}
