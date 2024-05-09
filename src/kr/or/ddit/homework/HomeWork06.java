package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		
	}
	
	public void method1() {
		int num;
		while(true) {
			num=sc.nextInt();
			if(num>0&&num<10) {
				break;
			}
		}
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public void method2() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	public void method3() {
		int num=sc.nextInt();
		for(int j=1;j<10;j++) {
			for(int i=1;i<10;i++) {
				if(i==num) {
					continue;
				}
				System.out.print(i+" * "+j+" = "+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	public void method4() {
		int n=(int)(Math.random()*100+1);
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(n%2!=0&&i%2!=0) {
				sum+=i;
			}
			else if(n%2==0&&i%2==0) {
				sum+=i*i;
			}
		}
		System.out.println("난수: "+n+"계산값: "+sum);
	}
}
