package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class StageA extends Stage{
	Scanner sc = new Scanner(System.in);

	@Override
	public int game() {
		// TODO Auto-generated method stub
		Random random=new Random();
		int com=random.nextInt(2);
		System.out.print("0(짝),1(홀)중 하나를 입력하세요: ");
		int num=sc.nextInt();
		if(com==num) {
			System.out.println("이겼습니다");
			return gameMoney(1);
		}
		else {
			System.out.println("졌습니다");
			return gameMoney(2);
		}
	}

	@Override
	public int gameMoney(int a) {
		// TODO Auto-generated method stub
		if(a==1)return 4000;
		else return 0;
	}

}
