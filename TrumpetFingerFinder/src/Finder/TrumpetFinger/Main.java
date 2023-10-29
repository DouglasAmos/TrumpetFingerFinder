package Finder.TrumpetFinger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        final String OPEN = "000";
        final String FIRST_VALVE_ONLY = "100";
        final String SECOND_VALVE_ONLY = "020";
        final String THIRD_VALVE_ONLY = "003";
        final String FIRST_AND_SECOND = "120";
        final String FIRST_AND_THIRD = "103";
        final String SECOND_AND_THIRD = "023";
        final String ALL_THREE = "123";


        System.out.println("Hello and welcome to the trumpet fingering finder.");
        System.out.println("Please enter the note you want to play using # for sharp and b for flat:");
        System.out.println("For example: C# or Bb.  One note at a time please.");
        System.out.println("Enter your note:");

        String userInput = inputScanner.nextLine();


        if (userInput.equals("C") || userInput.equals("B#")) {
            System.out.println(OPEN);

        } else if (userInput.equals("C#") || userInput.equals("Db")) {
            System.out.println(ALL_THREE);

        } else if (userInput.equals("D")) {
            System.out.println(FIRST_AND_THIRD);

        } else if (userInput.equals("D#") || userInput.equals("Eb")) {
            System.out.println(SECOND_AND_THIRD);

        } else if (userInput.equals("E") || userInput.equals("Fb")) {
            System.out.println(FIRST_AND_SECOND);

        } else if (userInput.equals("F")) {
            System.out.println(FIRST_VALVE_ONLY);

        } else if (userInput.equals("F#") || userInput.equals("Gb")){
            System.out.println(SECOND_VALVE_ONLY);

        } else if (userInput.equals("G")){
            System.out.println(OPEN);

        } else if (userInput.equals("G#") || userInput.equals("Ab")){
            System.out.println(SECOND_AND_THIRD);

        } else if (userInput.equals("A#") || userInput.equals("Bb")){
            System.out.println(FIRST_VALVE_ONLY);

        } else if (userInput.equals("B") || userInput.equals("Cb")){
            System.out.println(SECOND_VALVE_ONLY);
        } else {
            System.out.println("Sorry, I didn't understand your input.  Maybe try saxophone instead.");
        }


    }
}