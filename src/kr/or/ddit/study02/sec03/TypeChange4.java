package kr.or.ddit.study02.sec03;

public class TypeChange4 {
	public static void main(String[] args) {
		//math.random()
		//0.0~0.9xxx 난수 반환
		
		double ran=Math.random()*10;
		System.out.println(ran);
		
		int ran2=(int)ran+1;
		System.out.println(ran2);
		
		int ran3=(int)(Math.random()*10)+21;
		System.out.println(ran3);
		
		int ran4=(int)(Math.random()*15)+31;
		System.out.println(ran4);
	}
}
