package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();

	}

	public void process() {
//		method01();
		method02();
//		method03();
	}
	
	public void method04() {
		
	}
	
	public void method01() {
		
	}
	
	public void method02() {
		//관계연산자
		//
		
		System.out.println("점수를 입력하시오.");
		int num;
		while(true)
		{
			num=sc.nextInt();
			if(num<=100&&num>=0)
			{
				break;
			}
			else
			{
				System.out.println("점수를 다시 입력하시오.");
			}
		}
		
		
		if(num>=90)
		{
			System.out.println("A 학점");
		}
		else if(num>=80&&num<90) {
			System.out.println("B 학점");
		}
		else if(num>=70&&num<80) {
			System.out.println("B 학점");
		}
		else if(num>=60&&num<70) {
			System.out.println("B 학점");
		}
		else {
			System.out.println("F 학점");
		}
		
	}
	
public void method03() {
		//논리연산자
	//&&||!
	
	}
}
