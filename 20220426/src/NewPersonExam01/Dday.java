package NewPersonExam01;

import java.util.Scanner;

public class Dday {
	Scanner sc = new Scanner(System.in);
	int year, month, day, date;

	Dday(int year, int month, int day, int date) {

		this.year = year;
		this.month = month;
		this.day = day;
		this.date = date;
		showDday();
	}

	Dday() {

	}

	void showDday() {

		for (int k = 0; k < date; k++) {

			day++;
			if (month > 12) {
				year++;
				month = 1;
			}
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {

				if (day > 31) {
					day = 1;
					month++;
				}
				break;
			}

			case 2: {

				if (day > 28) {
					day = 1;
					month++;
				}
				break;
			}

			case 4:
			case 6:
			case 9:
			case 11: {

				if (day > 30) {
					day = 1;
					month++;
				}
				break;
			}
			default:
				break;

			}

		}

		System.out.printf("%4d - %2d - %2d", year, month, day);

	}
}
