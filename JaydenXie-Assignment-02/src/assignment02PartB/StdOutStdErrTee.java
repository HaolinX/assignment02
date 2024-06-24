/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class StdOutStdErrTee extends OutputStream {

    //
    // Static Data Fields
    //
    private static String defaultLogDirectoryPath = Config.getDefaultLogDirectoryPath();
    private static String defaultStdOutFilePath = Config.getDefaultStdOutFilePath();
    private static String defaultStdErrFilePath = Config.getDefaultStdErrFilePath();

    //
    // Instance Data Fields
    //
    private PrintWriter printWriter;
    private FileOutputStream stdOutputStream;
    private FileOutputStream stdErrStream;

    //
    // Constructors
    //
    public StdOutStdErrTee() {
        try {
//            String firstName = ChatSession.getInputFirstName();
//            String lastName = ChatSession.getInputLastName();
//            String email = ChatSession.getInputEmail();
//            printWriter = new PrintWriter(new FileWriter(defaultLogDirectoryPath + "Receipt-" + firstName.toUpperCase() + "-" + lastName.toUpperCase() + "-" + email.toUpperCase() + ".log"));
            printWriter = new PrintWriter(new FileWriter(defaultLogDirectoryPath + "Receipt.log"));
            stdOutputStream = new FileOutputStream(defaultStdOutFilePath, true);
            stdErrStream = new FileOutputStream(defaultStdErrFilePath, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
    // Instance Methods
    //

    public String getStdOutFilePath() {
        return Config.getDefaultStdOutFilePath();
    }

    public String getStdErrFilePath() {
        return Config.getDefaultStdErrFilePath();
    }

    public void startLog() {
    }

    public void stopLog() {

        try {
            printWriter.close();
            stdOutputStream.close();
            stdErrStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        readData(defaultLogDirectoryPath + "Receipt.log");
    }

    public void readData(String path) {
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeData() {

    }

    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
    public void write(int b) throws IOException {
    }
}