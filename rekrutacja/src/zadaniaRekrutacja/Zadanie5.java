package zadaniaRekrutacja;

class CP {
	int x = 5;
}

public class Zadanie5 {

	static CP run(CP c1, CP c2) {
		CP cp = c1;
		cp.x = 6;
		return cp;
	}

	public static void main(String[] args) {
		final CP c1 = new CP();
		CP c2 = new CP();
		CP c3 = run(c1, c2);
		System.out.println((c1 == c3) + " " + (c1.x == c3.x));
	}
	
	// 5
	// 5
	// 6
	// 
	
}