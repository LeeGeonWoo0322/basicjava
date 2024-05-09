package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();

	}

	public void process() {
		
		Score s1=new Score();
		s1.kor=80;
		s1.eng=90;
		s1.math=78;
		s1.name="전승염";
		Score s2=new Score();
		s2.kor=86;
		s2.eng=79;
		s2.math=91;
		s2.name="권민욱";
		Score s3=new Score();
		s3.kor=89;
		s3.eng=90;
		s3.math=88;
		s3.name="변화산";
		Score s4=new Score();
		s4.kor=100;
		s4.eng=81;
		s4.math=82;
		s4.name="정민석";
		Score s5=new Score();
		s5.kor=80;
		s5.eng=90;
		s5.math=88;
		s5.name="전현종";
		Score[] scores= {s1,s2,s3,s4,s5};
		//1. 총점 평균
		for(int i=0;i<scores.length;i++) {
			scores[i].sum=scores[i].eng+scores[i].kor+scores[i].math;
			scores[i].avg=scores[i].sum/3;
		}
		
		//2.등수 구하기
		for (int j = 0; j < scores.length; j++) {
			for (int i = 0; i < scores.length; i++) {
				if(scores[j].sum<scores[i].sum) {
					scores[j].rank++;
				}
			}
		}
		//3. 출력
		System.out.println();
		System.out.println("이름\t국\t영\t수\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		//4. 정렬
//		int[] arr= {1,4,3,2,5};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<scores.length-1;i++) {
			for(int j=0;j<scores.length-1;j++) {
				if(scores[j].rank>scores[j+1].rank) {
					Score temp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
				}
			}
		}
		//5. 출력
		System.out.println("이름\t국\t영\t수\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
	}
}
class Score{
	//이름 국영수 총점, 평균 등수
	String name;
	int kor,eng,math;
	int sum=0;
	double avg;
	int rank=1;
	// toString 만들기
	public String toString() {
		return name+": "+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank;
	}
	
}
