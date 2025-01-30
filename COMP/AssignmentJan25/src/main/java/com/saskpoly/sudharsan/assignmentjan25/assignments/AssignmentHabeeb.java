/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.assignments;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class AssignmentHabeeb {
    public static void main(String[] args) {
        
        // Getting inputs for each subject
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter score for Subject 1:");
        int Subject1 = scanner.nextInt();
        System.out.println("Enter score for Subject 2:");
        int Subject2 = scanner.nextInt();
        System.out.println("Enter score for Subject 3:");
        int Subject3 = scanner.nextInt();
        System.out.println("Enter score for Subject 4:");
        int Subject4 = scanner.nextInt();
        System.out.println("Enter score for Subject 5:");
        int Subject5 = scanner.nextInt();
        System.out.println("Enter score for Subject 6:");
        int Subject6 = scanner.nextInt();
        System.out.println("Enter score for Subject 7:");
        int Subject7 = scanner.nextInt();
        scanner.close();
        
        // Output for subjects
        Grade(Subject1);
        Grade(Subject2);
        Grade(Subject3);
        Grade(Subject4);
        Grade(Subject5);
        Grade(Subject6);
        Grade(Subject7);
    }
    
    public static void Grade(int Score){
        if(Score >= 90)
            System.out.println("A+");
        if(Score >= 80 && Score <= 89.99)
            System.out.println("B+");
        if(Score >= 70 && Score <= 79.99)
            System.out.println("C+");
        if(Score >= 60 && Score <= 69.99)
            System.out.println("D+");
        if(Score < 60)
            System.out.println("Fail");
    }
}
