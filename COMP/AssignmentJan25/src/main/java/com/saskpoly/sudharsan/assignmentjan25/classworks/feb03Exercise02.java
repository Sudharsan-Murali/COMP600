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
public class feb03Exercise02 {

    public static void main(String[] args) {
        /**
         * Write a program that accepts positive numbers only. Your program
         * should stop taking values when you enter 2 subsequent negative
         * numbers. You should use boolean data type.
         */

        int a = 0;
        float avg = 0;
//        boolean i = (a !< 0);
//        boolean j = (b !< 0);

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean isConsequetive = false;

        while (count < 2) {
            a = scanner.nextInt();

            if (a >= 0) {
                
                avg = (avg + a )/2;
                System.out.println("Average: " + avg);
                count = 0;
                isConsequetive = false;
            }
            else if (isConsequetive ==  false && a < 0) {
                count++;
                System.out.println("count: " + count);
                isConsequetive = true;
            }
            else if (isConsequetive ==  true && a < 0) {
                count++;
                System.out.println("count: " + count);
//                isConsequetive = true;
            }            
        }
        System.out.println("Final Average: " + avg);
    }
}