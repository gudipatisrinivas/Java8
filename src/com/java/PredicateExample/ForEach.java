package com.java.PredicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	
	
	public void forEachSample() {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			myList.add(i);
		}
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		});
		myList.forEach(I -> System.out.println(I));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ForEach().forEachSample();

	}

}
