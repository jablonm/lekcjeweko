package Produkty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File(System.getProperty("user.home") + "/produkty.txt"));

		Map<Osoba, List<Produkt>> map = new HashMap<>();
//		List<Osoba>
		//
		// Map<Integer,Integer> mapTmp =new HashMap<>();
		
		//JAXB

		int licznik = 0;
		do {
			String linia = in.nextLine();
			if (licznik != 0) {
				Osoba osoba = new Osoba();
				Produkt produkt = new Produkt();

				String[] tablicaLinii = linia.split(";");
				osoba.setId(Integer.parseInt(tablicaLinii[0]));
				osoba.setImie(tablicaLinii[1]);
				osoba.setNazwisko(tablicaLinii[2]);
				osoba.setNumerTelefonu(Integer.parseInt(tablicaLinii[3]));
				produkt.setId(Integer.parseInt(tablicaLinii[4]));

				List<Produkt> listaProduktow = new ArrayList<>();
				
				//majak 
				//studzik
				//osoba=anna
				if (map.containsKey(osoba)) {
					listaProduktow.addAll(map.get(osoba));
				}

				listaProduktow.add(produkt);
				map.put(osoba, listaProduktow);
				// mapTmp.put(2, 3);
			}
			licznik++;
		} while (in.hasNext());
		
		for (Osoba os : map.keySet()) {
			System.out.println(os);
//			for (Produkt pr : map.get(os)) {
//				System.out.print(" " + pr.getId());
//			}
		}

	}

}
