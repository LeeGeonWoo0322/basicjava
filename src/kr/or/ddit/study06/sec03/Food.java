package kr.or.ddit.study06.sec03;

public class Food {
	//제조일자
	int manuYear;
	int lastYear;
	String name;
	int price;
	
	public Food() {
		
	}
	public Food(int manuYear,String name,int price) {
		this.manuYear=manuYear;
		lastYear=manuYear+3;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Food [manuYear=" + manuYear + ", lastYear=" + lastYear + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
