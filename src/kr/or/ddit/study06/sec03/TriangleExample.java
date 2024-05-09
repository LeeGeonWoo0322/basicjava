package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
		Point p1=new Point(0,0);
		Point p2=new Point(10,8);
		Point p3=new Point(2,4);
		
		Triangle t1=new Triangle(p1,p2,p3);
//		Triangle t1=new Triangle(new Point(0,0),Point(10,8),new Point(2,4));
		
		Triangle t2=new Triangle(10,10,20,30,5,15);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.area);
		System.out.println(t2.area);
		
	}
}
