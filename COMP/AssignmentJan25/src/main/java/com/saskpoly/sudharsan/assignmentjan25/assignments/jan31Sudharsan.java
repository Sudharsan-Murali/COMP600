/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saskpoly.sudharsan.assignmentjan25.assignments;

/**
 *
 * @author Sudharsan
 */
public class jan31Sudharsan {
//    Variable initialization
    public static String OddNumbers = "";
    public static String EvenNumbers = "";
    public static int PositiveNumbers;
    public static int NegativeNumbers;
    
    public static void main(String[] args) {
        int n1 = -13, n2 = -10, n3 = -5, n4 = 0, n5 = 5, n6 = 10, n7 = 13;
    
//        Creating a String to display the odd and even numbers
//    DisplayNumbers(n1);
    if (n1 % 2 != 0)
            OddNumbers += n1 + ", ";
        else
            EvenNumbers += n1 + ", ";
//    DisplayNumbers(n2);
    if (n2 % 2 != 0)
            OddNumbers += n2 + ", ";
        else
            EvenNumbers += n2 + ", ";
//    DisplayNumbers(n3);
    if (n3 % 2 != 0)
            OddNumbers += n3 + ", ";
        else
            EvenNumbers += n3 + ", ";
//    DisplayNumbers(n4);
    if (n4 % 2 != 0)
            OddNumbers += n4 + ", ";
        else
            EvenNumbers += n4 + ", ";
//    DisplayNumbers(n5);
    if (n5 % 2 != 0)
            OddNumbers += n5 + ", ";
        else
            EvenNumbers += n5 + ", ";
//    DisplayNumbers(n6);
    if (n6 % 2 != 0)
            OddNumbers += n6 + ", ";
        else
            EvenNumbers += n6;
//    DisplayNumbers(n7);
    if (n7 % 2 != 0)
            OddNumbers += n7;
        else
            EvenNumbers += n7;
    
//    Displaying the output for odd and even numbers
//    System.out.println("Odd Numbers: " + OddNumbers);
//    System.out.println("Even Numbers: " + EvenNumbers);
    System.out.println("The odd numbers are " + OddNumbers + ". Whereas The \neven numbers are " + EvenNumbers + ".\n");
    
//    Adding odd and even numbers by calling the AddNumbers() function
    AddNumbers(n1);
    AddNumbers(n2);
    AddNumbers(n3);
    AddNumbers(n4);
    AddNumbers(n5);
    AddNumbers(n6);
    AddNumbers(n7);
    
//    Displaying the sum of odd and even numbers
//    System.out.println("Sum of Positive Numbers: " + PositiveNumbers);
//    System.out.println("Sum of Negative Numbers: " + NegativeNumbers);
    System.out.println("The result:\n");
//    Checking to see if the positive and negative number sums are equal
    Boolean PositiveNegativeComparison = PositiveNumbers != NegativeNumbers;
//    System.out.println("PositiveNumbers Not Equals NegativeNumbers: " + PositiveNegativeComparison);
    System.out.println("By comparing the sum of negative numbers with the sum of positive numbers, the \nresult is:" + PositiveNegativeComparison);
    }
    
//    function to add the postive and negative numbers respectively
    public static void AddNumbers(int num){
        if(num < 0)
            NegativeNumbers += num;
        else if(num > 0)
            PositiveNumbers += num;
        else
            PositiveNumbers += 0;
    }
    
//    function to display the odd and even numbers in a string
//    public static void DisplayNumbers(int num) {
//        if (num % 2 != 0)
//            OddNumbers += num + ", ";
//        else
//            EvenNumbers += num + ", ";
//    }
}
