package com.lti;

public class Calc {
	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return (i + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10, 5));
		System.out.println(subs(20,10));
		System.out.println(prod(20,10));
		System.out.println(div(20,10));
		
	}

	private static int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	private static int prod(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	private static int subs(int i, int j) {
		return (i-j);
	}

}
