package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScanExample {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		System.out.println("3자리 문자를 입력하시오..");
		String word=sc.next();
		char ch1=word.charAt(0);
		char ch2=word.charAt(1);
		char ch3=word.charAt(2);
		System.out.println("1번째 문자: "+ch1);
		System.out.println("2번째 문자: "+ch2);
		System.out.println("3번째 문자: "+ch3);
		
	}
	
	
	public void method4() {
		System.out.println("달러를 입력하시오.");
		int dollar=sc.nextInt();
		double won= dollar*1350.13;
		int won1= (int)(won/10)*10;
		System.out.println(won1+"원입니다.");
		
	}
	
	
	public void method3() {
		System.out.println("두 숫자를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum= num1+num2;
		System.out.println(sum);
		
	}
	
	public void method2() {
		System.out.println("숫자를 입력하세요");
		String input=sc.next();
		int result= Integer.parseInt(input)+10;
		System.out.println(result);
		
	}
	
	public void method1(){
		System.out.print("문자를 입력하시오: ");
		String input=sc.next();
		System.out.println("입력한 결과 값: "+input);
	}
	
}