package com.demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCountGivenByUserExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to find : ");
        String wordToCount = scanner.nextLine();
        int count = countWordInFile(wordToCount);

        System.out.println(wordToCount + " -  " + count + " times.");
    }

    private static int countWordInFile(String word) {
        int count = 0;

        try {
            FileInputStream fin = new FileInputStream("demo.txt");
            Scanner scanner = new Scanner(fin);
            while (scanner.hasNext()) {
                String currentLine = scanner.nextLine();

                // Split the line into words manually using spaces, commas, and full stops
                String[] words = currentLine.split(" ");

                for (String currentWord : words) {
                    // Remove leading and trailing whitespace from the word
                    currentWord = currentWord.trim();

                    // Increment count if the word matches (case-sensitive)
                    if (currentWord.equals(word)) {
                        count++;
                    }
                }
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

}
