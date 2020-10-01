package minigame;

import java.util.Scanner;

public class minigame {
    public static void main(final String[] args) {
        System.out.println("This will start the minigame.\n");

        // variables

        // input
        final Scanner scan = new Scanner(System.in);

        System.out.println("Do you choose to go right or left?");
        String directions = scan.nextLine();
        if (directions.equals("right")) {
            System.out.println("So you go right.\n");
        }
        else {
            System.out.println("So you go left.");
        }


    }
}