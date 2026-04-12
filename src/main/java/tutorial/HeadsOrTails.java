package tutorial;

import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
//        isheads = game
        String correct = "head";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of coin: ");
        String side = scanner.nextLine();

        if (side.equals(correct)){
            System.out.println("Let's go to the game");
        } else {
            System.out.println("Let's watch a movie");
        }

    }
}
