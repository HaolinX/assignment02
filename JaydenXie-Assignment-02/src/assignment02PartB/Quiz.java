/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Quiz {

    //
    // Instance Data Fields
    //
    private String quizQuestion;
    private String quizAnswer;

    //
    // Constructors
    //
    public Quiz() {
    }

    public Quiz(String quizQuestion, String quizAnswer) {
        this.quizQuestion = quizQuestion;
        this.quizAnswer = quizAnswer;
    }

    //
    // Instance Methods
    //
    public String getQuizQuestion(){
        return this.quizQuestion;
    }

    public String getQuizAnswer() {
        return this.quizAnswer;
    }

//    public void setQuizQuestion(String quizQuestion) {
//        this.quizQuestion = quizQuestion;
//    }
//
//    public void setQuizAnswer(String quizAnswer) {
//        this.quizAnswer = quizAnswer;
//    }

    //
    // Additional Instance Methods
    //

    //
    // Language
    //

    //
    //Override
    //
    @Override
    public String toString() {
        return quizQuestion;
    }
}