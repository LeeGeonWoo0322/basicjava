package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	static Scanner sc = new Scanner(System.in);
	Mem[] memList = new Mem[100];
	int cur =0;
	public static void main(String[] args) {
		HomeWork14 h14 = new HomeWork14();
		while(true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			int sel = sc.nextInt();
			if(sel==1) {
				h14.addMember();
			}
			if(sel==2) {
				h14.delMember();
			}
			if(sel==3) {
				h14.updateMember();
			}
			if(sel==4) {
				h14.printMemberList();
			}
		}
	}
	
	public void addMember() {
		Mem mem=new Mem();
		System.out.println("회원id: ");
		String id=sc.next();
		mem.setId(id);
		System.out.println("회원pw: ");
		String pass=sc.next();
		mem.setPass(pass);
		System.out.println("회원이름: ");
		String name=sc.next();
		mem.setName(name);
		System.out.println("회원나이: ");
		int age=sc.nextInt();
		mem.setAge(age);
		memList[cur]=mem;
		cur++;
	}
	
	public void delMember() {
		System.out.print("삭제할 회원 번호 입력.");
		int num = sc.nextInt();
		
		for(int i=num-1;i<cur-1;i++) {
			memList[i] = memList[i+1];
		}
		memList[cur-1] = null;
		cur--;
	}
	
	
	/*
	 *   회원 전체 정보 출력하기.
	 */
	public void printMemberList() {
		for (int i=0; i<cur; i++) {
			Mem mem = memList[i];
			//getter 로 출력
			System.out.println(i+1+"번째 회원");
			System.out.println("회원id: "+mem.getId());
			System.out.println("회원pw: "+mem.getPass());
			System.out.println("회원이름: "+mem.getName());
			System.out.println("회원나이: "+mem.getAge());
		}
	}
	
	/*
	 *   회원 정보 수정하기.
	 */
	
	public void updateMember() {
		/*
		 *  회원 전체 정보 출력하기.
		 */
		printMemberList();
		
		System.out.print("수정할 회원 번호 입력.");
		int num = sc.nextInt();
		Mem mem = memList[num-1];
		
		/*
		 *  정보 수정.
		 */
		System.out.println("바꿀회원id: ");
		String id=sc.next();
		mem.setId(id);
		System.out.println("바꿀회원pw: ");
		String pass=sc.next();
		mem.setPass(pass);
		System.out.println("바꿀회원이름: ");
		String name=sc.next();
		mem.setName(name);
		System.out.println("바꿀회원나이: ");
		int age=sc.nextInt();
		mem.setAge(age);
		
		
	}
	
}
class Mem{
	private String id;
	private String pass;
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	/* 
	 * 생성자 사용x
	 * getter setter 이용할것.  
	 */
	
	
	
}
