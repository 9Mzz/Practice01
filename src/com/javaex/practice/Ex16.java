package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		int price1 = sc.nextInt();
		System.out.print("받은 돈: ");
		int money1 = sc.nextInt();
		
		double price = (double)price1;
		double money = (double)money1;
		
		System.out.println("=========================");
		System.out.println("받은 돈: " + price);
		System.out.println("상품 가격: " + money);
		System.out.println("부가세: " + money/10);
		System.out.println("잔액: " + (money-price));
		
		
		sc.close();	
	}
}
