package zadaniaRekrutacja;

class Fish {
	String name = "fish ";

	String eat() {
		return "fish eats";
	}
}

class Shark extends Fish {
	String name = "shark ";

	String eat() {
		return "shark eats";
	}
}

public class Zadanie3 {

	void go() {
		Fish f = new Shark();
		System.out.println(f.name + f.eat());
	}

	public static void main(String[] args) {
		new Zadanie3().go();

	}

	// fish fish eats
	// fish shark eats
	
}