package step01;

public class MovieReservationSystem implements ChoiceName {
	public static void main(String[] args) {
		MovieReservation mm = MovieReservation.getinstance();
		NewMember users = NewMember.getInfo();
		ReservationNumber rn = ReservationNumber.getInstance();
		Admin admin = Admin.getInstance();
		MenuViewer menu = MenuViewer.getInstance();
		Screen se = new Screen();
		se.run();
		while (true) {
			try {
				MenuViewer.showUserManagement();
				int choice = Integer.parseInt(MovieReservation.sc.nextLine());
				if(choice <0 || choice >6) {
					throw new ChoiceException();
				}
				switch (choice) {
				case MEMBER_LOGIN:
					switch (admin.login()) {
					case 3:
						admin.adminChoice();
						continue;
					case 2:
						users.userMenu();
						continue;
					case 1:
						System.out.println("�߸� �Է��ϼ˽��ϴ�.");
						continue;
					} // ȸ�� �α���
				case JOIN_MEMBER:
					users.joinMember();
					continue;
				case NON_MEMBER_RESERVATION:
					mm.nonMemberReserv();
					continue;
				case N_MEMBER_RESERVATION_CHECK:
					mm.nonReservConfirm();
					continue;
				case NON_MEMBER_CANCEL:
					mm.reservationCancel();
					continue;
				case SEARCH_MY_SEAT:
					mm.nonShowSeatStatus();
					continue;
				case QUIT:
					mm.objOutputData();
					users.objOutputData();
					rn.objOutputData();
					menu.objOutputData();
					return;
				}
			} // ��ȸ����

			catch (ChoiceException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է����ּ���");
			}catch(Exception e) {}

		}
	}
}