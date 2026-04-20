//import lesson.ConstructorAssignment;
import lesson.*;
import practice.FurtherLesson;
import practice.Lesson;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

//        // instantiation
        Lesson lesson = new Lesson();
        int c = lesson.add(2, 3);
        System.out.println(c);
//        System.out.println(lesson.add(2, 3));


        FurtherLesson furtherLesson = new FurtherLesson();

        int classicAnswer = furtherLesson.classic(1, 3, 5);
        System.out.println("classicAnswer: " + classicAnswer);

        int classyAnswer = furtherLesson.classy(2, 4, 6);
        System.out.println("classyAnswer: " + classyAnswer);

        int finalAnswer = classicAnswer * classyAnswer;

        System.out.println("finalAnswer: " + finalAnswer);


        NextLesson nextLesson = new NextLesson("hello", 20, 172);
        System.out.println(nextLesson.name);
        System.out.println(nextLesson.age);
        System.out.println(nextLesson.height);
//        nextLesson.name = "hello";
//        nextLesson.age = 12;
//        System.out.println(nextLesson.name);
//        System.out.println(nextLesson.age);
//        System.out.println(nextLesson.height);

        Pet pet = new Pet("Teddy", "German");
        System.out.println("Action: " + pet.speak());
        System.out.println(pet.name);
        System.out.println(pet.type);
        System.out.println(pet.print());

        Dog dog = new Dog("Ted", "Ger");
        System.out.println("answer: " + dog.speak());
        System.out.println(dog.name);
        System.out.println(dog.type);
        System.out.println(dog.print());
        String jump = dog.jump;



//        ConstructorAssignment constructorAssignment = new ConstructorAssignment("hello", 20);
//        System.out.println(constructorAssignment.call());





        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println(lesson.add(a, b));
//
//         int a = 2;
//         int b = 3;
//         int c = a + b;
//         System.out.println(a+b);
//         System.out.println(c);




}}
