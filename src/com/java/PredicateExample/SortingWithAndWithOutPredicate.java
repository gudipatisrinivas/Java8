package com.java.PredicateExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithAndWithOutPredicate {

	private void sortingWithOutPredicate(List<String> myList) {
		System.out.println("*****Using sortingWithOutPredicate*****");
		
		Collections.sort(myList, new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});
		
		for(String s:myList) {
			System.out.println(s);
		}
		
	}
	
	private void sortingWithPredicate(List<String> myList) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("****Using sortingWithPredicate********");
		Collections.sort(myList,(s1,s2)->s1.compareTo(s2));
		myList.forEach(s1->System.out.println(s1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<String>();
		myList.add("srinivas");
		myList.add("sankar");
		myList.add("satya");
		myList.add("mounika");
		myList.add("devika");
		myList.add("jagan");
		
		SortingWithAndWithOutPredicate sorting=new SortingWithAndWithOutPredicate();
		sorting.sortingWithOutPredicate(myList);
		sorting.sortingWithPredicate(myList);
		

	}

	

}
