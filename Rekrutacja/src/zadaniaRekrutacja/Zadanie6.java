package zadaniaRekrutacja;

class Ax {
	{
		System.out.print("a1 ");
	}
	
	public Ax() {
		System.out.print("a2 ");
	}
}

class Bx extends Ax {
	static {
		System.out.print("b1 ");
//		static int w=1;
	}
	
	public Bx() {
		System.out.print("b2 ");
	}
	
	{
		System.out.print("b3 ");
	}
	
	static {
		System.out.print("b4 ");
	}
}

public class Zadanie6 {
	//statyczne
	//pozniej wchodzi do klasy wypisuje zwykle zmienne
	//wykonuje konstruktuje
	
	//OCA 

	public static class Cx extends Bx {
		public static void main(String[] args) {
			System.out.print("c1 ");
			new Cx();
			System.out.println("c2 ");
		}
	}

}