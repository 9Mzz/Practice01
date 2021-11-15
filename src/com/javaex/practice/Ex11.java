package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
	Scanner a = new Scanner(System.in);	
	
	System.out.print("월급을 입력하세요:");
	int money = a.nextInt();
	System.out.println("10년동안 최대 저축액은 "
			+money*12*10+"만 원 입니다."
			);
	
	a.close();	
	}
}
