package chap08;

public class Deck {

	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];
	
	Deck() {
		int i=0;
		for(int k=Card.KIND_MAX;k>-1;k--) {
			for(int j=0; j<Card.NUM_MAX; j++) {
				cardArr[i++] = new Card(k,j);
				
			}
		}
		
	}
	Card pick(int index) {
		return cardArr[index];
	}
	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return cardArr[index];
	}
	
	void shuffle() {
		for(int i=0; i<cardArr.length;i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
		
	}
	void printAll() {
		for(int i=0; i<52; i++) {
			System.out.print(cardArr[i]);
		}
	}		
}
