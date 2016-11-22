package Zadania_Kolekcje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zadanie_2 {
	
//2. Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi 
//imienia „koniec', następnie poproś o podanie jednego z wcześniej wprowadzonych imion i 
//wyświetl imię odpowiadającego mu osoby.		

	public static class PairNames {
		private String name1;
		private String name2;
		
		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}

		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public PairNames(String name1, String name2) {
			this.name1 = name1;
			this.name2 = name2;
		}
		
		public boolean checkName(String name) {
			if (name1.equals(name) || name2.equals(name)) {
				return true;
			} else {
				return false;
			}
		}
		
		public String returnPair(String name) {
			if (name1.equals(name)) {
				return name2;
			} else
				return name1;
			}
	}
	
	public static void main(String[] args) {
		
		Scanner in = null;
		try {
			in = new Scanner(new File("/home/miszx/git/zadaniaw/Zadania/src/Zadania_Kolekcje/nazwiska2"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		Map<String,String> zwiazki = new HashMap<>();
		List<PairNames> listName = new ArrayList<>();
		
		String[] line;
		do {
			line = in.nextLine().split(",");
			PairNames pair = new PairNames(line[0], line[1]);
//			zwiazki.put(line[0], line[1]);
			listName.add(pair);
		} while (in.hasNext());
		in.close();
		
		Scanner inConsole = new Scanner(System.in);
		while (true) {
			System.out.print("Podaj szukane nazwisko: ");
			String input = inConsole.nextLine();
//			System.out.println(zwiazki.get(input));
            if ("q".equals(input)) {
                System.out.println("Koniec.");
                break;
            }
			
			for (PairNames pair : listName) {
				if (pair.checkName(input)) {
					System.out.println("Para dla " + input + " to " + pair.returnPair(input) + ".");
					break;
				}
			}
		}
		
	}
	
}