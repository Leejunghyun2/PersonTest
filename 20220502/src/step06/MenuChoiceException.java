package step06;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice)
	{
		super("잘못 선택이 이뤄졌습니다.");
		wrongChoice=choice;
	}
	public void showWrongChoice() {
		System.out.println(wrongChoice+"에 해당하는 선택은 존재하지않습니다.");
	}
}
