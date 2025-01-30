/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.assignments;

/**
 *
 * @author Student
 */

import java.awt.GradientPaint;
import java.util.Scanner;

public class classAssignment28Jan {
    public static void main(String[] args) {
        /**
         * Write a Java program that takes a student's numerical score as input and assigns a letter grade based on the following grading criteria:

A+: 90 and above
B+: 80 to 89.99
C+: 70 to 79.99
D+: 60 to 69.99
Fail: Below 60
Your program should use conditional statements to determine and print the appropriate grade.

Your program should prompt the user to enter 7 numerical scores and then display the corresponding letter grade.
         */
        
        int Sub1, Sub2, Sub3, Sub4, Sub5, Sub6, Sub7;
        
        // Getting inputs for each subject
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for Subject 1:");
        Sub1 = scanner.nextInt();
        GradeCalculator(Sub1);
        
        System.out.println("Enter score for Subject 2:");
        Sub2 = scanner.nextInt();
        GradeCalculator(Sub2);
        
        System.out.println("Enter score for Subject 3:");
        Sub3 = scanner.nextInt();
        GradeCalculator(Sub3);
        
        System.out.println("Enter score for Subject 4:");
        Sub4 = scanner.nextInt();
        GradeCalculator(Sub4);
       
        System.out.println("Enter score for Subject 5:");
        Sub5 = scanner.nextInt();
        GradeCalculator(Sub5);
        
        System.out.println("Enter score for Subject 6:");
        Sub6 = scanner.nextInt();
        GradeCalculator(Sub6);
        
        System.out.println("Enter score for Subject 7:");
        Sub7 = scanner.nextInt();
        GradeCalculator(Sub7);
    }
    
    public static void GradeCalculator(int Score){
        if(Score >= 90)
            System.out.println("Grade: A+");
//            return "A+";
        else if(Score >= 80 && Score <= 89.99)
            System.out.println("Grade: B+");
//            return "B+";
        else if(Score >= 70 && Score <= 79.99)
            System.out.println("Grade: C+");
//            return "C+";
        else if(Score >= 60 && Score <= 69.99)
            System.out.println("Grade: D+");
//            return "D+";
        else 
            System.out.println("Grade: Fail");
//            return "Fail";
    }
}
