package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample03 obj = new MethodExample03();
		obj.process();

	}

	public void process() {
//		System.out.println("메소드1호출");
//		method1();
//		System.out.println("메소드2호출");
//		int a=method2();
//		System.out.println("메소드2에서 받은 리턴값: "+a);
//		System.out.println("메소드3호출");
//		String s=method3();
//		System.out.println("메소드3에서 받은 리턴값: "+s);
//		int b=5;
//		method4(b);
//		System.out.println(b);
		String ss="asdasdasd";
		method5(ss);
		System.out.println(ss);
	}
	public void method1() {
		System.out.println("void는 리턴값X");
	}
	public int method2() {
		System.out.println("숫자입력");
		return sc.nextInt();
	}
	public String method3() {
		System.out.println("문자입력");
		return sc.next();
	}
	public void method4(int b) {
		b=10;
	}
	public void method5(String ss) {
		ss="qweqweqwe";
	}
}