package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();

	}

	public void process() {
		/*
		 * 0 가위
		 * 1 바위
		 * 2 보
		 * 
		 * 컴퓨터 랜덤
		 * 나 입력
		 * 승패 출력
		 * 
		 * 컴퓨터: 뭐, 사람: 뭐, 결과: 뭐
		 */
		Random random=new Random();
		int com=random.nextInt(3);
		String com2="", num2="";
		System.out.print("0(가위),1(바위),2(보)중 하나를 입력하세요: ");
		int num=sc.nextInt();
		if(com==0) {
			com2="가위";
		}
		else if(com==1) {
			com2="바위";
		}
		else if(com==2) {
			com2="보";
		}
		
		if(num==0) {
			num2="가위";
		}
		else if(num==1) {
			num2="바위";
		}
		else if(num==2) {
			num2="보";
		}
		System.out.print("컴퓨터: "+com2+", 사람: "+num2+", 결과: ");
		
		if(com==num)
		{
			System.out.println("비겼습니다.");
		}
		else if((com==1&&num==2)||(com==0&&num==1)||(com==2&&num==0)) {
			System.out.println("이겼습니다.");
		}
		else if((num==1&&com==2)||(num==0&&com==1)||(num==2&&com==0)) {
			System.out.println("겼습니다.");
		}
		
	}
}
