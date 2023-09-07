package com.problem1;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
	
	
    // here method to convert dec string to binary string by using a stack
	
    public static String decimalToBinary(String decimalStr) {
        try {
            long dNum = Long.parseLong(decimalStr);
            if (dNum < 0) {
            	
                return "Input should be a non-negative dec num.";
            }
            if (dNum == 0) {
                return "0"; // Special case: decimal 0 is binary 0
            }

            Stack<Long> binStack = new Stack<>();
            while (dNum > 0) {
                long remainder = dNum % 2;
                binStack.push(remainder); // here on the stack Push remainder 
                dNum /= 2;
            }

            StringBuilder binBuilder = new StringBuilder();
            while (!binStack.isEmpty()) {
                binBuilder.append(binStack.pop()); // hare from stack pop the element
            }

            return binBuilder.toString();
        } catch (NumberFormatException e) {
            return "wrong input. Please enter a valid dec num string.";
        }
    }
    public static void main(String[] args) {
    	
        //  here Creating a Scanner object to read user input
    	
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        
        System.out.print("Enter a decimal number: ");
        String decStr = sc.nextLine();

        // Call the custom method and display the result
        
        String binRes = decimalToBinary(decStr);
        System.out.println("Binary representation: " + binRes);

        // Close the scanner
        sc.close();
    }
}








   