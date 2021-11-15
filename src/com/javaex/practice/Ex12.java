package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요: ");
		double a = sc.nextDouble();
		
		System.out.println("원의 넓이는" +
				a*a*3.14
				+"cm^3입니다.");
		
		sc.close();
		
	}

}
