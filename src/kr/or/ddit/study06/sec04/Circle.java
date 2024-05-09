package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Circle {
	final double PI=Math.PI;
	//반지름을 바라미터로 받고 원의 넓이를 구하시오
	//넓이 3.14*r*r
	//메소드명 area
	
	//반지름을 바라미터로 받고 원의 둘레를 구하시오
		//넓이 3.14*r*2
		//메소드명 circumference
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.process();

	}

	public void process() {
		int r=sc.nextInt();
		System.out.println("원의 넓이: "+area(r));
		System.out.println("원의 둘레: "+circumference(r));
	}
	public double area(int r) {
		return PI*r*r;
	}
	public double circumference(int r) {
		return 2*PI*r;
	}
}
