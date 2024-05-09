package kr.or.ddit.study11;

import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	public void method1() {
		String test="abcd";
		test=test.toUpperCase();
		System.out.println(test);
		test=test.toLowerCase();
		System.out.println(test);
	}
	public void method2() {
		String test="a, b, c";
		String[] tokens=test.split(",");
		for(String token:tokens) {
			token=token.trim();
			System.out.println(token);
		}
		
	}
	public void method3() {
		String test="   a b c";
		System.out.println(test);
		test=test.trim();
		System.out.println(test);
		
	}
	public void method4() {
		String str="qwe바보";
		str=str.substring(0,1);
		System.out.println(str);
		str=str.replace("바보", "**");
		
	}
	public void method5() {
		String str="book.csv";
		if(str.startsWith("book1")) {
			System.out.println("book으로 시작");
		}
		if(str.endsWith(".csv")) {
			System.out.println(".csv로 끝납니다");
		}
		
	}
	public void method6() {
		String test="문자열 test입니다.";
		if(test.contains("test")) {
			System.out.println("test포함");
		}
		
	}
	public void method7() {
		String str=null;
		if(str==null||str.isEmpty()) {
			System.out.println("빈문자열");
		}
		
		
	}
	public void method8() {
		System.out.println("계속할꺼?");
		String yn=sc.next();
		if(yn.equalsIgnoreCase("y")) {
			System.out.println("계속");
		}
		else if(yn.equals("n")) {
			System.out.println("종료");
		}
	}
}
