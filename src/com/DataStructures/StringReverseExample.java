package com.DataStructures;

import java.util.Scanner;

public class StringReverseExample {

	public static int getLength(String str) {

		int size = 0;

		boolean flag = true;
		while (flag) {
			try {
				System.out.print(str.charAt(size));
				size++;
			} catch (Exception e) {
				flag = false;
			}

		}
		return size;
	}

	public static void main(String[] args) {
		String str;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter  the String : ");
		str = scanner.nextLine();

		int size = getLength(str);
		System.out.println("\nSize of String : " + size);

		System.out.println("\n\nReversed String :");
		for (int i = size; i > 0; i--) {
			System.out.print(str.charAt(i - 1));
		}
		scanner.close();
	}

}
