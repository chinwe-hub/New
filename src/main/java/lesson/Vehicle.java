package lesson;

public abstract class Vehicle {

    String color;
    String brand;

    // constructor
    public Vehicle(String color, String brand) {
        this.brand = brand;
        this.color = color;
    }

    public void print() {
        System.out.println(this.color + " " + this.brand);
    }

    public int multiplication(int q, int w) {
        return q * w;
    }
}





