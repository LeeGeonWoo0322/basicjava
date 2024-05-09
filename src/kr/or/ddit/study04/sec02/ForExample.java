package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
		method12();
	}
	public void method12() {
		int a,b;
		a=3;
		b=2;
		double c=1.0*a/b;
		System.out.println(c);
	}
	public void method11() {
		String word=sc.next();
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch>=0&&ch<10) {
			}else {
				System.out.println(ch);
			}
		}
	}
	
	public void method10() {
		String word=sc.next();
		String result="";
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u') {
				result+=word.charAt(i);
			}
		}
		System.out.println(result);
	}
	
	public void method9() {
		String word=sc.next();
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
	}
	
	public void method8() {
		String word=sc.next();
		for(int i=0;i<word.length();i++) {
			System.out.println(word.charAt(i));
		}
	}
	public void method7() {
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method6() {
		String s=sc.next();
		char c=s.charAt(0);
		
		for(char i=c;i<='z';i++) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		for(int i='a';i<='z';i++) {
			System.out.println((char)i);
		}
	}
	
	
	public void method3() {
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=(2*i)-1;
		}
		System.out.println(sum);
	}
	
	public void method2() {
		int sum=0;
		for(int i=5;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method1() {
		
	}
}
