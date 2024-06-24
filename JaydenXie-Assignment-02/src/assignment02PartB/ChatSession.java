/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public final class ChatSession {

    //  Static Data Fields
    private static Scanner scan = new Scanner(System.in);
    private static String inputFirstName;
    private static String inputLastName;
    private static String userFullName;
    private static String inputEmail;

    //
    // Instance Data Fields
    //
    private Club club;
    private University university;
//    private Player player; -------------------------->part c


    //
    // Constructors
    //
    public ChatSession() {
    }

//    public ChatSession(Player player) { -------------------------->part c
//        this.player = new Player("Buster Posey");
//    }

    public ChatSession(Club club, University university) {
        this.club = new Club("SF Giants");
        this.university = new University("SF State");
    }

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    private void startChatSession() {

        //chat session start
        System.out.println(Timer.setTimeZonePreference().getChatSessionTime() + " - Chat session started.\n");
        System.out.println("SF Giants: Welcome to the SAN FRANCISCO GIANTS!");

        //display club information
        club.displayAbout();

        //get user's name and school email
        System.out.print("\nSF Giants: Your first name and last name, please: ");
        inputFirstName = scan.next();
        inputLastName = scan.nextLine();
        userFullName = inputFirstName + " " + inputLastName;
        System.out.print("SF Giants: Your school email address, please: ");
        inputEmail = scan.nextLine();
        System.out.println(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": Welcome to my university!");

        //display university information
        university.displayAbout();

    }

    private void connectChatters() {
        System.out.println("\nPlease select a SF Giants player you what to chat with: ");
        System.out.println("1. Buster Posey\n2. Jordan Hicks\n3. Spencer Bivens\n4. Mason Black\n5. Nick Ahmed");
        System.out.print("Please Enter A Integer Here: ");

        int inputChoice = scan.nextInt();
        scan.nextLine();

        Player pickedPlayer;
        switch (inputChoice) {
            case 1 -> pickedPlayer = new Player("Buster Posey", "San Francisco Giants", "Catcher", "Right", "Right", 28, 2009);
            case 2 -> pickedPlayer = new Player("Jordan Hicks", "San Francisco Giants", "Pitchers", "Right", "Right", 12, 2024);
            case 3 -> pickedPlayer = new Player("Spencer Bivens", "San Francisco Giants", "Bullpen", "Right", "Right", 76, 2024);
            case 4 -> pickedPlayer = new Player("Mason Black", "San Francisco Giants", "Pitchers", "Right", "Right", 47, 2024);
            case 5 -> pickedPlayer = new Player("Nick Ahmed", "San Francisco Giants", "Infielders", "Right", "Right", 16, 2024);
            default -> {
                System.out.println("Invalid Input. Buster Posey is happy to chatting with you!");
                pickedPlayer  = new Player("Buster Posey");
            }
        }
        System.out.println("\nSF Giants: Thank you. We are connecting you with our player...");
        sleep(5);
        pickedPlayer.displayAbout();

        chat(pickedPlayer);
    }

    private void chat(Player pickedPlayer) {
        sleep(5);
        String playerNameNumber = pickedPlayer.getPlayerName() + ", " + pickedPlayer.getPlayerNumber() + ": ";
        int numberOfTry = 3;
        boolean validInput = false;
        int inputNumOfOrder = 0;
        String[] inputRecipientName = new String[5];
        char[] inputArtSymbol= new char[5];
        String[] inputMessage= new String[5];

        System.out.println();
        System.out.println(playerNameNumber + "Hello " + inputFirstName + ". C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
        System.out.println(playerNameNumber + Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + Config.getDefaultUniversity().toUpperCase() + Color.ANSI_RESET + ". Way to go!");
        System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": ");
        scan.nextLine();
        System.out.println(playerNameNumber + "Likewise, " + inputFirstName + ". Very nice chatting w/ you.");

        while (numberOfTry >= 0 && !validInput) {

            try {
                System.out.println(playerNameNumber + "How many SF Giants Thank You cards would you like to order?");
                System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": ");
                inputNumOfOrder = scan.nextInt();
                scan.nextLine();
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Please enter an INTEGER. " + numberOfTry + " tries left.");
                System.out.println("java.util.InputMismatchException");
                scan.nextLine();
                numberOfTry--;
            }
        }

        if (validInput) {
            System.out.println(playerNameNumber + " In 3 lines, please provide\n" +
                    "   [1] Recipient name\n" +
                    "   [2] Art symbol (a character)\n" +
                    "   [3] Message to recipient"
            ); //sout

            for (int i = 0; i < inputNumOfOrder; i++) {
                System.out.println(playerNameNumber + "Card #" + (i + 1) + ":");
                System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": [1] ");
                inputRecipientName[i] = scan.nextLine();
                System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": [2] ");
                inputArtSymbol[i] = scan.next().charAt(0);
                scan.nextLine();
                System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": [3] ");
                inputMessage[i] = scan.nextLine();
            }

            System.out.println(playerNameNumber + " Thanks, " + inputFirstName + ". Please confirm your order:\n");

            for (int i = 0; i < inputNumOfOrder; i++) {
                try {
                    SFGiantsCardGenerator.generateSFGiantsCard(inputRecipientName[i], inputMessage[i], inputFirstName, inputEmail, inputArtSymbol[i], 12, "Courier");
                    System.out.println();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": ");
            scan.nextLine();
            System.out.println(playerNameNumber + "Thank you again, " + inputFirstName + ". See you at your graduation ceremony!");
        }
    }

    private void runQuiz() {
        Club defaultClub = new Club("SF Giants");
        String clubName = defaultClub.getclubShortName() + ": ";
        System.out.println();
        System.out.println(clubName + "*** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _");
        int allowMiss = 1;
        String inputAnswer;

        ArrayList<Quiz> quiz = new ArrayList<>();
        quiz.add(new Quiz("Which type of class has 'protected' constructors?","abstract"));
        quiz.add(new Quiz("What type of method did Java 8 add to 'interface'?","default"));
        quiz.add(new Quiz("What new keyword did Java 13 add to 'switch' statement?","yield"));
        quiz.add(new Quiz("In Java 15, what keyword pairs with 'sealed'?","permits"));
        quiz.add(new Quiz(" Giants in Spanish?","Gigantes"));
        quiz.add(new Quiz("Take me out to the...?","Ball Game"));

        for (int i = 0; i < quiz.size(); i++) {
            Quiz currentQuestion = quiz.get(i);
            System.out.println(clubName + currentQuestion.toString());
            System.out.print(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + userFullName + Color.ANSI_RESET + ": ");
            inputAnswer = scan.nextLine();

            if (inputAnswer.equalsIgnoreCase(currentQuestion.getQuizAnswer())) {
                System.out.println(clubName + " Correct!");
            } else {
                System.out.println(clubName + "Oops...");
                allowMiss--;
            }
        }

        if (allowMiss < 0) {
            System.out.println("____ Please try again at your graduation ceremony. ____");
        }
        else {
            System.out.println("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***");
        }
    }

    private void stopChatSession() {
        System.out.println(Timer.setTimeZonePreference().getChatSessionTime() + " - Chat session ended.");
    }

    public void runChatSession() {
        startChatSession();
        connectChatters();
        //chat();
        runQuiz();
        stopChatSession();
    }

    private void sleep(int seconds) {
        for (int i = 0; i < seconds; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        }
    }

    public static String getInputFirstName() {
        return inputFirstName;
    }

    public static String getInputLastName() {
        return inputLastName;
    }

    public static String getInputEmail() {
        return inputEmail;
    }


    //
    // Language
    //
}