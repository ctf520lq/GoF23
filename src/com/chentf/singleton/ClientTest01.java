package com.chentf.singleton;

public class ClientTest01 {

	public static void main(String[] args) {
		SingletonDemo04 s1 = SingletonDemo04.getInstance();
		SingletonDemo04 s2 = SingletonDemo04.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		System.out.println(SingletonDemo05.INSTANCE == SingletonDemo05.INSTANCE);
	}
}
