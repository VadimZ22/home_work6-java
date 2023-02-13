package home_work6;

public class notebook {
    public notebook(String brand, String color, int cores, int RAM, int SSD) {
        this.brand = brand;
        this.color = color;
        this.cores = cores;
        this.RAM = RAM;
        this.SSD = SSD;
    }
    private String brand;
    private String color;
    private int cores;
    private int RAM;
    private int SSD;


    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        this.cores = cores;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getSSD() {
        return SSD;
    }
    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    @Override
    public String toString() {
        return "notebook{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", cores=" + cores +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                '}';
    }
}
