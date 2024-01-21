package com.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMissingElements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count of elements you want to enter: ");
		int count = scanner.nextInt();

		ArrayList<Integer> elements = new ArrayList<Integer>();
		for (int index = 0; index < count; index++) {
			int element = scanner.nextInt();
			elements.add(element);
		}

		Collections.sort(elements);
		int minElement = elements.get(0);
		int maxElement = elements.get(count - 1);
		System.out.println("Min elements" + minElement);
		System.out.println("Max  elements" + maxElement);
		System.out.println("Sorted : " + elements);

		System.out.println("\n-----------Displaying Elements----------\n");
		for (Integer num : elements) {
			System.out.println("Element : " + num);
		}
		System.out.println("\n-----------Displaying Missing Elements----------\n");
		for (int i = minElement; i < maxElement; i++) {
			if (!elements.contains(i))
				System.out.println("Missing Element : " + i);
		}
	}
}
