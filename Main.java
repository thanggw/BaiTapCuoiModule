package Buoi10.BaiTap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("====MENU====");
            System.out.println("1. Thêm động vật");
            System.out.println("2. Sửa động vật theo id");
            System.out.println("3. Hiển thị danh sách động vật");
            System.out.println("4. Thêm máy móc");
            System.out.println("5. Sửa máy móc theo ");
            System.out.println("6. Hiển thị danh sách máy móc");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            try{
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon){
                    case 1:
                        quanLy.themDongVat();
                        break;
                    case 2:
                        quanLy.suaDongVat();
                        break;
                    case 3:
                        quanLy.hienThiDanhSachDongVat();
                        break;
                    case 4:
                        quanLy.themMayMoc();
                        break;
                    case 5:
                        quanLy.suaMayMoc();
                        break;
                    case 6:
                        quanLy.hienThiDanhSachMayMoc();
                        break;
                    case 7:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui long nhap lai.");
                        break;
                }
            }catch(InvalidInputException e){
                   System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
                scanner.nextLine();
            }
        }
    }
}
