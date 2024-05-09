package kr.or.ddit.study06.sec06;

public class Person {
	private String name;
	private int age;
	
	
	
	
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
		if(age<0|| age>122) {
			System.out.println("오류");
		}
		else {
			this.age=age;
		}
	}
	
	
	
	
}
