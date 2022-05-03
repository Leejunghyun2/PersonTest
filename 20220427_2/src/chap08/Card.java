package chap08;

public class Card {
	
	static final int KIND_MAX = 3;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 3;
	static final int DIAMOND = 2;
	static final int HEART = 1;
	static final int CLOVER = 0;
	int kind;
	int num;
	
	
	Card(int kind,int num){
		this.kind = kind;
		this.num = num;
	}
	
	Card(){
		this(SPADE,0);
	}
	
	public String toString() {
	
		String[] kinds = {"CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "123456789XJQK";
		return "\nkind = "+ kinds[this.kind] +"\nnumber : " + numbers.charAt(this.num);
		
	}
	
	
	
}
