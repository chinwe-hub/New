package practice;

public abstract class Shape {
    public String fridgeSound() {
        return null;
    }

    public int temperature() {
        return 0;
    }

    public int add(int a, int b) {
        return a + b;
    }

    // An abstract method (no body, must be implemented by subclasses)
    abstract void drive();
}
