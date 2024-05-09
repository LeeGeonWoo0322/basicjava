package kr.or.ddit.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	public void process() {
		while (true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			try {
				Scanner sc = new Scanner(System.in);
				int sel = sc.nextInt();
				if (sel == 1) {
					addMember();
				}
				else if (sel == 2) {
					removeMember();
				}
				else if (sel == 3) {
					updateMember();
				}
				else if (sel == 4) {
					printMemberList();
				}
				else System.out.println("숫자를 벗어남");
			} catch (Exception e) {
				System.out.println("숫자입력해라");
			}
			
		}
	}

	int cur = 0;
	Member[] memList = new Member[100];

	public void addMember() {
		System.out.print("회원 ID (4~8자): ");
		String id;
		while (true) {
			id = sc.next();
			try {
				idCheck(id);
				break;
			} catch (Exception e) {
				System.out.println("ID 길이는 4~8자여야 합니다.");
			}
		}

		System.out.print("회원 PW (4~8자): ");
		String pass;
		while (true) {
			pass = sc.next();
			try {
				passCheck(pass);
				break;
			} catch (Exception e) {
				System.out.println("패스워드 길이는 4~8자여야 합니다.");
			}
		}

		System.out.print("회원 이름 (2~5자): ");
		String name;
		while (true) {
			name = sc.next();
			try {
				nameCheck(name);
				break;
			} catch (Exception e) {
				System.out.println("이름 길이는 2~5자여야 합니다.");
			}
		}

		System.out.print("회원 별명 (2~8자, 금지어 제외): ");
		String nickName;
		while (true) {
			nickName = sc.next();
			try {
				nickNameCheck(nickName);
				break;
			} catch (Exception e) {
				System.out.println("별명 길이는 2~8자여야 하며, 금지어를 포함하면 안 됩니다.");
			}
		}

		System.out.print("회원 나이: ");
		int age;
       
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				age = sc.nextInt();
				ageCheck(age);
				break;
			} catch (InputMismatchException e) {
				System.out.println("나이는 숫자여야 합니다.");
			} catch (Exception e) {

				System.out.println("나이는 1세 이상이어야 합니다.");
			}
		}
		Member newMember = new Member();
	    newMember.setId(id);
	    newMember.setPass(pass);
	    newMember.setName(name);
	    newMember.setNickName(nickName);
	    newMember.setAge(age);
	    memList[cur++] = newMember;
	}

	public void idCheck(String id) throws Exception {
		if (id.length() < 4 || id.length() > 8) {
			throw new Exception();
		}
	}

	public void passCheck(String pass) throws Exception {
		if (pass.length() < 4 || pass.length() > 8) {
			throw new Exception();
		}
	}

	public void nameCheck(String name) throws Exception {
		if (name.length() < 2 || name.length() > 5) {
			throw new Exception();
		}
	}

	public void nickNameCheck(String nickName) throws Exception {
		if (nickName.length() < 2 || nickName.length() > 8) {
			throw new Exception();
		} else if (nickName.contains("fuck")) {
			throw new Exception();
		}
	}

	public void ageCheck(int age) throws Exception {
		if (age <= 0) {
			throw new Exception();
		}
	}

	public void removeMember() {
		System.out.print("삭제할 회원 번호 입력.");
		int num = sc.nextInt();

		for (int i = num - 1; i < cur - 1; i++) {
			memList[i] = memList[i + 1];
		}
		memList[cur - 1] = null;
		cur--;
	}

	public void updateMember() {
		printMemberList();

		System.out.print("수정할 회원 번호 입력.");
		int num = sc.nextInt();
		Member mem = memList[num - 1];
		System.out.print("바꿀회원 ID (4~8자): ");
		String id;
		while (true) {
			id = sc.next();
			try {
				idCheck(id);
				break;
			} catch (Exception e) {
				System.out.println("ID 길이는 4~8자여야 합니다.");
			}
		}

		System.out.print("바꿀회원 PW (4~8자): ");
		String pass;
		while (true) {
			pass = sc.next();
			try {
				passCheck(pass);
				break;
			} catch (Exception e) {
				System.out.println("패스워드 길이는 4~8자여야 합니다.");
			}
		}

		System.out.print("바꿀회원 이름 (2~5자): ");
		String name;
		while (true) {
			name = sc.next();
			try {
				nameCheck(name);
				break;
			} catch (Exception e) {
				System.out.println("이름 길이는 2~5자여야 합니다.");
			}
		}

		System.out.print("바꿀회원 별명 (2~8자, 금지어 제외): ");
		String nickName;
		while (true) {
			nickName = sc.next();
			try {
				nickNameCheck(nickName);
				break;
			} catch (Exception e) {
				System.out.println("별명 길이는 2~8자여야 하며, 금지어를 포함하면 안 됩니다.");
			}
		}

		System.out.print("바꿀회원 나이: ");
		int age;
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				age = sc.nextInt();
				ageCheck(age);
				break;
			} catch (InputMismatchException e) {

				System.out.println("나이는 숫자여야 합니다.");
			} catch (Exception e) {

				System.out.println("나이는 1세 이상이어야 합니다.");
			}
		}
		
		mem.setId(id);
		mem.setPass(pass);
		mem.setName(name);
		mem.setAge(age);
		memList[num - 1] = mem;
	}

	public void printMemberList() {
		for (int i = 0; i < cur; i++) {
			Member mem = memList[i];
			System.out.println(i + 1 + "번째 회원");
			System.out.println("회원id: " + mem.getId());
			System.out.println("회원pw: " + mem.getPass());
			System.out.println("회원이름: " + mem.getName());
			System.out.println("회원별명: " + mem.getNickName());
			System.out.println("회원나이: " + mem.getAge());
		}
	}

}

class Member {
	private String id;
	private String pass;
	private String name;
	private String nickName;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
