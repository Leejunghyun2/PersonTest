package step1;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		
		//Person p1 = new Person();
		//Person p2 = new Person("이순신","010-4444-3434","1910-03-01");
		//Person p3 = new Person("세종대왕","010-888-7777");
		Person[] p = new Person[3];
		p[0] = new Person();
		p[1] = new Person("이순신","010-4444-3434","1910-03-01");
		p[2] = new Person("세종대왕","010-888-7777");
		
		for(int i=0;i<p.length;i++) {
		p[i].showPhoneInfo();
		}
	}
	
}
