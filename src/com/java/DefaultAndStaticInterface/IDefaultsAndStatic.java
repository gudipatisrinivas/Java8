package com.java.DefaultAndStaticInterface;

public interface IDefaultsAndStatic {
	
	static void defaultStaticMethod() {
		System.out.println("Hello defaultStaticMethod");
	}
	
	 default void defaultMethod() {
		System.out.println("Hello inside defaultMethod");
	}
	
	public static void main(String s[]) {
		System.out.println("hello im in Main");
		defaultStaticMethod();
	}

}
