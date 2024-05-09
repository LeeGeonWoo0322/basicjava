package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19 obj = new HomeWork19();
		obj.process();
	}

	public void process() {
		List<Map<String, Object>> parkList = inputDate();
		Map<String, Integer> parkTimeResult = parkTime(parkList);
		Map<String, Integer> parkPayResult = parkPay(parkTimeResult);
		
		Set<String> keySet = parkPayResult.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("차량번호: "+key+", "+"주차요금: "+parkPayResult.get(key));
		}
		
	}
	// 요금계산하기
	public Map<String, Integer> parkPay(Map<String, Integer> parkTimeResult) {
		// 기본시간: 180분, 기본요금 5000원
		// 10분당 600원
		Map<String, Integer> result = new HashMap();
		Set<String> keySet = parkTimeResult.keySet();

		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int money = 5000;
			int time = parkTimeResult.get(key) - 180;
			if (time > 0) {
				money = money + time / 10 * 600;
				if (time % 10 != 0)
					money += 600;
			}
			result.put(key, money);
		}
		return result;
	}

	// 차량별 주차시간 구하기
	public Map<String, Integer> parkTime(List<Map<String, Object>> parkList) {

		Map<String, Integer> resultMap = new HashMap();
		Map<String, String> temp = new HashMap();
		for (Map<String, Object> map : parkList) {
			String time=(String) map.get("시각");
			String inOut = (String) map.get("내역");
			String carNum = (String) map.get("차량번호");
			
			if(temp.containsKey(carNum)) {
				String intime=temp.remove(carNum);
				int parkTime=getMin(time)-getMin(intime);
				if(resultMap.containsKey(carNum))parkTime+=resultMap.get(carNum);
				resultMap.put(carNum, parkTime);
			}
			else {
				temp.put(carNum, time);
			}
		}
		return resultMap;
	}

	public int getMin(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		return hour * 60 + min;
	}

	// 1. 데이터 넣기
	public List<Map<String, Object>> inputDate() {
		// 시각 차량번호 내역
		// 05:34 5961 입차
		// 06:00 0000 입차
		// 06:34 0000 출차
		// 07:59 5961 출차
		// 07:59 0148 입차
		// 18:59 0000 입차
		// 19:09 0148 출차
		// 22:59 5961 입차
		// 23:00 5961 출차
		// 23:00 0000 출차
		Map<String, Object> park1 = new HashMap();
		park1.put("시각", "05:34");
		park1.put("차량번호", "5961");
		park1.put("내역", "입차");

		Map<String, Object> park2 = new HashMap();
		park2.put("시각", "06:00");
		park2.put("차량번호", "0000");
		park2.put("내역", "입차");

		Map<String, Object> park3 = new HashMap();
		park3.put("시각", "06:34");
		park3.put("차량번호", "0000");
		park3.put("내역", "출차");

		Map<String, Object> park4 = new HashMap();
		park4.put("시각", "07:59");
		park4.put("차량번호", "5961");
		park4.put("내역", "출차");

		Map<String, Object> park5 = new HashMap();
		park5.put("시각", "07:59");
		park5.put("차량번호", "0148");
		park5.put("내역", "입차");

		Map<String, Object> park6 = new HashMap();
		park6.put("시각", "18:59");
		park6.put("차량번호", "0000");
		park6.put("내역", "입차");

		Map<String, Object> park7 = new HashMap();
		park7.put("시각", "19:09");
		park7.put("차량번호", "0148");
		park7.put("내역", "출차");

		Map<String, Object> park8 = new HashMap();
		park8.put("시각", "22:59");
		park8.put("차량번호", "5961");
		park8.put("내역", "입차");

		Map<String, Object> park9 = new HashMap();
		park9.put("시각", "23:00");
		park9.put("차량번호", "5961");
		park9.put("내역", "출차");

		Map<String, Object> park10 = new HashMap();
		park10.put("시각", "23:00");
		park10.put("차량번호", "0000");
		park10.put("내역", "출차");

		List<Map<String, Object>> list = new ArrayList();
		list.add(park1);
		list.add(park2);
		list.add(park3);
		list.add(park4);
		list.add(park5);
		list.add(park6);
		list.add(park7);
		list.add(park8);
		list.add(park9);
		list.add(park10);

		return list;

	}
}