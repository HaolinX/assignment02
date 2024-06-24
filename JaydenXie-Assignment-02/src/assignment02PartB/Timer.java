/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Timer {

    //
    // Static Data Fields
    //
    private static String inputTimeZone = "";

    //
    // Instance Data Fields
    //
    private DateFormat dateFormat;
    private String timeZone;
    //
    // Constructors
    //
    public Timer() {
        //this.timeZone = Config.getDefaultTimeZone();

    }

    public Timer(String timeZone) {
        if (timeZone.equals("pst")) {
            timeZone = Config.getDefaultTimeZone();
        } else if (timeZone.equals("est")) {
            timeZone = "EST";
        } else if (timeZone.equals("cst")) {
            timeZone = "CST";
        }
        this.timeZone = timeZone;
        this.dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss [ms 'ms'] a z");
        this.dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
        this.dateFormat.format((new Date()));

    }


    //
    // Static Methods
    //
    public static Timer setTimeZonePreference() {
        Scanner scan = new Scanner(System.in);

        while (!(inputTimeZone.equalsIgnoreCase("pst") || inputTimeZone.equalsIgnoreCase("est") || inputTimeZone.equalsIgnoreCase("cst"))) {
            System.out.print("Time Zone: ");
            inputTimeZone = scan.nextLine();

            if (!(inputTimeZone.equalsIgnoreCase("pst") || inputTimeZone.equalsIgnoreCase("est") || inputTimeZone.equalsIgnoreCase("cst"))) {
                System.out.println("Time Zone: INVALID time zone. Please enter your time zone.");
            }
        }
        return new Timer(inputTimeZone);


    }

    //
    // Additional Static Methods
    //

    //
    // Instance Methods
    //
    public String getTimeZoneFormatted() {
        return switch (timeZone.toLowerCase()) {
            case "pst" -> "Pacific Standard Time in Day Light Saving";
            case "est" -> "Eastern Standard Time not in Day Light Saving";
            case "cst" -> "Central Standard Time in Day Light Saving";
            default -> "";
        };
    }

    public String getChatSessionTime() {
        return this.dateFormat.format((new Date()));
    }

    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}