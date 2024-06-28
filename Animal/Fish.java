package Buoi10.BaiTap.Animal;

import Buoi10.BaiTap.Abstract.AnimalAbstract;
import Buoi10.BaiTap.TongHopCacChucNang;

import java.util.Scanner;

public class Fish extends AnimalAbstract implements TongHopCacChucNang {
    private String vungBien;

    public Fish(int id, String name, String mauLong, String vungBien) {
        super(id, name, mauLong);
        this.vungBien = vungBien;
    }

    @Override
    public void bark() {
        System.out.println(super.getName() + " cannot bark.");
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " cannot run.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " cannot fly.");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " is swimming.");
    }

    @Override
    public void display() {
        System.out.println("ID: " + super.getId() + ", Tên: " + super.getName() + ", Màu lông: " + super.getMauLong() + ", Vùng biển: " + vungBien);
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        setName(scanner.nextLine());
        System.out.print("Nhập màu lông: ");
        setMauLong(scanner.nextLine());
        System.out.print("Nhập vùng biển: ");
        this.vungBien = scanner.nextLine();
    }
}
