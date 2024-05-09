package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		
		String name2= new String("홍길동");
		String name="홍길동";
		System.out.println(name);
		System.out.println(name2);
		String result1=name+"\n"+name2;
		System.out.println(result1);
		
		
		
		System.out.println("\""+name+"\", "+"\""+name2+"\"");
		
		
		int a1=20;
		int a2=24;
		
		String result3=""+a1+a2;
		System.out.println(result3);
		System.out.println(""+a1+a2);
		
	}
}
