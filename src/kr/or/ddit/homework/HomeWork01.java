package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		Date date=new Date();
		
		// 기준일로 부터 지난 시간
		long time=date.getTime();
		System.out.println(time);
		
		//?년?일?시?분?초 지났습니다.
		//60 60 24 365
		long year,day,hour,sec,min;
		year= time/365/24/60/60/1000;
		System.out.print(year+"년 ");
		time=time-(year*365*24*60*60*1000);
		day=time/24/60/60/1000;
		//day=(time-(year*365*24*60*60*1000))/24/60/60/1000;
		System.out.print(day+"일 ");
		time=time-(day*24*60*60*1000);
		hour=time/60/60/1000;
		System.out.print(hour+"시간 ");
		time=time-(hour*60*60*1000);
		min=time/60/1000;
		System.out.print(min+"분 ");
		time=time-(min*60*1000);
		sec=time/1000;
		System.out.println(sec+"초");
		
	}
}