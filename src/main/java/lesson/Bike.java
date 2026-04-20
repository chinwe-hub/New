package lesson;

public class Bike {
    String bikeHandle;

    // constructor
    public Bike(String color, String brand, String bikeHandle) {
        super(color, brand);
    }


//    @Override
//    public void print() {
//        super.print();
//    }
//}


    @Override
    public void print() {
        System.out.println("I am a Bike");
    }
}