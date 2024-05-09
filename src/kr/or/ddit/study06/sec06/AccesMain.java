package kr.or.ddit.study06.sec06;

public class AccesMain {
	public static void main(String[] args) {
		AccesPrivate ap=new AccesPrivate();
		
		AccesDefault as=new AccesDefault();
		int a=as.a;
		as.defaultMethod1();
		
		AcessProtect ap2=new AcessProtect();
		int a2=ap2.a;
		
		AcessPublic ap3=new AcessPublic();
		ap3.publicMethod1();
	}
}
