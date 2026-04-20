package lesson;

public class Pet extends Animal {
    public String name;
    public String type;

    // constructor
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String speak() {
        System.out.println("woof");
        return "woof";
    }

    public boolean print() {
        System.out.println(this.name + " " + this.type);
        return true;
    }
}
