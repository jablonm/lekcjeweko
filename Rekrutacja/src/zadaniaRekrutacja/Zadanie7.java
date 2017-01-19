package zadaniaRekrutacja;

public class Zadanie7 {
	
	public enum Test{
		PISEMNY,
		USTNY
	}
	
	public enum Card {
		SPADES(20), 
		CLUB(50) 
		{
			public int getValue(int val) {
				return val * 3;
			}
		};

		Card(int num) {
			this.num = num;
		}

		private int num;

		public int getValue(int val) {
			return num * val;
		}
		
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "cos";
//		}
	}

	public static void main(String[] args) {
		System.out.print(Card.CLUB.getValue(4));
		System.out.print(" " + Card.SPADES + " " + Card.SPADES.num);
	}

}
