package kr.or.ddit.study09;

public class ClassA {
	int a=10;
	public static void main(String[] args) {
		ClassA aa=new ClassA();
		ClassB bb=aa.new ClassB();
		System.out.println(aa.a);
		System.out.println(bb.b);
		ClassC cc=new ClassA.ClassC();

		System.out.println(cc);
		
	}
	
	class ClassB{
		int b=11;
	}
	
	static class ClassC{
		int c=12;
	}
}
