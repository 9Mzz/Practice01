package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("500원 개수:");
	int m1 = sc.nextInt();
	System.out.print("100원 개수:");
	int m2 = sc.nextInt();
	System.out.print("50원 개수:");
	int m3 = sc.nextInt();
	System.out.print("10원 개수:");
	int m4 = sc.nextInt();

	System.out.println("동전의 총합은" + 
			((m1*500)+(m2*100)+(m3*50)+(m4*10))
			+" 원 입니다.");
	
	
	sc.close();
	}
}
