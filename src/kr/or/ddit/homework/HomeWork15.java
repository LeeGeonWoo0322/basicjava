package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();

	}

	public void process() {
		Calendar cal = Calendar.getInstance();
		while (true) {
			// <이전달 다음달>

			cal.set(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			System.out.println("<이전달                                                                                           다음달>");
			System.out.println("---------------------" + year + "년 " + (month + 1) + "월---------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");

			for (int date = 1; date <= lastDay; date++) {
				if (date == 1) {
					for (int j = 1; j < day; j++) {
						System.out.print("  \t");
					}
				}
				System.out.print(date + "\t");
				if ((date + day - 1) % 7 == 0)
					System.out.println();
			}

			System.out.println("\n< 또는 >을 입력하세요.");
			String str = sc.next();

			if ("<".equals(str)) {
				cal.add(Calendar.MONTH, -1); 
			} else if (">".equals(str))
				cal.add(Calendar.MONTH, 1); 
		}

	}

}
