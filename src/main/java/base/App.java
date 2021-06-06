/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the
corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges

Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int input = readNum();
        String month = findMonth(input);
        generateOutput(input, month);
    }

    private static void generateOutput(int input, String month) {
        System.out.println("Please enter the number of the month: " + input + "\nThe name of the month is " + month + ".");
    }

    private static String findMonth(int number) {
        String month;
        switch(number) {
            case 1:
                return month = "January";
            case 2:
                return month = "February";
            case 3:
                return month = "March";
            case 4:
                return month = "April";
            case 5:
                return month = "May";
            case 6:
                return month = "June";
            case 7:
                return month = "July";
            case 8:
                return month = "August";
            case 9:
                return month = "September";
            case 10:
                return month = "October";
            case 11:
                return month = "November";
            case 12:
                return month = "December";
            default:
                return "not listed outside of the proper (1 - 12) range";
        }
    }

    private static int readNum() {
        return in.nextInt();
    }
}
