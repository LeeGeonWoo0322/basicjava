package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();

	}

	public void process() {
		Deck deck=new Deck();
		deck.suffle();
		deck.printCardList();
		//내카드랑 랜덤카드랑 비교해서 숫자가 더 높으면 이김
		Card myCard=deck.getCard(0);
		//컴퓨터는 랜덤
		int ran = new Random().nextInt(52);
		Card comCard=deck.getCard(ran);
		print(myCard,comCard);
	}
	public void print(Card my,Card com) {
		//결과 출력
		//내카드:ㅁㄴㅇ ,컴퓨터:ㅁㄴㅇ
		//결과: lose
		System.out.println("내카드: "+my+", 컴퓨터카드: "+com);
		if(my.num>com.num) {
			System.out.println("이겼습니다.");
		}
		else if(my.num<com.num) {
			System.out.println("겼습니다.");
		}
		else if(my.num==com.num) {
			System.out.println("비겼습니다.");
		}
		
	}
}
class Card{
	String type;
	int num;

	
	//생성자 type, num 입력할것.
	public Card(String t,int n) {
		type=t;
		num=n;
	}
	@Override
	public String toString() {
		//type ,
		//num 1~13
		//1-a
		//11-j, 12-q,13-k
		String result="";
		result+=type;
		if(num==1) {
			result+="A";
		}
		else if(num==11) {
			result+="J";
		}
		else if(num==12) {
			result+="Q";
		}
		else if(num==13) {
			result+="K";
		}
		else {
			result+=num;
		}
		return result;
	}	
	
}

class Deck{
	Card[] cardList;
	public Deck() {
		cardList=new Card[52];
		String[] type= {"♤","◇","♡","♧"};
		int cnt=0;
		for(String t:type) {
			for(int i=1;i<=13;i++) {
				cardList[cnt++]=new Card(t,i);
			}
		}
	}
	
	public void suffle() {
		//카드섞기
		for(int i=0;i<10000;i++) {
			int ran2 = new Random().nextInt(cardList.length);
			Card temp;
			temp=cardList[0];
			cardList[0]=cardList[ran2];
			cardList[ran2]=temp;
		}
	}
	
	public void printCardList() {
		int cnt=1;
		for(int i=0;i<cardList.length;i++) {
			System.out.print(cardList[i]+",  ");
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
			cnt++;
		}
	}
	public Card getCard(int ran) {
		return cardList[ran];
	}
}
