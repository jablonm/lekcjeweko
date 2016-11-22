package Zadania_Kolekcje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Zadanie_1 {

	// 1. Pobierz od użytkownika dowolną liczbę nazwisk. Dokąd nie wprowadzi
	// słowa 'koniec'.
	// Następnie wypisz nazwiska, które występują tylko raz.

	public static void main(String[] args) {

		Scanner in = null;
		try {
			in = new Scanner(new File("/home/miszx/git/zadaniaw/Zadania/src/Zadania_Kolekcje/nazwiska"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Map<String, Integer> nameSet = new HashMap<>();

		String line = "";
		do {
			line = in.nextLine();

			if (nameSet.containsKey(line)) {
				nameSet.put(line, nameSet.get(line) + 1);
			} else {
				nameSet.put(line, 1);
			}

		} while (in.hasNext());
		in.close();

		for (String name : nameSet.keySet()) {
			if (nameSet.get(name) == 1) {

			}
		}

		for (Entry<String, Integer> entry : nameSet.entrySet()) {
			if (entry.getValue() == 1) {
				// System.out.println(entry.getKey() + " " + entry.getValue());
				System.out.println(entry.getKey());
			}
		}
	}

}
