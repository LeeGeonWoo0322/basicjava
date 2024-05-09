package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	
	public static void main(String[] args) {
		/*
		 *  예약 시스템.
		 */
		Scanner sc=new Scanner(System.in);
		Reserve res=Reserve.getInstance();
		while(true) {
			System.out.println("1.예약");
			System.out.println("2.처리");
			System.out.println("3.종료");
			int sel=sc.nextInt();
			if(sel==1) {
				System.out.println("예약자 이름 쓰세요");
				String name=sc.next();
				res.reservation(name);
			}
			else if(sel==2) {
				res.complete();
			}
			else if(sel==3)break;
			else {
				System.out.println("다시입력");
			}
		}
		
	}
}
class Reserve{
	private String  name;
	
	// 싱글톤 적용하기
	private static Reserve instance;

	private Reserve() {
		
	}

	public static Reserve getInstance() {
		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
	
	/*
	 *  예약하는 메소드 만들기 
	 *  이미 예약되어있다면 "예약이 되어있습니다." 출력  
	 *  아니면 예약에 name ="예약 할사람 이름", 
	 *            reserve = true;
	 */
	
	public void reservation(String name) {
		if(this.name==null) {
			this.name=name;
			System.out.println("예약성공");
		}
		else {
			System.out.println("예약이 꽉찼습니다.");
		}
	}
	
	
	/*
	 * 예약 처리 하는 메소드 만들기.
	 * name = null; 
	 * resever = false; 
	 * 
	 * "예약된 사람 이름" 님 처리 완료되었습니다.
	 */
	public void complete() {
		name=null;
		System.out.println("처리완료");
	}
	
}
