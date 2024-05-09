package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageB extends Stage{
	Scanner sc = new Scanner(System.in);
	@Override
	public int game() {
		// TODO Auto-generated method stub
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
		
		
		if((com==1&&num==2)||(com==0&&num==1)||(com==2&&num==0)) {
			System.out.println("이겼습니다.");
			return gameMoney(1);
		}
		else{
			System.out.println("겼습니다.");
			return gameMoney(2);
		}
	}

	@Override
	public int gameMoney(int a) {
		// TODO Auto-generated method stub
		if(a==1)return 20000;
		else return 0;
	}

}
