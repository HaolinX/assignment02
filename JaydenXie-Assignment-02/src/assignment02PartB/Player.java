/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    //
    // Instance Data Fields
    //
    private String playerName;
    private String playerClub;
    private String playerPosition;
    private String playerBats;
    private String playerThrows;
    private int playerNumber;
    private int playerMLBdebut;

    //
    // Constructors
    //
    public Player() {
    }

    public Player(String defaultPlayer) {
        this.playerName = "Buster Posey";
        this.playerClub = "San Francisco Giants";;
        this.playerPosition = "Catcher";
        this.playerBats = "Right";
        this.playerThrows = "Right";
        this.playerNumber = 28;
        this.playerMLBdebut = 2009;

    }

    public Player(String playerName, String playerClub, String playerPosition, String playerBats, String playerThrows, int playerNumber, int playerMLBdebut) {
        this.playerName = playerName;
        this.playerClub = playerClub;
        this.playerPosition = playerPosition;
        this.playerBats = playerBats;
        this.playerThrows = playerThrows;
        this.playerNumber = playerNumber;
        this.playerMLBdebut = playerMLBdebut;
    }

    //
    // Instance Methods
    //
    public String getPlayerName() {
        return this.playerName;
    }

    public int getPlayerNumber() {
        return this.playerNumber;
    }


    //
    // Additional Instance Methods
    //

    //
    // Language
    //

    //
    // @Override
    //
    @Override
    public void displayAbout() {
        System.out.println();
        System.out.println("-".repeat(70));
        System.out.printf("%-25s %-50s %n", "Player:", this.playerName);
        System.out.printf("%-25s %-50s %n", "Club:", this.playerClub);
        System.out.printf("%-25s %-50s %n", "Position:", this.playerPosition);
        System.out.printf("%-25s %-50s %n", "Number:", this.playerNumber);
        System.out.printf("%-25s %-50s %n", "Bats::", this.playerBats);
        System.out.printf("%-25s %-50s %n", "Throws:", this.playerThrows);
        System.out.printf("%-25s %-50s %n", "MLB Debut:", this.playerMLBdebut);
        System.out.println("-".repeat(70));
    }

    @Override
    public void sayGreeting(String string) {
    }


}
