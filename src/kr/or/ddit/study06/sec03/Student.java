package kr.or.ddit.study06.sec03;

public class Student {
	String nation;
	String roomNo;
	String name;
	int age;
	
	public Student(String name, int age) {
//		this.name=name;
//		this.age=age;
//		nation="한국";
//		roomNo="306호";
		this("306호",name,age);
		System.out.println("파라미터 2개 생성자");

		
	}
	public Student(String roomNo,String name, int age) {
//		this.name=name;
//		this.age=age;
//		this.roomNo=roomNo;
//		nation="한국";
		this("한국",roomNo,name,age);
		System.out.println("파라미터 3개 생성자");
	}
	public Student(String nation,String roomNo,String name, int age) {
		this.name=name;
		this.age=age;
		this.roomNo=roomNo;
		this.nation=nation;
		System.out.println("파라미터 4개 생성자");

	}

	@Override
	public String toString() {
		return "Student [nation=" + nation + ", roomNo=" + roomNo + ", name=" + name + ", age=" + age + "]";
	}
	
}
