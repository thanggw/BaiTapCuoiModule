package Buoi10.BaiTap.Abstract;

public abstract class AnimalAbstract {
    private int id;
    private String name;
    private String mauLong;

    public AnimalAbstract(int id,String name, String mauLong) {
        this.id=id;
        this.name = name;
        this.mauLong=mauLong;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public abstract void input();
    public abstract void display();
}
