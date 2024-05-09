package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListExample02 obj = new ArrayListExample02();
		obj.process();
	}
	public void process() {
//		method1();
//		method2();
		method3();
	}
	public void method3() {
		List<Member> memberList=new ArrayList();
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.회원삭제");
			System.out.println("3.회원정보수정");
			System.out.println("4.전체출력");
			
			int sel=sc.nextInt();
			if(sel==1) {
				Member member=new Member();
				System.out.println("ID: ");
				String id=sc.next();
				
				System.out.println("Name: ");
				String name=sc.next();
				
				member.setId(id);
				member.setName(name);
				memberList.add(member);
			}
			else if(sel==2) {
				
				for(int i=0;i<memberList.size();i++) {
					Member member=memberList.get(i);
					System.out.println(i+", "+member.getId()+", "+member.getName());
				}
				System.out.println("삭제할 회원 번호");
				int index=sc.nextInt();
				Member member=memberList.remove(index);
				System.out.println(member.getName()+"님이 탈퇴하였습니다.");
			}
		}
	}
	public void method2() {
		List<String> list=new ArrayList();

		while(true) {
			String word=sc.next();
			if(word.equals("end"))break;
			list.add(word);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
	public void method1() {
		System.out.println("숫자 입력하시오");
		int num=sc.nextInt();
	
		List list=new ArrayList();
	
		for(int i=1;i<=num;i++) {
			if(num%i==0)list.add(i);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
