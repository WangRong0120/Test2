package com.wr.test;

public  class Father {
	static int x=10;
	static {
		x+=5;
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
	
	static {
		x+=3;
	}
}
