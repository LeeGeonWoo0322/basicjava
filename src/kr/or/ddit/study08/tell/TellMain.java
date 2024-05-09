package kr.or.ddit.study08.tell;

import java.util.Scanner;

public class TellMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TellMain obj = new TellMain();
		obj.process();

	}

	public void process() {
		System.out.println("전화상담의 분배방식 선택");
		System.out.println("R: RoundRobn ");
		System.out.println("L: LeastJob");
		System.out.println("P: priortallocation");
		String select=sc.next();
		Schedular sch=null;
		if(select.equalsIgnoreCase("R"))sch=new RoundRobn();
		else if(select.equalsIgnoreCase("L"))sch=new LeastJob();
		else if(select.equalsIgnoreCase("P"))sch=new PriorityAllocation();
		
		sch.getNextCall();
		sch.sendCallToAgent();
	}
}