package NewPersonExam01;

public class MenuChoice {
	
	Menu choice = new Menu();
	String kinds; 
	void galaxy() {
		choice.price = 1000000;
		
		System.out.print("색상 선택하세요 : 1. red 2. green 3. blue 4. pink \n");
		int color = Integer.parseInt(MenuTest.sc.nextLine());
		System.out.print("용량을 선택하세요 1. 64GB 2. 128GB(+10만) 3. 256GB(20만) 4. 512GB(30만)\n");
		int cap = Integer.parseInt(MenuTest.sc.nextLine());
		for(int i = cap; i>1;i--) {
			choice.price += 100000;
		}
		kinds = kind(1,color,cap,choice.price);
		System.out.println(kinds);
	}
	
	void iPhone() {
		choice.price = 1300000;
		
		System.out.print("색상 선택하세요 : 1. Gold 2. Green 3. Silver 4. White\n");
		int color = Integer.parseInt(MenuTest.sc.nextLine());
		System.out.print("용량을 선택하세요 1. 64GB 2. 128GB(+10만) 3. 256GB(20만) 4. 512GB(30만)\n");
		int cap = Integer.parseInt(MenuTest.sc.nextLine());
		
		for(int i = cap; i>1;i--) {
			choice.price += 100000;
		}
		kinds = kind(2,color,cap,choice.price);
		System.out.println(kinds);
		
	}
		
	
	String kind(int i,int color, int cap,int price) {
		
		String[] kinds = {"","Galaxy","iPhone"};
		String[] colors1 = {"","Red","Green","Blue","Pink"};
		String[] colors2 = {"","Gold","Green","Silver","White"};
		String[] caps = {"","64GB","128GB","256GB","512GB"};
		if(i==1) {
			return "종류 = "+kinds[i]+"\n색깔 = "+colors1[color]+"\n용량 = "+caps[cap]+"\n가격 = "+price+"원";
		}else if(i==2) {
			return "종류 = "+kinds[i]+"\n색깔 = "+colors2[color]+"\n용량 = "+caps[cap]+"\n가격 = "+price+"원";
		}else {
			return "x";
		}
	}
	
}
