import practice.OopConcepts;

public class OopTest {

    public static void main(String[] args) {
        OopConcepts oopConcepts = new OopConcepts("red", "Lexus", "lex",
                "boom", 20, 13);

        int finalAnswer = oopConcepts.addition(2, 5);
        System.out.println(finalAnswer);

        int result = oopConcepts.addition(5, 5,7);
        System.out.println(result);

    }

}
