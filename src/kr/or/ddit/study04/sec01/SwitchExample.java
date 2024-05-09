package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
		obj.process();

	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
//		method5();
	}
	
	public void method5() {
		
	}
	
	public void method3() {
		System.out.println("약자 입력: ");
		String str=sc.next();
		switch (str) {
		case "KOR":
			System.out.println("한국");
			break;
		case "ENG":
			System.out.println("영국");
			break;
		case "CHN":
			System.out.println("중국");
			break;
		default:
			break;
		}	
	}
	
	public void method2() {
		int m=sc.nextInt();
		
			
	}
	public void method1() {
		int select=2;
		switch(select) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		}
	}
}