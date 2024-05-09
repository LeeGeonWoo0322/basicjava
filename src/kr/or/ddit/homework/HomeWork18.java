package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import kr.or.ddit.study13.ArrayListExample02;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		
		hw.process();
	}

	public void process() {
		printHistoGram(10000);
	}

	public int oneDice() {
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		return num1;
	}

	public int twoDice() {
		Random random = new Random();
		int num2 = random.nextInt(6) + 1;
		return num2;
	}

	public Map trialNtimes(int n) {
		Map<Integer, Integer> resultMap = new HashMap();
		for (int i = 0; i < n; i++) {
			int sum = oneDice() + twoDice();
			if (resultMap.containsKey(sum)) {
				resultMap.put(sum, resultMap.get(sum) + 1);
			} else {
				resultMap.put(sum, 1);
			}
		}
		return resultMap;
	}
	public void printHistoGram(int num) {
		Map<Integer, Integer> resultMap = trialNtimes(num);
		for(int j=2;j<=12;j++) {
			System.out.print(j + ":\t");
			for(int i=0;i<resultMap.get(j)*100/num;i++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}