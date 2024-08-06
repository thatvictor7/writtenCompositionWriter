// Victor Montoya Ortiz

import java.util.Scanner;

public class Driver {

    private static int selection = -1;//Variable to hold user selection in the menu.
    private static Composition composition = new Composition();//Composition object.

    public static void main(String[] args) {
        //Main function to start app.
        menuDisplay();
        getMenuSelection();

    }

    private static void menuDisplay() {

        //Function that displays menu to the user.
        System.out.println("This program allows a user to enter a written composition in pieces:");
        System.out.println("1. Enter a new sentence.");
        System.out.println("2. Start a new paragraph.");
        System.out.println("3. Print the composition.");
        System.out.println("4. Quit.");

    }

    private static void getMenuSelection() {

        Scanner scnr = new Scanner(System.in);//Scanner object to get user selection.
        //While loop to iterate menu until user selects 1, 2, 3, or 4.
        while (selection > 4 || selection < 1) {
            System.out.print("Your menu selection is: ");
            selection = scnr.nextInt();
        }

        executeMenuSelection();//Call function to perform what user selected.

    }

    private static void executeMenuSelection() {

        //Function that performs user selection using switch statement.
        String userInput = "";//Hold user's sentence input.

        //Switch that performs a block of code depending on user selection.
        switch (selection) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type a sentence, then press ENTER:");
                userInput = scanner.nextLine();//Gets user sentence and assigns to variable.
                composition.addASentence(userInput);//Grabs Composition object from earlier and calls function of that class.
                selection = -1;//Resets user selection.
                menuDisplay();//Displays menu
                getMenuSelection();//Function that grabs user menu selection.
                break;
            case 2:
                selection = -1;//Resets users menu selection.
                composition.addAParagraph();//Call composition method to create new paragraph.
                menuDisplay();//Displays menu
                getMenuSelection();//Function that grabs user menu selection.
                break;
            case 3:
                selection = -1;
                composition.print();//Gets print function from composition object that print results to user.
                menuDisplay();
                getMenuSelection();
                break;
            case 4:
                System.out.println("Bye-bye");//Case to End the app and goodbye message.
                break;
        }

    }

}