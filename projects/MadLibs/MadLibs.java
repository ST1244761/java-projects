import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for words
        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = input.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = input.nextLine();

        // Create the story
        String story = "Once upon a time, a " + adjective1 + " " + noun1 +
                       " decided to " + verb1 + " with a " + noun2 +
                       ". They laughed, then decided to " + verb2 + " into the sunset.";

        // Print the story
        System.out.println("\nHere’s your Mad Lib:\n" + story);

        input.close();
    }
}
