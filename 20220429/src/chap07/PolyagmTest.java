package chap07;

public class PolyagmTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Piano());
		
		b.summary();
		System.out.println("잔액 : "+ b.money + "\n보너스포인트 : "+b.bonusPoint);
	
	}
}
