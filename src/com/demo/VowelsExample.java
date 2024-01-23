package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VowelsExample {
    public static void main(String[] args) {
        FileInputStream fin;
        try {
            fin = new FileInputStream("vowels.txt");
            int i = 0;
            int charCount = 0;
            int vowelsCount = 0;
            int spaceCount = 0;
            int wordsCount = -1;
            boolean isWord = false; // Flag to track if the current character is part of a word

            try {
                while ((i = fin.read()) != -1) {
                    charCount++;
                    char chars = (char) i;
                    if (chars == 'a' || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u' || chars == 'A' || chars == 'E' || chars == 'I' || chars == 'O' || chars == 'U') {
                        vowelsCount++;
                    }
                    if (chars == ' ') {
                        spaceCount++;
                        isWord = false; // Reset the flag when a space is encountered
                    } else {
                        // If the current character is not a space, it is part of a word
                        if (!isWord) {
                            wordsCount++;
                            isWord = true; // Set the flag to indicate the start of a new word
                        }
                    }
                }

                // Check if the last word is counted (in case the file doesn't end with a space)
                if (isWord) {
                    wordsCount++;
                }

                System.out.println("Character Count : " + charCount);
                System.out.println("Vowel Count : " + vowelsCount);
                System.out.println("Space Count : " + spaceCount);
                System.out.println("Words Count : " + wordsCount);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
