package chap06;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = null;
		FireEngine fe =null;
		
		car.drive();
		
		
		if(car instanceof FireEngine)
		{
		fe = (FireEngine)car;
		fe.drive();
		}
		if(fe instanceof Car)
		{
		car2 = fe;
		car2.drive();
		}
		System.out.println("dd");
	}
}
