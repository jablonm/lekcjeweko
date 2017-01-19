package zadaniaRekrutacja;

class Atom {
	Atom() {
		System.out.println("atom");
	}
}

class Rock extends Atom {
	Rock(String type) {
		System.out.println("type");
	}
}

class Mountain extends Rock {
	Mountain() {
		super("granit");
		new Rock("granit");
	}
}

public class Zadanie1 {

	public static void main(String[] a) {
		new Mountain();
	}

/*	atom
	type
	atom
	type
*/
	
}
