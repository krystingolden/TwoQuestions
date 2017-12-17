package com.pluralsight;

import java.util.Scanner;

public class Main {

    /*
    https://programmingbydoing.com/

    Twenty questions...well actually just two - Assignment #32
     */
    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println();
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        String firstAnswer = keyboard.next();
        System.out.println();
        System.out.println("Question 2) Is it bigger than a breadbox");
        String secondAnswer = keyboard.next();
        System.out.println();

        String guess;

        if (firstAnswer.equalsIgnoreCase("animal")){
            if (secondAnswer.equalsIgnoreCase("no")) {
                guess = "squirrel";
            }
            else
                guess = "moose";
        }
        else if (firstAnswer.equalsIgnoreCase("vegetable")) {
            if (secondAnswer.equalsIgnoreCase("no")) {
                guess = "carrot";
            }
            else
                guess = "watermelon";
        }
        else
            if (secondAnswer.equalsIgnoreCase("no")) {
                guess = "paper clip";
        }
            else
                guess = "Camaro";
        System.out.println("My guess is that you are thinking of a " + guess + " .");
        System.out.println("I would ask you if I'm right, but I don't actually care.");

    }
}
