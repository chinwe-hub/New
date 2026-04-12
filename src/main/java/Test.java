import lesson.FurtherLesson;
import lesson.Lesson;


public class Test {
    public static void main(String[] args) {

//        // instantiation
        Lesson lesson = new Lesson();
//        int c = lesson.add(2, 3);
//        System.out.println(c);
        System.out.println(lesson.add(2, 3));


        FurtherLesson furtherLesson = new FurtherLesson();

        int classicAnswer = furtherLesson.classic(1, 3, 5);
        System.out.println("classicAnswer: " + classicAnswer);

        int classyAnswer = furtherLesson.classy(2, 4, 6);
        System.out.println("classyAnswer: " + classyAnswer);

        int finalAnswer = classicAnswer * classyAnswer;

        System.out.println("finalAnswer: " + finalAnswer);









//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Enter second number: ");
//        int b = scanner.nextInt();
//
//        System.out.println(lesson.add(a, b));

        // int a = 2;
        // int b = 3;
        // int c = a + b;
        // System.out.println(a+b);
        // System.out.println(c);
    }
}
