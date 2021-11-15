package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {

//		int x = 1;
//		int y = 2;
//		
//		int a = ++x *2;
//		int b = y++ *2;
//		
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.out.println("x=" + x);
//		System.out.println("y=" +y);

		int x = 1;	//1
		int y = 2;	//2
		
		int a = ++x *2;	// x에 1을 더한다 --> 더해진 x를 출력한다 -> 2를 곱한다
		int b = y++ *2; // y를 출력한다 --> y에 1을 더한다 --> 2를 곱한다
		
		System.out.println("a=" + a);	// a=4
		System.out.println("b=" + b);	// b=4
		System.out.println("x=" + x);	// x=2
		System.out.println("y=" + y);	// y=3
		
	}
}
