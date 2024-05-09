package kr.or.ddit.homework;

import java.util.Scanner;

public class homeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homeWork02 obj = new homeWork02();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
//		obj.mehtod4();
		obj.mehtod5();
	}

	public void method1() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 버림 ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.next();
		double num1 = (Double.parseDouble(str)) * 100;
		double num2 = ((int) num1) / 100.0;
		System.out.println("결과값: " + num2);
	}

	public void mehtod2() {
		/*
		 * 스캐너를 통해서 대문자를 입력 받고 소문자로 변환 ex) A-> a
		 */
		// 32
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.next();
		char ch = s.charAt(0);

		ch = (char) (ch + 32);
		System.out.println(ch);
	}

	public void mehtod3() {
		/*
		 * 스캐너를 통해서 소문자를 입력 받고 대문자로 변환 ex) f-> F
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.next();
		char ch = s.charAt(0);

		ch = (char) (ch - 32);
		System.out.println(ch);
	}

	public void mehtod4() {
		/*
		 * 스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오 ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.next();
		char ch1 = s.charAt(0);
		char ch2 = s.charAt(1);
		char ch3 = s.charAt(2);

		int a = ch1-'0';
		int b = ch2-'0';
		int c = ch3-'0';
		int sum = a + b + c;
		System.out.println("세가지 숫자의 합: " + sum);
	}

	public void mehtod5() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 반올림 ex ) 12.2623 - > 12.3
		 */
//		double num= 12.4;
//		int numInt=(int)num;
//		int numRound=numInt+(int)((num-numInt)*2);
//		System.out.println(numRound);
		
		System.out.println("실수를 입력하시오.");
		String num = sc.next();
		double num1=Double.parseDouble(num);
		double num2=num1*100;
		int num3=(int)num2+5;
		double result=num3/100.0;
		int num4=(int)(result*10);
		double result2=num4/10.0;
		System.out.println("반올림한값: "+result2);
		
	}

}