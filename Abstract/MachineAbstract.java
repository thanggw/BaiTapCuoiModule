package Buoi10.BaiTap.Abstract;

public abstract class MachineAbstract {
    private int id;
    private int ngaySanXuat;
    private String model;
    private String ten;

    public MachineAbstract(int id, int ngaySanXuat, String model, String ten) {
        this.id = id;
        this.ngaySanXuat = ngaySanXuat;
        this.model = model;
        this.ten = ten;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public int getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract void input();
    public abstract void display();
}
