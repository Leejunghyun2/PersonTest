package PersonTest;

public class UnivFriends extends Person {
	String major;
	int grade;

	UnivFriends(String name, String PhoneNumber, String birth, String major, int grade) {
		super(name, PhoneNumber, birth);
		this.major = major;
		this.grade = grade;

	}
	//Person showPhoneInfo() overriding 
	void showPhoneInfo() {
//		if (birth != null && birth.length() != 0)
			if (birth != null && !birth.equals(""))
				System.out.printf("�̸�: %s ����: %s ����: %s ����: %s �г�: %d�г�\n", name, phoneNumber, birth, major, grade);
			else
				System.out.printf("�̸�: %s ����: %s : ����: %s �г�: %d�г� \n", name, phoneNumber, major, grade);

	}

}