package step2;

import java.util.Scanner;

public class PhoneBookVer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전번 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("생일 : ");
		String birth = sc.nextLine();
		
		
		Person p = new Person(name,phoneNumber,birth);
		
		p.showPhoneInfo();
		
	}
	
}
