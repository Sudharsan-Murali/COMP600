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
public class AssignmentFeb04Sudharsan {
     public static void main(String[] args) {
        /**
         * Write  Java program that continuously accepts string inputs. The program stops 
         * taking entries once the user enters his\her name in uppercase letters. 
         * Upon termination, the program outputs:
         * The user's name .
         * The total number of attempts before termination.
         * Remember to upload a screenshot for the outputs in addition to java code.
         */

        Scanner scanner = new Scanner(System.in);
        
        // Initialize the counter for attempts
        int attempts = 0;
        String userName = "";
        
        // Continuously take inputs until the user enters the name in uppercase letters
        while (true) {
            System.out.println("Please enter your name:");
            String input = scanner.nextLine();
            attempts++; // increment attempt
            
            // Check if the input is in uppercase letters
            if (input.equals(input.toUpperCase())) {
                userName = input;
                break;
            }
        }
        
        // Output the results
        System.out.println("Your name: " + userName);
        System.out.println("Total No. of attempts: " + attempts);
        }
}
