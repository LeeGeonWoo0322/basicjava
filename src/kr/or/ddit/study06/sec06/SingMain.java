package kr.or.ddit.study06.sec06;

public class SingMain {
	public static void main(String[] args) {
		Sing s1=new Sing();
		s1.setTitle("kasjdnakjs");
		s1.setLyrics("aksdhiaudaskdjhbaiudabd");
		s1.setPubYear("2024");
		s1.setSinger("IU");
		
		System.out.println("제목: "+s1.getTitle()+"\t가수: "+s1.getSinger()+"\t발매년도: "+s1.getPubYear());
		
	}
}
