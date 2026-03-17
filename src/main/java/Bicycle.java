import java.util.Scanner;

public class Bicycle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();


        System.out.print("Enter age: ");
        String age = scanner.nextLine();

        int number = 5;

        System.out.println("I am " + number + "years old");
        System.out.printf("My name is %s, I am %s years old", name, age);
    }
    }

