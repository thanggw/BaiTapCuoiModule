package Buoi10.BaiTap.Animal;

import Buoi10.BaiTap.Abstract.AnimalAbstract;
import Buoi10.BaiTap.TongHopCacChucNang;

import java.util.Scanner;

public class Dog extends AnimalAbstract implements TongHopCacChucNang {
    private String mauDuoi;

    public Dog(int id, String name, String mauLong, String mauDuoi) {
        super(id, name, mauLong);
        this.mauDuoi = mauDuoi;
    }

    @Override
    public void display() {
        System.out.println("ID: " + super.getId() + ", Tên: " + super.getName() + ", Màu lông: " + super.getMauLong() + ", Màu đuôi: " + mauDuoi);
    }

    @Override
    public void bark() {
        System.out.println(super.getName() + " is barking.");
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is running.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " cannot fly.");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " cannot swim.");
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        super.setName(scanner.nextLine());
        System.out.print("Nhập màu lông: ");
        super.setMauLong(scanner.nextLine());
        System.out.print("Nhập màu đuôi: ");
        this.mauDuoi = scanner.nextLine();
    }
}
