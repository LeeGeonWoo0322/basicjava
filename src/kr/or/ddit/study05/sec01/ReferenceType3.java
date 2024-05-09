package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType3 obj = new ReferenceType3();
		obj.process();

	}

	public void process() {
		method1();
	}
	public void method1() {
		int a=10;
		//1
		{
			int b=12;
			int[] c;
			//2
			
			c= new int[] {1,2,3};
			//3
		}
		//4
		String d="test";
		//5
		{
			String[] e=new String[3];
			//6
			e[0]=d;
			//7
			String f="test2";
			//8
			e[1]=f;
			//9
			e[2]="test";
			//10
		}
	}
}
