package com.perscholas.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        Write an if statement to print out “Less than 10” if x is less than 10.
//        Change x to equal 15 and notice the result (console should not display anything).

        int x;
        x = 7;
        if (x < 10) System.out.println("Less then 10");

//        Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        Write an if-else statement that prints out “Less than 10” if x is less than 10 and
//        “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.

        int x;
        x = 7;
        if (x < 10) System.out.println("Less then 10");
        else System.out.println("Greater than 10");

//        Write a program that declares 1 integer variable x, and
//        Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
//        “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal
//        to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.

        int x;
        x = 50;
        if (x < 10) System.out.println("Less than 10");
        else if (x > 10 && x < 20) System.out.println("Between 10 and 20");
        else if (x >= 20) System.out.println("Greater than or equal to 20");


//        Write a program that declares 1 integer variable x, and then assigns 15 to it.
//        Write an if-else statement that prints “Out of range” if the number is less than
//        10 or greater than 20 and prints “In range” if between 10 and 20 (including equal
//        to 10 or 20). Change x to 5 and notice the result.

        int x;
        x = 5;
        if (x < 10 || x > 20) System.out.println("Out of range");
        else if (x >= 10 && x <= 20) System.out.println("In range");

//        Write a program that uses if-else-if statements to print out grades A, B, C, D, F
//        according to the following criteria:


//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: <60
//
//        Use the Scanner class to accept a number score from the user to determine the letter grade.
//        Print out “Score out of range.” if the score is less than 0 or greater than 100.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int number = input.nextInt();

        char result;

        if (number > 89 && number < 100) result = 'A';
        else if (number > 79 && number < 90) result = 'B';
        else if (number > 69 && number < 80) result = 'C';
        else if (number > 59 && number < 70) result = 'D';
        else result = 'F';

        System.out.println("Your grade is " + result);

//        Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement
//        to print out the corresponding weekday. Print “Out of range” if the number is less than 1 or
//        greater than 7. Don’t forget to include “break” statements in each of your cases.

        Scanner input = new Scanner(System.in);
        System.out.println("Number of the week day");
        byte day = input.nextByte();
        String outDay = "";

        switch (day) {
            case 1:
                outDay = "Monday";
                break;
            case 2:
                outDay = "Tuesday";
                break;
            case 3:
                outDay = "Wednesday";
                break;
            case 4:
                outDay = "Thursday";
                break;
            case 5:
                outDay = "Friday";
                break;
            case 6:
                outDay = "Saturday";
                break;
            case 7:
                outDay = "Sunday";
        }

        System.out.println(outDay);
    }
}
