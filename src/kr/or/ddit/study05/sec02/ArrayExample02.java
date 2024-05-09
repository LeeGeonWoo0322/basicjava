package kr.or.ddit.study05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
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
	public void method7() {
		//45짜리 temp 배열만들기
		int[] temp=new int[45];
		//1~45 넣기
		for(int i=0;i<45;i++) {
			temp[i]=i+1;
		}
		//배열섞기
		for(int i=0;i<10000;i++) {
			int ran = new Random().nextInt(temp.length);
			int tmp=temp[0];
			temp[0]=temp[ran];
			temp[ran]=tmp;
		}
		//6짜리 lotto 배열만들기
		int[] lotto=new int[6];
		//lotto 배열에 temp 0~5까지 값을 복사
		System.arraycopy(temp, 0, lotto, 0, 6);
		
		//lotto 배열 정렬하기
		for(int i=0;i<lotto.length-1;i++) {
			boolean flag=true;
			for(int j=0;j<lotto.length-1;j++) {
				if(lotto[j]>lotto[j+1]) {
					int tmp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=tmp;
					flag=false;
				}
			}
			if(flag)break;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	public void method6() {
		// 버블정렬
		int[] num = { 67, 55, 9, 86, 98 };
		for (int i = 0; i < num.length - 1; i++) {
			boolean flag=true;
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag=false;
				}
			}
			if(flag) break;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void method5() {
		// 버블정렬
		int[] num = { 67, 55, 9, 86, 98 };
		for (int i = 0; i < num.length - 1; i++) {

			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void method4() {
		// clone()
		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = source.clone();

		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		System.out.println();
		target[2] = 10;
		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();

	}

	public void method3() {
		// System.arraycopy
		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = new int[source.length];

		System.arraycopy(source, 0, target, 0, source.length);
		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		target[2] = 10;
		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();

	}

	public void method2() {
		// 깊은 복사
		// 1.반복문 이용
		// 2. System.arraycopy()
		// 3. clone();
		// 배열 공간을 별도로 확보
		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		target[2] = 10;
		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
	}

	public void method1() {
		// 얕은 복사(swallow copy)
		// 복사된 배열이나 원본배열이 변경될때 서로간의 값이 같이 변경

		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = source;

		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		target[2] = 10;
		System.out.println("원본배열");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + "\t");
		}
		System.out.println();
		System.out.println("복사배열");
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
	}
}
