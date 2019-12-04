package com.billoscu.generics;

public class OverloadedComparableGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Maximun of integer : "+ maximum(4, 8, 2));
		System.out.println("Maximun of double : "+ maximum(4.8, 8.7, 2.0));
		System.out.println("Maximun of string : "+ maximum("Hello", "Dinner", "Time")); // alphabetical comparable
		// compara por la primera letra del alfabeto
	}
	
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		
		T max = x;
		
		if(y.compareTo(max)> 0) 
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		
		return max; 
	}

}
