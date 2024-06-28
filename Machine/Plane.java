package Buoi10.BaiTap.Machine;

import Buoi10.BaiTap.Abstract.MachineAbstract;
import Buoi10.BaiTap.TongHopCacChucNang;

import java.util.Scanner;

public class Plane extends MachineAbstract implements TongHopCacChucNang {
    private String sanBay;

    public Plane(int id, int ngaySanxuat, String model, String ten, String sanBay) {
        super(id, ngaySanxuat, model, ten);
        this.sanBay = sanBay;
    }

    @Override
    public void bark() {
        System.out.println(super.getTen() + " cannot bark.");
    }

    @Override
    public void run() {
        System.out.println(super.getTen() + " is running.");
    }

    @Override
    public void fly() {
        System.out.println(super.getTen() + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(super.getTen() + " cannot swim.");
    }

    @Override
    public void display() {
        System.out.println("ID: " + super.getId() + ", Tên: " + super.getTen() + ", Ngày sản xuất: " + super.getNgaySanXuat() + ", Mẫu: " + super.getModel() + ", Ngày hết đăng kiểm: " + sanBay);
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        setTen(scanner.nextLine());
        System.out.print("Nhập ngày sản xuất: ");
        setNgaySanXuat(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập mẫu: ");
        setModel(scanner.nextLine());
        System.out.print("Nhập ngày hết đăng kiểm: ");
        this.sanBay = scanner.nextLine();
    }
}
