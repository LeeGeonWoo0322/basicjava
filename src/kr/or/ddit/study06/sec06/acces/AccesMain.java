package kr.or.ddit.study06.sec06.acces;

import kr.or.ddit.study06.sec06.AccesDefault;
import kr.or.ddit.study06.sec06.AccesPrivate;
import kr.or.ddit.study06.sec06.AcessProtect;
import kr.or.ddit.study06.sec06.AcessPublic;

public class AccesMain {
	public static void main(String[] args) {
		AccesPrivate ap=new AccesPrivate();
		
		AccesDefault as=new AccesDefault();
//		int a=as.a;
//		as.defaultMethod1();
		
		AcessProtect ap2=new AcessProtect();
//		int a2=ap2.a;
		
		

		AcessPublic ap3=new AcessPublic();
		ap3.publicMethod1();
	}
}
