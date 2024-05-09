package kr.or.ddit.study05.sec03;

import java.util.Scanner;

/**
 * @since 2024.04.23
 * @author 이건우 version 1.00(최초생성)
 *
 */
public class WeekExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WeekExample obj = new WeekExample();
		obj.process();

	}

	public void process() {
//		week(1);
		week(Week.SAT);
	}
	
	public void week(Week week) {
//		if(week==Week.SUN)System.out.println("일요일");
//		if(week==Week.MON)System.out.println("월요일");
//		if(week==Week.TUE)System.out.println("화요일");
//		if(week==Week.WED)System.out.println("수요일");
//		if(week==Week.THU)System.out.println("목요일");
//		if(week==Week.FRI)System.out.println("금요일");
//		if(week==Week.SAT)System.out.println("토요일");
		
		System.out.println(week.day);
	}

	public void week(int num) {
		switch (num) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;

		}
	}
}
