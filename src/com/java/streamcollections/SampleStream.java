package com.java.streamcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SampleStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(100);
		al.add(90);
		al.add(80);
		al.add(70);

		List<Integer> newList = al.stream().filter(I -> ((I / 10) % 2) == 0).collect(Collectors.toList());
		System.out.println(newList);
		List<Integer> newList2 = al.stream().map(I -> ((I * 10) *2) ).collect(Collectors.toList());
		System.out.println(newList2);

	}

}
