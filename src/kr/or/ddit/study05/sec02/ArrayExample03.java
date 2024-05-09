package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	public void method5() {
		int[] arr= {1,4,3,2,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void method4() {
		String[] strList= {"a","b","c"};
		for(String s:strList) {
			System.out.println(s);
		}
	}
	public void method3() {
		int[][] arr=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[4];
		arr[2]=new int[5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	public void method2() {
		int[][] score= {{80,75,87},
				{88,90,91},
				{77,73,65}};
		int hong_kor=score[0][0];
		int kang_math=score[1][1];
		int lee_eng=score[2][2];
		int hong_sum=0;
		int kor_sum=0;
		for(int i=0;i<score[0].length;i++) {
			hong_sum+=score[0][i];
		}
		for(int j=0;j<score.length;j++) {
			kor_sum+=score[j][0];
		}
		System.out.println(hong_sum);
		System.out.println(kor_sum);
	}
	public void method1() {
		int[][] arr=new int[3][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int[] temp=arr[i];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
