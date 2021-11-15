package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

//		double f=80.0;
//		System.out.println(5/9*(f-32.0));
		
		Scanner sc = new Scanner(System.in);
			System.out.println("화씨를 입력하세요.");
			double f= sc.nextDouble();
			System.out.println((f-32.0)*5/9+"도");
		sc.close();
	}
}
