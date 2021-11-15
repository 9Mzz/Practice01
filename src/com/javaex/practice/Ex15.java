package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마일을 입력하세요");
		int mile = sc.nextInt();
		double km = (double)mile;
		System.out.println(mile+"마일은 "+km*1.609+"킬로미터 입니다.");
		
		
		sc.close();
		
	}
}
