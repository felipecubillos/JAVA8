package com.billoscu.generics;

public class OverloadedGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = { 1, 3, 4, 6, 7 };
		Double[] arrayD = { 1.0, 3.5, 4.5, 4.8 };
		Character[] arrayC = { 'H', 'E', 'L', 'L', 'O' };

		printArray(array);
		printArray(arrayD);
		printArray(arrayC);
	}

	public static <T> void printArray(T[] array) {

		for (T value : array) {
			System.out.printf("%s ", value);
		}

		System.out.println();
	}

}
