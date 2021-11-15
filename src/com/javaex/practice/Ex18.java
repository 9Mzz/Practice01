package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("화씨: ");
		double far = sc.nextDouble();
		System.out.println("화씨 "+far+" 의 섭씨온도는 "
				+(far-32)*5/9 + "입니다."
				);
		System.out.print("섭씨: ");
		double car = sc.nextDouble();
		System.out.println("섭씨 "+car+" 의 화씨온도는"
				+((car*9/5)+32)+ "입니다."
				);



		sc.close();
	}
}
