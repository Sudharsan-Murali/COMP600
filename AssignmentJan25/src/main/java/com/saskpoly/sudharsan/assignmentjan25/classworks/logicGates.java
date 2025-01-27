/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.classworks;

/**
 *
 * @author Student
 */
public class logicGates {
    public static void main(String[] args) {
        int x = 12, y = 33;
        double d = 2.45, e = 4.54;
        
        System.out.println(x < y && d < e);
        System.out.println(!(x < y));
        
        boolean test = 'a' > 'z'; 
        /**
         * the ASCII value of 'a' is smaller than that of 'z'
         */
//        System.out.println(test);
        System.out.println(test || d - 2.1 > 0);
    }
   
}
