package com.java.predicate;

import java.util.function.Predicate;

public class PredicateImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=I->I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		
		Predicate<String> s=Str->Str.length()>10;
		System.out.println(s.test("Srinivas gudipati"));
		System.out.println(s.test("Mounika"));
	}
}
