package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator cal=new Calculator();
		
		System.out.println("숫자입력");
		int a=sc.nextInt();
		System.out.println("연산자입력");
		String oper=sc.next();
		System.out.println("숫자입력");
		int b=sc.nextInt();
		double result=cal.cal(oper, a, b);
		
		System.out.println(a+oper+b+"="+result);
	}
}
