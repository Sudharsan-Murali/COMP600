/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.classworks;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ReadingUserInputs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 2 double numbers:");
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        System.out.println("The result of division of the two doubles is: " + a/b);
        System.out.println("The result of multiplication of the two doubles is: " + a*b);
        
        scanner.close();
    }
}
