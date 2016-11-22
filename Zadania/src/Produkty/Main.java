package Produkty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(new File(System.getProperty("user.home") + "/produkty.txt"));

		// ROZWIAZANIE 1 - oparte na mapach, produkty jako osobne obiekty
//		 Map<Osoba, List<Produkt>> map = new HashMap<>();
		//
		//
		// int licznik = 0;
		// do {
		// String linia = in.nextLine();
		// if (licznik != 0) {
		// Osoba osoba = new Osoba();
		// Produkt produkt = new Produkt();
		//
		// String[] tablicaLinii = linia.split(";");
		// osoba.setId(Integer.parseInt(tablicaLinii[0]));
		// osoba.setImie(tablicaLinii[1]);
		// osoba.setNazwisko(tablicaLinii[2]);
		// osoba.setNumerTelefonu(Integer.parseInt(tablicaLinii[3]));
		// produkt.setId(Integer.parseInt(tablicaLinii[4]));
		//
		// List<Produkt> listaProduktow = new ArrayList<>();
		//
		// if (map.containsKey(osoba)) {
		// listaProduktow.addAll(map.get(osoba));
		// }
		//
		// listaProduktow.add(produkt);
		// map.put(osoba, listaProduktow);
		// // mapTmp.put(2, 3);
		// }
		// licznik++;
		// } while (in.hasNext());
		//
		// for (Osoba os : map.keySet()) {
		// System.out.println(os);
		// for (Produkt pr : map.get(os)) {
		// System.out.print(" " + pr.getId());
		// }
		// }
		//
		// ROZWIAZANIE 2 - lista, produkty sa przechowywane w obiekcie osoba
		//Map<Long, Set<Long>> map = new HashMap<>();
		List<Osoba> list = new ArrayList<>();

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
				// List listProd= new ArrayList<>();
				// listProd.add(produkt);
				// if(list.contains(osoba)){
				// listProd.addAll(osoba.getListaProduktow());
				// }
				// osoba.setListaProduktow(listProd);;
				list.add(osoba);
				osoba.getListaProduktow().add(produkt);
			}
			licznik++;
		} while (in.hasNext());
		
		for (Osoba osoba : list) {
			System.out.println(osoba);
			System.out.println(osoba.getListaProduktow());
		}
		
	}

}
