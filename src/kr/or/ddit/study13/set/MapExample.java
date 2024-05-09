package kr.or.ddit.study13.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Hashmap
 * key와 value로 이루어짐
 * key값은 중복허용란하고 순서 보장 안됨
 * 
 * map타입 대표 컬렉션
 * 
 * 주요 메소드
 * 
 * put(key, value): 데이터입력 key값은 중복이 안되지만 value는 중복 가능
 * get(key) : 입력받은 value 값은 key값을 통해 가져올수 있음
 * keySet(): key로 이루어진 hashSet값을 가져옴
 * containsKey(key) : key값이 있는지 확인
 * 
 */

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap();
		map.put("홍길동", 90);
		map.put("이순신", 75);
		map.put("정몽주", 84);
		map.put("이성계", 93);
		
		System.out.println(map.get("이성계"));
		map.put("홍길동", map.get("홍길동")+5);
		System.out.println(map.get("홍길동"));
		
		Set<String> keySet=map.keySet();
		
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()) {
			String key =it.next();
			System.out.println(key+", "+map.get(key));
		}
		int score=map.get("홍길동");
		
	}
}
