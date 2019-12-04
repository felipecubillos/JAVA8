package com.billoscu.generics;

public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array = {1,3,4,6,7};
		Double [] arrayD = {1.0,3.5,4.5,4.8};
		Character [] arrayC = {'H','E','L','L','O'};
		
		printArray(array);
		printArray(arrayD);
		printArray(arrayC);

	}

	public static void printArray(Integer[] array) {

		for (Integer value : array) {
			System.out.printf("%s ", value);
		}

		System.out.println();
	}

	public static void printArray(Double[] array) {

		for (Double value : array) {
			System.out.printf("%s ", value);
		}

		System.out.println();
	}

	public static void printArray(Character[] array) {

		for (Character value : array) {
			System.out.printf("%s ", value);
		}

		System.out.println();
	}

}
