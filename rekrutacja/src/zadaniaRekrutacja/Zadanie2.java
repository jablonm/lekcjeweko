package zadaniaRekrutacja;

public class Zadanie2 {

	public static void main(String[] args) {
		
			String osiol ="osioł";
			String osiolek = new String("osioł");

			if (osiol == osiolek) {
				System.out.println("rowne");
			}

			if (osiol.equals(osiolek)) {
				System.out.println("naprawde rowne");
			}
	}
	
}