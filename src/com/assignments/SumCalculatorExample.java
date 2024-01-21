package com.assignments;

class SumCalculator extends Thread {
	int[] numbers;
	int partialSum;
	int startIndex;
	int endIndex;

	public SumCalculator(int[] numbers, int startIndex, int endIndex) {
		super();
		this.numbers = numbers;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	public int getPartialSum() {
		return partialSum;
	}

	public void run() {
		for (int i = startIndex; i < endIndex; i++) {
			partialSum += numbers[i];
		}
	}

}

public class SumCalculatorExample {

	public static void main(String[] args) throws InterruptedException {
		int[] numbers = new int[1000];
		for (int i = 1; i <= 1000; i++) {
			numbers[i] = i;
		}
		int numthreads = 5;
		SumCalculator[] cal = new SumCalculator[numthreads];
		int batchSize = numbers.length / numthreads;

		for (int i = 0; i < numthreads; i++) {
			int start = i * batchSize;
			int end = (i == numthreads - 1) ? numbers.length - 1 : start + batchSize - 1;
			cal[i] = new SumCalculator(numbers, start, end);
			cal[i].start();
		}
		for (int c = 0; c <= numthreads; c++) {
			cal[c].join();
		}
		int totalSum = 0;
		for (int c = 0; c <= numthreads; c++) {
			totalSum += cal[c].getPartialSum();
		}
		System.out.println("Total Sum : " + totalSum);
	}

}
