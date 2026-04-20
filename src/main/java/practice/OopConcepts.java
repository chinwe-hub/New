package practice;

import lesson.Vehicle;

import java.awt.Shape;

// inheritance
public class OopConcepts extends Vehicle implements Bicycle, Fridge {
    // Encapsulation
    private final String steeringWheel;
    private final String fridgeSound;
    private final int temperature;
    private final int tax;

    // Constructor
    public  OopConcepts(String color, String brand, String steeringWheel,
                        String fridgeSound, int temperature, int tax) {
        super(color, brand);
        this.steeringWheel = steeringWheel;
        this.fridgeSound = fridgeSound;
        this.temperature = temperature;
        this.tax = tax;
    }

    public void drive() {
        System.out.println(steeringWheel);
    }

    public void animalSound() {
        System.out.println("woof");
    }

    public void sleep() {
        System.out.println("snore");
    }

    public String fridgeSound(){
        return fridgeSound;
    }

    public int temperature() {
        return temperature;
    }

    public int add(int c, int d) {
        return (c + d) * (tax/100);
    }

    // Abstraction - Check interface (Bridge, Fridge) and abstract class (Shape)
    // in "practice" package

    // Polymorphism - many forms
    // compile-time polymorphism or method overloading
    public int addition(int g, int h) {
        return g + h;
    }

    public int addition(int i, int j, int k) {
        return i + j + k;
    }

    // run-time polymorphism or method overriding
    @Override
    public int multiplication(int j, int k) {
        return j * k;
    }

}
