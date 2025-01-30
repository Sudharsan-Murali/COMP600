/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.assignments;

import java.util.Scanner;

/**
 *
 * @author Sudharsan
 */
public class AssignmentJan30 {
    public static void main(String[] args) {
        int Sub1, Sub2, Sub3, Sub4, Sub5, Average;
        
        // Getting inputs for each subject
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score for Subject 1:");
        Sub1 = scanner.nextInt();
//        GradeCalculator(Sub1);
        
        System.out.println("Enter score for Subject 2:");
        Sub2 = scanner.nextInt();
//        GradeCalculator(Sub2);
        
        System.out.println("Enter score for Subject 3:");
        Sub3 = scanner.nextInt();
//        GradeCalculator(Sub3);
        
        System.out.println("Enter score for Subject 4:");
        Sub4 = scanner.nextInt();
//        GradeCalculator(Sub4);
       
        System.out.println("Enter score for Subject 5:");
        Sub5 = scanner.nextInt();
//        GradeCalculator(Sub5);
        

        Average = (Sub1 + Sub2 + Sub3 + Sub4 + Sub5)/5;
        GradeCalculator(Average);
    }
    
    public static void GradeCalculator(int Score){
        String Grade;
        if(Score >= 90){
            Grade = "Excellent";
            System.out.println("Excellent\n"+ SwitchMessage(Grade));
            SwitchMessage(Grade);
//            return "A+";
        }
            
        else if(Score >= 80 && Score < 90){
            Grade = "Very Good";
            System.out.println("Very Good\n"+ SwitchMessage(Grade));
            SwitchMessage(Grade);
//            return "B+";
        }
        else if(Score >= 70 && Score < 80){
            Grade = "Good";
            System.out.println("Good\n"+ SwitchMessage(Grade));
            SwitchMessage(Grade);
//            return "C+"
        }
        else if(Score >= 60 && Score < 70){
            Grade = "Average";
            System.out.println("Average\n"+ SwitchMessage(Grade));
//            return "D+";
        }
        else if(Score < 60){
            Grade = "Fail";
            System.out.println("Fail\n"+ SwitchMessage(Grade));
//            return "Fail";
        }
    }
    
    public static String SwitchMessage(String Grade){
        String message = null;
        switch (Grade){
            case "Excellent":
                message = "Great Job!!";
                break;
            case "Very Good":
                message = "Good. Needs Improvement!!";
                break;
            case "Good":
                message = "Need a lot of improvement!!";
                break;
            case "Average":
                message = "Work hard!!";
                break;
            case "Fail":
                message = "Meet me after class!!";
                break;
        }
        return message;
    }
}
