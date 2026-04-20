package practice;

public class Lesson {

    public int add(int a, int b) {
        int age = 12;
        int height = 50;
        int d = a;
        int e = b;
        int c = d + e;
        return c;
    }


    public int plus(int a, int b, int c) {
        return a + b + c;
    }

    // Create a method with name "subtract" that subtracts two parameters
    // of datatype double and returns double;
    public double subtract(double c, double d) {
        return c - d;
    }

    // Create a method with name "greeting" that concatenates two parameters
    // of datatype string and returns string;
    // run the tests with arguments "hello" and "world"
    public String greeting(String first, String second) {
        return first + second;
    }




    public static void main(String[] args) {
        Lesson lesson = new Lesson();
        System.out.println(lesson.subtract(1.5, 2.4));

        System.out.println(lesson.greeting("hello ", "world"));
        System.out.println(lesson.plus(2, 3, 4));
    }

}
