package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		obj.process();

	}

	public void process() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	public void div(int a,int b) {
		System.out.println(a/b);
	}
}
