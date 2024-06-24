/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //
    private String UniversityOfficialName;
    private String UniversityMottoInLatin;
    private String UniversityMottoInEnglish;
    private String UniversityType;
    private String UniversityLocation;
    private String UniversityAddress;
    private String UniversityColor;
    private String UniversityNickName;
    private String UniversityMascot;
    private String UniversityWebsite;
    private int UniversityEstablishmentYear;

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public University() {
    }

    public University(String defaultUniversity) {
        this.UniversityOfficialName = Config.getDefaultUniversity();
        this.UniversityMottoInLatin = "Experientia Docet";
        this.UniversityMottoInEnglish = "Experience Teaches";
        this.UniversityType = "Public";
        this.UniversityLocation = "San Francisco, California, United States";
        this.UniversityAddress = "1600 Holloway Avenue, San Francisco, CA 94132";
        this.UniversityColor = "Purple, Gold";
        this.UniversityNickName = "Gators";
        this.UniversityMascot = "Gator";
        this.UniversityWebsite = "www.sfsu.edu";
        this.UniversityEstablishmentYear = 1899;

    }

    //
    // Instance Methods
    //

    //
    // Additional Methods
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
        System.out.printf("%-25s %-50s %n", "Official Name:", this.UniversityOfficialName);
        System.out.printf("%-25s %-50s %n", "Motto in Latin:", this.UniversityMottoInLatin);
        System.out.printf("%-25s %-50s %n", "Motto in English:", this.UniversityMottoInEnglish);
        System.out.printf("%-25s %-50s %n", "Type:", this.UniversityType);
        System.out.printf("%-25s %-50s %n", "Year of Establishment:", this.UniversityEstablishmentYear);
        System.out.printf("%-25s %-50s %n", "Location:", this.UniversityLocation);
        System.out.printf("%-25s %-50s %n", "Address:", this.UniversityAddress);
        System.out.printf("%-25s %-50s %n", "Colors:", this.UniversityColor);
        System.out.printf("%-25s %-50s %n", "Nickname:", this.UniversityNickName);
        System.out.printf("%-25s %-50s %n", "Mascot:", this.UniversityMascot);
        System.out.printf("%-25s %-50s %n", "Website:", this.UniversityWebsite);
        System.out.println("-".repeat(70));
    }

    @Override
    public void displayMission() {

    }
}