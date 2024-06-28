package Buoi10.BaiTap;

import Buoi10.BaiTap.Abstract.AnimalAbstract;
import Buoi10.BaiTap.Abstract.MachineAbstract;
import Buoi10.BaiTap.Animal.Bird;
import Buoi10.BaiTap.Animal.Dog;
import Buoi10.BaiTap.Animal.Fish;
import Buoi10.BaiTap.Machine.Car;
import Buoi10.BaiTap.Machine.Plane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLy {
     private AnimalAbstract[] danhSachDongVat = new AnimalAbstract[100];
     private MachineAbstract[] danhSachMayMoc = new MachineAbstract[100];
     private int soLuongDongVat = 0;
     private int soLuongMayMoc = 0;
     Scanner scanner = new Scanner(System.in);

     public void themDongVat() throws InvalidInputException {
          if (soLuongDongVat >= 100) {
               throw new InvalidInputException("Khong the them dong vat, danh sach da day.");
          }

          System.out.println("Thêm động vật:");
          System.out.println("1. Chó");
          System.out.println("2. Chim");
          System.out.println("3. Cá");

          int luaChon;
          do {
               luaChon = getValidIntInput("Nhập lựa chọn của bạn: ");
               if (luaChon < 1 || luaChon > 3) {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
               }
          } while (luaChon < 1 || luaChon > 3);

          int id;
          do {
               id = getValidIntInput("Nhập id: ");
               if (isIdExists(id)) {
                    System.out.println("ID đã tồn tại, vui lòng nhập ID khác.");
               }
          } while (isIdExists(id));
          String ten = getValidStringInput("Nhập tên: ");
          String mauLong = getValidStringInput("Nhập màu lông: ");

          switch (luaChon) {
               case 1:
                    String mauDuoi = getValidStringInput("Nhập màu đuôi: ");
                    danhSachDongVat[soLuongDongVat++] = new Dog(id, ten, mauLong, mauDuoi);
                    break;
               case 2:
                    String loaiHat = getValidStringInput("Nhập loại hạt: ");
                    danhSachDongVat[soLuongDongVat++] = new Bird(id, ten, mauLong, loaiHat);
                    break;
               case 3:
                    String vungBien = getValidStringInput("Nhập vùng biển: ");
                    danhSachDongVat[soLuongDongVat++] = new Fish(id, ten, mauLong, vungBien);
                    break;
               default:
                    throw new InvalidInputException("Lựa chọn không hợp lệ!");
          }
     }

     public void suaDongVat() throws InvalidInputException {
          int id = getValidIntInput("Nhập id động vật cần sửa: ");

          for (int i = 0; i < soLuongDongVat; i++) {
               if (danhSachDongVat[i].getId() == id) {
                    danhSachDongVat[i].input();
                    return;
               }
          }
          throw new InvalidInputException("Khong tim thay dong vat voi id nay.");
     }

     public void themMayMoc() throws InvalidInputException {
          if (soLuongMayMoc >= 100) {
               throw new InvalidInputException("Khong the them may moc, danh sach da day.");
          }

          System.out.println("Thêm máy móc:");
          System.out.println("1. Ô tô");
          System.out.println("2. Máy bay");

          int luaChon;
          do {
               luaChon = getValidIntInput("Nhập lựa chọn của bạn: ");
               if (luaChon < 1 || luaChon > 2) {
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
               }
          } while (luaChon < 1 || luaChon > 2);

          int id;
          do {
               id = getValidIntInput("Nhập id: ");
               if (isIdExists(id)) {
                    System.out.println("ID đã tồn tại, vui lòng nhập ID khác.");
               }
          } while (isIdExists(id));
          int ngaySanXuat = getValidIntInput("Nhập ngày sản xuất: ");
          String model = getValidStringInput("Nhập hãng: ");
          String ten = getValidStringInput("Nhập tên: ");

          switch (luaChon) {
               case 1:
                    int ngayHetDangKiem = getValidIntInput("Nhập ngày hết đăng kiểm: ");
                    danhSachMayMoc[soLuongMayMoc++] = new Car(id, ngaySanXuat, model, ten, ngayHetDangKiem);
                    break;
               case 2:
                    String sanBay = getValidStringInput("Nhập sân bay: ");
                    danhSachMayMoc[soLuongMayMoc++] = new Plane(id, ngaySanXuat, model, ten, sanBay);
                    break;
               default:
                    throw new InvalidInputException("Lựa chọn không hợp lệ!");
          }
     }

     public void suaMayMoc() throws InvalidInputException {
          int id = getValidIntInput("Nhập id máy móc cần sửa: ");

          for (int i = 0; i < soLuongMayMoc; i++) {
               if (danhSachMayMoc[i].getId() == id) {
                    danhSachMayMoc[i].input();
                    return;
               }
          }
          throw new InvalidInputException("Không tìm thấy máy móc với id này.");
     }

     public void hienThiDanhSachDongVat() {
          if (soLuongDongVat == 0) {
               System.out.println("Chưa có động vật nào. Vui lòng nhập thông tin động vật.");
          }
          for (int i = 0; i < soLuongDongVat; i++) {
               danhSachDongVat[i].display();
          }
     }

     public void hienThiDanhSachMayMoc() {
          if (soLuongMayMoc == 0) {
               System.out.println("Chưa có máy móc nào được thêm. Vui lòng nhập thêm thông tin");
          }
          for (int i = 0; i < soLuongMayMoc; i++) {
               danhSachMayMoc[i].display();
          }
     }

     private int getValidIntInput(String inRaManHinh) {
          int value;
          while (true) {
               System.out.print(inRaManHinh);
               try {
                    value = scanner.nextInt();
                    scanner.nextLine();
                    break;
               } catch (InputMismatchException e) {
                    System.out.println("Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
                    scanner.next();
               }
          }
          return value;
     }

     private String getValidStringInput(String inRaManHinh) {
          String value;
          while (true) {
               System.out.print(inRaManHinh);
               value = scanner.nextLine();
               if (!value.trim().isEmpty()) {
                    break;
               } else {
                    System.out.println("Dữ liệu nhập vào không hợp lệ. Vui lòng thử lại.");
               }
          }
          return value;
     }
     private boolean isIdExists(int id){
          for (int i = 0; i < soLuongDongVat; i++) {
               if (danhSachDongVat[i].getId()==id){
                    return true;
               }
          }
          for (int i = 0; i < soLuongMayMoc; i++) {
               if (danhSachMayMoc[i].getId()==id){
                    return true;
               }
          }
          return false;
     }
}
