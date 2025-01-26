/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.saskpoly.sudharsan.assignmentjan25;

/**
 *
 * @author Sudharsan-Murali
 * github: https://github.com/Sudharsan-Murali
 */
public class AssignmentJan25 {
    /**
     * Write java code that performs the following tasks:
     *      1.Shows the number of weeks within a year. 
     *      2. Shows the count of hours in a week, month, and year.
     * 
     * Ensure that the program's output adheres to the specified format:
 
 The program provides the following results: There are (.....) weeks in a year, which 
 equates to (.....) hours. Within a month, there are (.....) hours. 
 Consequently, the program determines that there are (.....) hours in a week.
 
 (Your name goes here)
 
 Please be aware that your program does not require user input, and all calculations
 are performed within the code using mathematical operations. You are required to submit 
 several files, including a Java source code file and screenshots of the program's results. 
 It's essential to thoroughly understand your submission because you may be contacted for 
 a discussion without prior notice.
     * @param args
     */

    public static void main(String[] args) {
        /**
         * TO FIND:
         *      Number of weeks in a year
         *      Number of hours in a week, month and year respectively
         *      No input is taken and everything is found arithmetically.
         */
        
        short daysInYear = 365; 
        byte daysInWeek = 7, hoursInDay = 24;
        
        /**
         * lossy conv when storing weeksInYear as byte
         * 
         * finding num of weeks in a year 
         */
        
        int weeksInYear = daysInYear / daysInWeek;
//        System.out.print("The program provides the following results: ");
//        System.out.print("There are "+ weeksInYear +" weeks in a year, ");

        /**
         * finding num of hrs in a week
         */
        
        int hoursInWeek = daysInWeek * hoursInDay;
//        System.out.println("hrs in week: ");        
//        System.out.println(hoursInWeek);

        /**
         * finding num of hrs in a month and num of days in a month
         * 
         */
        
        int daysInMonth = (daysInYear / 12); //since 12 months in a year
//        System.out.println("daysInMonth: " + daysInMonth);
        int hoursInMonth = (daysInMonth * hoursInDay);
//        System.out.println(hoursInMonth);
        
        /**
         * finding num of hrs in a year
         */
        int hoursInYear = daysInYear * 24; 
//        System.out.println("hoursInYear: " + hoursInYear);
        
        /**
         * Printing the Final Message
         */

        System.out.print("The program provides the following results: ");
        System.out.print("There are "+ weeksInYear +" weeks in a year, ");
        System.out.print("which equates to "+ hoursInYear +" hours. "); 
        System.out.print("Within a month, there are " + hoursInMonth+ " hours. ");
        System.out.println("\n");
        System.out.print("Consequently, the program determines that there are " + hoursInWeek + " hours in a week.");
        System.out.println("\n");
        System.out.println("Sudharsan Murali");

    }
}
