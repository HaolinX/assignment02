/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internationalization.
// - ResourceBundle is not required.
// - Other approaches to internationalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

import java.util.Scanner;
import java.util.ArrayList;

public final class Language {
    //
    // Static Data Fields
    //
    private static final String defaultAlienSound = "~ ąļīæń ~ "; // Default
    private static String language = "";


    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Language() {
    }

    public Language(String language) {

        switch (language.toLowerCase()) {
            case "alien" -> this.populateAlienPhrases();            // Supported
            case "chinese" -> this.populateChinesePhrases();        // Future implementation
            case "french" -> this.populateFrenchPhrases();          // Future implementation
            case "spanish" -> this.populateSpanishPhrases();        // Future implementation
            case "future" -> this.populateYourLanguagePhrases();    // Future implementation
            default -> this.populateEnglishPhrases();               // Supported
        }

    }

    public static void displayAppHeader() {
        System.out.println(Config.getOfficialAppHeader());
    }

    public static Language setLanguagePreference() {
        Scanner scan = new Scanner(System.in);

        while (!(language.equalsIgnoreCase("english") || language.equalsIgnoreCase("alien"))) {
            System.out.print("Language: ");
            language = scan.nextLine();

            if (!(language.equalsIgnoreCase("english") || language.equalsIgnoreCase("alien"))) {
                System.out.println("Language: UNSUPPORTED language. Please enter your language.");
                System.out.println("Language: English, Chinese, French, Spanish, Alien");
            }
        }
        return new Language(language);
    }

    public String getGreetingPhrase(int i) {
        return "null";
    }

    public String getLanguage() {
        return language;
    }

    public String getUniversityPhrase(int i) {
        return Config.getDefaultUniversity();
    }

    public String getClubPhrase(int i) {
        return Config.getDefaultClub();
    }

    public String getConfigPhrase(int i) {
        ArrayList<String> configPhrases = new ArrayList<>();
        configPhrases.add("-".repeat(70));
        configPhrases.add("Language: " );
        configPhrases.add("Time Zone: ");
        configPhrases.add("Color Sequences: ");
        configPhrases.add("Standard Output Log: ");
        configPhrases.add("Standard Error Log: ");
        configPhrases.add("Receipt Log: ");
        configPhrases.add("");
        configPhrases.add("Default University: ");
        configPhrases.add("Default Club: ");
        return configPhrases.get(i);
    }


    //
    // Static Methods
    //

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //
    private void populateEnglishPhrases() {
    }

    private void populateAlienPhrases() {
    }

    private void populateYourLanguagePhrases() {
    }

    private void populateSpanishPhrases() {
    }

    private void populateFrenchPhrases() {
    }

    private void populateChinesePhrases() {
    }


    //
    // Language
    //
}