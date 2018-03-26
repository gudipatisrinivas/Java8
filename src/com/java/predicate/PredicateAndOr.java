package com.java.predicate;

import java.util.function.Predicate;

public class PredicateAndOr {
	
	public static void m1(Predicate<Integer> p,int[] arr) {
		for(int i=0;i<arr.length;i++) {
		if(p.test(i)) {
			System.out.println(arr[i]);
			
		  }
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,8,10,19,20};
		Predicate<Integer> p1=i->i>10;

		Predicate<Integer> p2=i->i%2==0;
		System.out.println("Number greater than 10");
		m1(p1,arr);
		System.out.println("Even number");
		m1(p2,arr);
		System.out.println("Even number and greater than 10");
		m1(p2.and(p2),arr);
		System.out.println("Even number or  greater than 10");
		m1(p2.or(p2),arr);
		System.out.println("Even number or  Negate");
		m1(p2.negate(),arr);
	}

}
