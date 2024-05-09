package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.process();

	}

	public void process() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
	}
	public double cal(String oper,int a,int b) {
		if(oper.equals("+")) return add(a,b);
		if(oper.equals("-")) return sub(a,b);
		if(oper.equals("*")) return mul(a,b);
		if(oper.equals("/")) return div(a,b);
		System.out.println("지원안됨");
		return 0;
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public double div(int a,int b) {
		return (double)a/b;
	}
}
