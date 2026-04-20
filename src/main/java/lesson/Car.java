package lesson;

public class Car extends Vehicle {
    String steeringwheel;

    // constructor
    public  Car( String color, String brand, String steeringwheel){
        super(color, brand);
        this.steeringwheel = steeringwheel;
    }

//    @Override
//    public void print() {
//        super.print();
//    }


    @Override
    public void print() {
        System.out.println("I am Car");
    }
}

