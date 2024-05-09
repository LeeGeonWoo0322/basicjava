package kr.or.ddit.study05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
		
	}
	public void method1() {
		int a1=100;
		int a2=89;
		int a3=77;
		int a4=94;
		int a5=62;
		
		int sum=a1+a2+a3+a4+a5;
	}

	public void method2() {
		//
		int[] student=new int[5];
		student[0]=100;
		student[1]=89;
		student[2]=77;
		student[3]=94;
		student[4]=62;
		int sum=0;
		for(int i=0;i<student.length;i++) {
			sum+=student[i];
		}
		
	}

	public void method3() {
		int[] array=new int[3];
		array[0]=3;
		array[1]=6;
		array[2]=9;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

	public void method4() {
		int[] a= {1,2,3,4,5};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[a.length-1-i]);
		}
	}

	public void method5() {
		int a=10;
		int b=7;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+", b= "+b);
	}
	public void method6() {
		int[] score= {80,90,87,94,60};
		int max=score[0];
		int min=score[0];
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}
		}
		System.out.println("최댓값: "+max);
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("최솟값: "+min);
		
	}
	public void method7() {
		int money=sc.nextInt();
		int[] coin= {10000,5000,1000,500,100,50,10};
		for(int i=0;i<coin.length;i++) {
			int result=money/coin[i];
			money=money%coin[i];
			if(result!=0) {				
				System.out.print(coin[i]+"원  "+result+"개 ");
			}
		}
		System.out.println();
	}
}
