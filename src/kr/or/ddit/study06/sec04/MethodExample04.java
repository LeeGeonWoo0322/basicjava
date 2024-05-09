package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample04 obj = new MethodExample04();
		obj.process();

	}

	public void process() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		add(a,b);
		System.out.println(add(a,b));
		sub(a,b);
		mul(a,b);
		div(a,b);
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
	public int div(int a,int b) {
		return a/b;
	}
}
