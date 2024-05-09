package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
		obj.process();

	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
	}
	public void method4() {
		System.out.println("숫자를 입력하시오.");
		int num=sc.nextInt();
		int result=0;
		while(num>0) {
			result+=num%10;
			num/=10;
		}
		System.out.println(result);
	}
	public void method3() {
		while(true) {
			System.out.println("1. 계속");
			System.out.println("2. 종료");
			int num=sc.nextInt();
			if(num==2) {
				break;
			}
		}
	}
	public void method2() {
		int i=1;
		while(i>1) {
			i++;
			
		}
	}
	public void method1() {
		int a=1;
		int sum=0;
		while(a<=63) {
			if(a%2!=0) {
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
