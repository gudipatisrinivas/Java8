package com.java.streamcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(100);
		al.add(90);
		al.add(80);
		al.add(70);
	
	List<Integer> newList =al.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
	System.out.println("natural Sorting Order"+newList);
	
	
	List<Integer> newList2 =al.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
	System.out.println("Descending Sorting Order"+newList2);
	

	
	}
}