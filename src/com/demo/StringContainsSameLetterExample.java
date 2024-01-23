package com.demo;

import java.util.Scanner;

public class StringContainsSameLetterExample {
    public static void main(String[] args) {
        // Get user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();

        // Check and print the result
        boolean result = checkSameLetters(input1, input2);
        System.out.println(result);
    }

    /**
 * Checks if two strings contain the same letters, ignoring the case.
 *
 * @param str1 the first string
 * @param str2 the second string
 * @return true if the strings contain the same letters, false otherwise
 */
public static boolean checkSameLetters(String str1, String str2) {
    // Convert strings to lowercase for case-insensitive comparison
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Check if both strings contain the same letters
    for (int i = 0; i < str1.length(); i++) {
        char currentChar = str1.charAt(i);
        if (str2.indexOf(currentChar) == -1) {
            return false; // Current character not found in the second string
        }
    }

    for (int i = 0; i < str2.length(); i++) {
        char currentChar = str2.charAt(i);
        if (str1.indexOf(currentChar) == -1) {
            return false; // Current character not found in the first string
        }
    }

    return true; // Both strings contain the same letters
}
}
