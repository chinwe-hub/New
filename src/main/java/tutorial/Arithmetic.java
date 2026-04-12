package tutorial;

public class Arithmetic {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 10;
//
//    int result = a + b;
//        System.out.println(result);
//
//        boolean answer = a == b;
//        System.out.println(answer);
//
//
//        boolean c = false;
//        boolean d = true;
//
//        boolean and = c && d;
//        boolean or = c || d;
//        boolean not = !c;
//
//        System.out.println(and);
//        System.out.println(or);
//        System.out.println(not);

        int a = 10;
        int b = 8;
        int c = 12;

        boolean and = (a > b) && (b > c);
        boolean or = (a > b) || (b > c);
        boolean not = !(a > b);

        System.out.println(and);
        System.out.println(or);
        System.out.println(not);
    }
}
