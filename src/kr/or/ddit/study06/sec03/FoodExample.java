package kr.or.ddit.study06.sec03;

public class FoodExample {
	public static void main(String[] args) {
		Food f1=new Food();
		Food f2=new Food(2023,"파스타",10000);
		f1.name="pizza";
		f1.price=12000;
		f1.manuYear=2022;
		f1.lastYear=f1.manuYear+3;
		
		System.out.println(f1);
		System.out.println(f2);
		
	}
}
