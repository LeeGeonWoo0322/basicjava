package kr.or.ddit.study06.sec02;

public class ScoreExample {
	public static void main(String[] args) {
		//2명의 score 객체를 생성하고 국영수 값을 각각 넣어보시오.
		Score s1=new Score();
		s1.kor=85;
		s1.math=95;
		s1.eng=80;
		
		Score s2=new Score();
		s2.kor=95;
		s2.math=87;
		s2.eng=90;
		
		s1.avg=(s1.eng+s1.kor+s1.math)/3.0;
		s2.avg=(s2.eng+s2.kor+s2.math)/3.0;
		
		System.out.println(s1.avg);
		System.out.println(s2.avg);
		
	}
}
