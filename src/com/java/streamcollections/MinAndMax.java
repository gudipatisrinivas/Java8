package com.java.streamcollections;

import java.util.ArrayList;
import java.util.List;

public class MinAndMax {

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
		
		System.out.println("Minimum Value"+al.stream().min((i1,i2)->i1.compareTo(i2)).get());

		System.out.println("Max value"+al.stream().max((i1,i2)->i1.compareTo(i2)).get());
	
	}

}
