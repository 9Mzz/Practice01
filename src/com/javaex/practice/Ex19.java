package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("몇 년: ");
	long year = sc.nextLong();
	System.out.println("빛이 "+year+"년 동안 가는 거리는 "+
			year*6*60*24*365*300000+"km 입니다."
			);
	
	sc.close();	
	}
}
