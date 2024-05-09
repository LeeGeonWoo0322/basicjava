package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
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
		method11();
	}

	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		int row = sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		int row = sc.nextInt(); 
		
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
		}
		
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(2*row)-(2*i+1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		int row = sc.nextInt();
		for(int i=0;i<row;i++) {
			if(i==0||i==row-1) {
				System.out.println("******");
			}
			else
			{
				System.out.println("*    *");
			}
		}
		
	}
	
	public void method8() {
		// 1  2  3  4  5
		// 6  7  8  9  10 
		// 11 12 13 14 15
		// 16 17 18 19 20 
		// 21 22 23 24 25 
		// 출력하기 
		int num=0;
		int row = sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<5;j++) {
				num++;
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}

	
	public void method9() {
		// 1  6  11 16 21
		// 2  7  . 
		// 3 
		// 4 
		// 5  10       25
		// 출력하기 
		int num=0;
		int row = sc.nextInt();
		for(int i=1;i<row+1;i++) {
			num=i;
			for(int j=0;j<5;j++) {
				System.out.print(num+"\t");
				num+=5;
			}
			System.out.println();
		}
		
	}
	
	public void method10() {
		// 1  10 11  20 21
		// 2  9. 12
		// 3  8  13
		// 4  7  14
		// 5  6  15  17 25
		// 출력하기 
		//h+1+w*5
		//W*5-h+5
		int num=0;
		int row = sc.nextInt();
		for(int i=1;i<row+1;i++) {
			num=i;
			for(int j=0;j<5;j++) {
				System.out.print(num+"\t");
				if(j%2!=0) {
					num+=(2*i-1);
				}
				else {
					num+=10-(2*i-1);
				}
			}
			System.out.println();
		}
		
	}
	
	public void method11() {
		// 1  2  3  4  5
//         10          6
		// 11          15  
		// 20          16
		// 21          25 
		// 출력하기 
		
		int num=0;
		int row = sc.nextInt();
		for(int i=1;i<row+1;i++) {
			if(i%2!=0) {
				for(int j=0;j<5;j++) {
					num++;
					System.out.print(num+"\t");
				}
			}
			else {
				num+=5;
				for(int j=0;j<5;j++) {
					System.out.print(num+"\t");
					num--;
				}
				num+=5;
			}
			System.out.println();
		}
	}
	
	public void method12() {
		// 1  10 11  20 21
		// 2  9. 12
		// 3  8  13
		// 4  7  14
		// 5  6  15  17 25
		// 출력하기 
		//h+1+w*5
		//W*5-h+5
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j%2==0) {
					System.out.print(i+1);
				}
				else {
					
				}
			}
		}
		
	}
	
}