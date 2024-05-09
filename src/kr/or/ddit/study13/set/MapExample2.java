package kr.or.ddit.study13.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MapExample2 obj = new MapExample2();
		obj.process();

	}

	public void process() {
		List<Map<String,Object>> empList=inputData();
		int max=getMaxSalary(empList);
		System.out.println(max);
		int min=getMinSalary(empList);
		System.out.println(min);
		printAll(empList);
		addDeptSal(empList);
		increaseDept(empList);
	}
	
	public void increaseDept(List<Map<String,Object>> empList) {
		
		//부서 입력하고 해당 부서 급여 10%인상
		printAll(empList);
		System.out.println("부서번호 입력");
		int deptno=sc.nextInt();
		
		for (Map<String, Object> map : empList) {
			int dept=(int)map.get("DEPTNO");
			if (deptno!=dept) continue;
			int sal=(int)map.get("SAL");
			sal=(int)(sal*1.1);
			map.put("SAL", sal);
		}
		printAll(empList);
	}
	
	public void addDeptSal(List<Map<String,Object>> empList) {
		Map<Integer,Integer> resultMap=new HashMap<Integer, Integer>();
		for (Map<String, Object> map : empList) {
			int sal=(int)map.get("SAL");
			int deptno=(int)map.get("DEPTNO");
			if (resultMap.containsKey(deptno)) {
				sal+=resultMap.get(deptno);
			}
			resultMap.put(deptno, sal);
		}
		System.out.println(resultMap);
	}
	
	
	public void printAll(List<Map<String,Object>> empList) {
		for(int i=0;i<empList.size();i++) {
			System.out.println(empList.get(i));
		}
	}
	public int getMinSalary(List<Map<String,Object>> empList) {
		
		int result=(int) empList.get(0).get("SAL");
		for(int i=0;i<empList.size();i++) {
			if(result>(int) empList.get(i).get("SAL"))result=(int) empList.get(i).get("SAL");
		}
		return result;
	}
	
	public int getMaxSalary(List<Map<String,Object>> empList) {
		int result=(int) empList.get(0).get("SAL");
		for(int i=0;i<empList.size();i++) {
			if(result<(int) empList.get(i).get("SAL"))result=(int) empList.get(i).get("SAL");
		}
		return result;
	}
	
	public List<Map<String,Object>> inputData() {
//		EMPNO  ENAME     JOB    SAL DEPTNO
//		7369	장길동	프로그래머	600	50
//		7499	고영우	시장조사	550	20
//		7521	구기현	영업사원	250	30
//		7566	김동혁	관리자	375	40
//		7654	김민욱	영업사원	350	30
		
		
		Map<String,Object> map1=new HashMap();
		map1.put("EMPNO", "7369");
		map1.put("ENAME", "장길동");
		map1.put("JOB", "프로그래머");
		map1.put("SAL", 600);
		map1.put("DEPTNO", 50);
		
		Map<String,Object> map2=new HashMap();
		map2.put("EMPNO", "7499");
		map2.put("ENAME", "고영우");
		map2.put("JOB", "시장조사");
		map2.put("SAL", 550);
		map2.put("DEPTNO", 20);
		
		Map<String,Object> map3=new HashMap();
		map3.put("EMPNO", "7521");
		map3.put("ENAME", "구기현");
		map3.put("JOB", "영업사원");
		map3.put("SAL", 250);
		map3.put("DEPTNO", 30);
		
		Map<String,Object> map4=new HashMap();
		map4.put("EMPNO", "7566");
		map4.put("ENAME", "김동혁");
		map4.put("JOB", "관리자");
		map4.put("SAL", 375);
		map4.put("DEPTNO", 40);
		
		Map<String,Object> map5=new HashMap();
		map5.put("EMPNO", "7654");
		map5.put("ENAME", "김민욱");
		map5.put("JOB", "영업사원");
		map5.put("SAL", 350);
		map5.put("DEPTNO", 30);
		
		List<Map<String,Object>> list=new ArrayList();
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		return list;
		
	}

}
