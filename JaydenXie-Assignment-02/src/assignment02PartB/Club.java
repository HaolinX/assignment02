/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {

    //
    // Instance Data Fields
    //
    private String clubName;
    private String clubShortName;
    private String clubColor;
    private String clubBallpark;
    private String clubOwner;
    private String clubPresident;
    private String clubGeneralManager;
    private String clubManager;
    private int clubEstablishedYear;
    private int clubWorldSeriesTitle;
    private int clubNLpennant;
    private int clubDivisionTitle;
    private int clubWildCardBerth;

    //
    // Constructors
    //
    public Club() {
    }

    public Club(String defaultClub) {
        this.clubName = Config.getDefaultClub();
        this.clubShortName = "SF Giants";
        this.clubColor = "Orange, Black, Gold, Cream";
        this.clubBallpark = "Oracle Park";
        this.clubOwner = "San Francisco Baseball Associates LLC";
        this.clubPresident = "Farhan Zaidi";
        this.clubGeneralManager = "Scott Harris";
        this.clubManager = "Gabe Kapler";
        this.clubEstablishedYear = 1833;
        this.clubWorldSeriesTitle = 8;
        this.clubNLpennant = 23;
        this.clubDivisionTitle = 8;
        this.clubWildCardBerth = 3;
    }

    //
    // Static Methods
    //
    public static String getOfficialSong() {
        return "Take Me out to the Ball Game";
    }


    //
    // Instance Methods
    //
    public String getclubShortName() {
        return this.clubShortName;
    }

    //
    // Additional Instance Methods
    //

    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void displayAbout() {
        System.out.println("-".repeat(70));
        System.out.printf("%-25s %-50s %n", "Club:", this.clubName);
        System.out.printf("%-25s %-50s %n", "Short Name:", this.clubShortName);
        System.out.printf("%-25s %-50s %n", "Established in:", this.clubEstablishedYear);
        System.out.printf("%-25s %-50s %n", "Colors:", this.clubColor);
        System.out.printf("%-25s %-50s %n", "Ballpark::", this.clubBallpark);
        System.out.printf("%-25s %-50s %n", "World Series Titles:", this.clubWorldSeriesTitle);
        System.out.printf("%-25s %-50s %n", "NL Pennants:", this.clubNLpennant);
        System.out.printf("%-25s %-50s %n", "Division Titles:", this.clubDivisionTitle);
        System.out.printf("%-25s %-50s %n", "Wild Card Berths:", this.clubWildCardBerth);
        System.out.printf("%-25s %-50s %n", "Owners:", this.clubOwner);
        System.out.printf("%-25s %-50s %n", "President:", this.clubPresident);
        System.out.printf("%-25s %-50s %n", "General Manager:", this.clubGeneralManager);
        System.out.printf("%-25s %-50s %n", "Manager:", this.clubManager);
        System.out.println("-".repeat(70));
    }

    @Override
    public void displayMission() {

    }
}