package chap07;

public class Child extends Parent {
	int x = 100;
	
	
	
	@Override
	void method() {
		System.out.println("Child Method");
		System.out.println(super.x);
		System.out.println(this.x);
	}
	
}
