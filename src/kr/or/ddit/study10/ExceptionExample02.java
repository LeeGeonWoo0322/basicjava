package kr.or.ddit.study10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample02 {

	public static void main(String[] args) {
		ExceptionExample02 obj = new ExceptionExample02();
		obj.process();

	}

	public void process() {
		int sel=0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			try {
				sel=sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력");
			}catch (Exception e) {
				System.out.println("오류");
			}
		}
		System.out.println(sel);
		
	}

}
