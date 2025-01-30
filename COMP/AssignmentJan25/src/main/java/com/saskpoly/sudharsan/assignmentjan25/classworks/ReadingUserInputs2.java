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
public class ReadingUserInputs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner .nextLine();
        System.out.println("Enter your age: ");
        short  age = scanner.nextShort();
        System.out.println("Hi, " + name + ". Your age is " + age + ".");
        
        scanner.close();
    }
}
