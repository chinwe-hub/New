package lesson;

public class Dog extends Pet {

    // constructor
    public Dog(String name, String type){
        super(name, type);

    }

    @Override
    public boolean print() {
        super.print();
        return true;
    }

    @Override
    public String speak() {
        return super.speak();
    }
}
