package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork20 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
	}

	Map<String, Student2> data = new HashMap();
	// 로그인 안된상태
	String loginId = null;

	public void process() {
		int count=0;
		while (true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정 ");
			System.out.println("4. 내 정보 출력");
			System.out.println("5. 로그인 ");
			System.out.println("6. 로그아웃 ");

			int sel = sc.nextInt();
			if(sel>1&&sel<=6&&count==0) {
				System.out.println("회원이 아무도 없습니다.");
				continue;
			}
			if (sel == 1) {
				insert();
				count++;
			} else if (sel == 2) {
				delete();
				count--;
			} else if (sel == 3) {
				update();
			} else if (sel == 4) {
				print();
			} else if (sel == 5) {
				login();
			} else if (sel == 6) {
				logout();
			} else
				System.out.println("숫자 제대로 입력");

		}
	}

	public void insert() {
		// id 중복 체크
		Student2 std = new Student2();
		while (true) {
			System.out.println("아이디 입력: ");
			std.id = sc.next();
			if (data.containsKey(std.id))
				System.out.println("이미존재하는 아이디");
			else
				break;
		}
		System.out.println("pw 입력: ");
		std.pass = sc.next();
		System.out.println("이름 입력: ");
		std.name = sc.next();
		data.put(std.id, std);
		System.out.println("회원가입 완료");
	}

	public void delete() {
		// 로그인 후 id pass 같을 경우 회원 탈퇴
		if(loginId==null) {
			login();
		}
		data.remove(loginId);
		System.out.println("삭제했습니다.");
		logout();
	}

	public void update() {
		// 로그인 후 id pass 같을 경우 수정
		Student2 std = new Student2();
		if(loginId==null) {
			login();
		}
		print();
		System.out.println("바꿀 아이디 입력: ");
		std.id = sc.next();
		System.out.println("바꿀 pw 입력: ");
		std. pass = sc.next();
		System.out.println("바꿀 이름 입력: ");
		std. name = sc.next();
		data.remove(loginId);
		data.put(std.id, std);
		loginId=std.id;
		print();
	}

	public void print() {
		// 본인 정보 출력
		if(loginId==null) {
			login();
		}
		Student2 std = data.get(loginId);
        System.out.println("회원ID: " + std.id);
        System.out.println("회원PW: " + std.pass);
        System.out.println("회원이름: " + std.name);
	}

	public void login() {
		// 로그인
		while (true) {

			System.out.println("아이디 입력: ");
			String id = sc.next();
			System.out.println("pw 입력: ");
			String pass = sc.next();

			Student2 std = data.get(id);
            if (std != null && id.equals(std.id) && pass.equals(std.pass)) {
                System.out.println("로그인 성공");
                loginId = id;
                break;
            } else {
                System.out.println("정보가 일치하지 않습니다.");
            }
		}
	}

	public void logout() {
		// 로그 아웃
		loginId = null;
	}
}

class Student2 {
	String id;
	String pass;
	String name;

}