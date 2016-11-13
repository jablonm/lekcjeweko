package Zadania_Stringi;
//
//Zaddanie 1 
//Wczytaj od użytkownika dwa słowa a następnie sprawdź czy litery od 3-4 są identyczne w dwóch słowach. 
//Np Kotara wata wycięcie 3-4 w kotara = ta zaś w słowie wata wycięcie zwraca ta czyli jest to prawda. 
//Ale w słowach Misio Puchatek już jest si i ch czyli nie są identyczne.
//Zadanie 2
//Wczytaj od użytkownika dwa słowa a następnie porównaj czy są takie same. Proponowane słowa:
//KORale i KoRALE oraz SZKLAnecZKA i szkLANECZKA
//Zadanie 3
//Wczytaj od użytkownika dwa słowa i pomieszaj i następnie wyświetl połączenie tych słów co dwie litery.
//Tzn kosa tama =kotasam
//

public class Strings {
	
	public static String trimmAndCmp() {
		String wordA = "kotara";
		String wordB = "wata";
		
		if (!wordA.substring(3, 4).equals(wordB.substring(3, 4))) {
			return "Słowa " + wordA + " i " + wordB + " mają różne litery [3,4].";
		}
		else {
			return "Słowa " + wordA + " i " + wordB + " mają takie same litery [3,4].";
		}
	}
	
	public static String cmpWords() {
		String wordA = "TESt";
		String wordB = "TEST";
		//String wordA = "KORale";
		//String wordB = "KoRALE";
		// String wordA = "SZKLAnecZKA";
		// String wordB = "szkLANECZKA";
		String wynik = "Słowa " + wordA + " i " + wordB + " są takie same.";
		if (wordA.length() != wordB.length()) {
			wynik = "Słowa " + wordA + " i " + wordB + " są różne.";
		} 
		else {
			for (int i = 0; i < wordA.length(); i++) {
				if (wordA.charAt(i) != wordB.charAt(i)) {
					wynik = "Słowa " + wordA + " i " + wordB + " są różne.";
					break;		
				}
			}
		}
		return wynik;
	}
	
	public static String shuffle() {
		//youtube warsaw jug
		String wordA = "kosa"; //immutable 
		String wordB = "tamarower";

		String shuffleResult = ".";//".","ta",".ta",
		//".takosa"
		//".takosa"

		int val = 0;
		for (int i = 0; i < ((wordA.length()/2 <= wordB.length()/2) ? wordA.length()/2 : wordB.length()/2); i++) {
			shuffleResult += wordA.substring(val, val + 2);
			shuffleResult += wordB.substring(val, val + 2);
			val += 2;
			
		}
		
		if (val >= wordA.length()/2) {
			shuffleResult += wordA.substring(val, wordA.length());
		}
		if (val >= wordB.length()/2) {
			shuffleResult += wordB.substring(val, wordB.length());
		}

		return shuffleResult;
	}
	
	public static void main(String[] args) {
		//System.out.println(trimmAndCmp());
		//System.out.println(cmpWords());
		System.out.println(shuffle());
	}
}
