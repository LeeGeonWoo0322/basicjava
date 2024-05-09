package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.process();

	}

	public void process() {
		method01();
//		method02();
//		method03();
//		method04();
//		method05();
	}
	
	public void method01() {
		String str =true?"참":"거짓";
		System.out.println(str);
		
		int age=sc.nextInt();
		
		String adult=age>=18?"성년":"미성년";
		System.out.println(adult);
		
		System.out.println("숫자를 입력하세요: ");
		int a=sc.nextInt();
		System.out.println("숫자를 입력하세요: ");
		int b=sc.nextInt();
		
		int result=a%2==0?a+b:a*b;
		System.out.println(result);
	}
}
