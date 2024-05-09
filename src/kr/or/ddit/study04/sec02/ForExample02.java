package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
//		method6();
	}
	public void method6() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	public void method5() {
		for(int i=1;i<10;i++) {
			for(int j=i;j<i+3;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
	public void method4() {
		END:
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				System.out.println(i+", "+j);
				if(i==30&&j==30) {
					break END;
				}
			}
		}
	}
	public void method3() {
		
	}
	public void method2() {
		String text=sc.next();
		
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				System.out.print(ch);
			}
			else {
				continue;
			}
		}
	}
	
	public void method1() {
		for(int i=0;i<10;i++) {
			if(i%2==0) continue;
			System.out.println(i);
		}
	}
}
