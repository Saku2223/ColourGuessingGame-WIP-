package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("maroon");
        colours.add("purple");
        colours.add("blue");
        colours.add("crimson");
        colours.add("orange");
        colours.add("green");
        colours.add("turquoise");
        colours.add("magenta");
        colours.add("mauve");
        colours.add("cyan");
        System.out.println("Guess the order of these 10 colours that will be ordered randomly: " + colours);
        int userScore = 0;
        boolean more = true;
        while (more) {
            Collections.shuffle(colours);
            String colourGuess1 = colours.get(0);
            System.out.print("What is your guess?> ");
            String colourGuess = input.next();
            if (colourGuess.equalsIgnoreCase(colourGuess1)) {
                System.out.println("Great, you got it right. You got " + userScore);
                userScore=+1;
            }else{
                System.out.println("Nope, that's wrong.");
        }

        }

    }
}
