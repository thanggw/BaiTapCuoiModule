package Buoi10.BaiTap.Animal;

import Buoi10.BaiTap.Abstract.AnimalAbstract;
import Buoi10.BaiTap.TongHopCacChucNang;

import java.util.Scanner;

public class Bird extends AnimalAbstract implements TongHopCacChucNang {
    private String loaiHat;

    public Bird(int id, String name, String mauLong, String loaiHat) {
        super(id, name, mauLong);
        this.loaiHat = loaiHat;
    }

    @Override
    public void bark() {
        System.out.println(super.getName() + " cannot bark.");
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is running.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " cannot swim.");
    }

    @Override
    public void display() {
        System.out.println("ID: " + super.getId() + ", Tên: " + super.getName() + ", Màu lông: " + super.getMauLong() + ", Loại hạt: " + loaiHat);
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        setName(scanner.nextLine());
        System.out.print("Nhập màu lông: ");
        setMauLong(scanner.nextLine());
        System.out.print("Nhập loại hạt: ");
        this.loaiHat = scanner.nextLine();
    }
}
