package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6() {
		int num=sc.nextInt();
		String grade;
		if(num>=90)
		{
			grade="A";
		}
		else if(num>=80) {
			grade="B";
		}
		else if(num>=70) {
			grade="C";
		}
		else if(num>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		if(grade=="F") {
			grade=grade;
		}
		else if(num%10>=0&&num%10<3) {
			grade=grade+"-";
		}
		else if(num%10<6) {
			grade=grade+"0";
		}
		else {
			grade=grade+"+1";
		}
		System.out.println(grade);
	}
	
	
	public void method5() {
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		if(num2>100) {
			num2/=100;
		}
		double num=num1/(num2*num2);
		if(num>=30.0)
		{
			System.out.println("고도비만");
		}
		else if(num>=25.0) {
			System.out.println("비만");
		}
		else if(num>=23) {
			System.out.println("과체중");
		}
		else if(num>=18.5) {
			System.out.println("정상");
		}
		else {
			System.out.println("저체중");
		}
	}
	
	public void method4() {
		int num=sc.nextInt();
		if(num>=3&&num<=5)
		{
			System.out.println("봄");
		}
		else if(num>=6&&num<=8) {
			System.out.println("여름");
		}
		else if(num>=9&&num<=11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
	}
	
	public void method3() {
		int num=sc.nextInt();
		if(num>=90)
		{
			System.out.println("A");
		}
		else if(num>=80) {
			System.out.println("B");
		}
		else if(num>=70) {
			System.out.println("C");
		}
		else if(num>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	public void method2() {
		int num=sc.nextInt();
		if(num>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
