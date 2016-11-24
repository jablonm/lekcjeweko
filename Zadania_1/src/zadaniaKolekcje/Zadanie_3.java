package zadaniaKolekcje;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Zadanie_3 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		//są dane dwa zbiory liczb. wyznacz różnicę tych zbiorów
		//zbior 1,2,3,3
		//drugiZbior 1,2,6,7 
		//różnica 3,6,7
											//0,1
		//1. uporzadkowana - List ArrayList [1,23,]
		//2 nieuporzadkowana Set Hashset - każdy element jest unikalny []
		
		Set<Integer> zbior1 = new HashSet<>();
		//List<Integer> zbior1 = new ArrayList<>();
				
		zbior1.size();
		for(int i =0;i<3;i++){
			System.out.println("wczytaj liczbe ");
			//zbior1.add(scan.nextInt());
		}
		System.out.println("zakonczyl czytanie liczb "+zbior1);//[2,7,4]
		
		List<Integer> zbior2 = new ArrayList<>();
		zbior2.size();
		for(int i =0;i<3;i++){
			System.out.println("wczytaj liczbe ");
			//zbior2.add(scan.nextInt());
		}
		System.out.println("zakonczyl czytanie liczb "+zbior2);	
		int liczba;//0
		Integer test;//null
//		System.out.println("liczb "+liczba);
		
		int suma=0;
//		for (int i=0; i<zbior2.size(); i++) {
//			suma += zbior2.get(i);
//		}
		
//		for (Integer integer : zbior2) {
//			suma += integer;
//		}
		
		suma = zbior2.stream().mapToInt(Integer::intValue).sum();
		zbior2.stream().filter(p -> p>3).mapToInt(Integer::intValue).sum();
		//pesel, wino
		//pesel, pieluszki
		//Map<Integer, List<Produkt>>
		//Map<Integer,Map<String,List<Produkt>>
		//~
		System.out.println(System.getProperty("user.home"));
//JAVA 7
//Zmieniec PATH!
		Scanner in = new Scanner(new File(System.getProperty("user.home") + "/liczby.txt"));
		
		do{
			zbior2.add((Integer.parseInt(in.nextLine())));
		} while(in.hasNext());
		suma = zbior2.stream().mapToInt(Integer::intValue).sum();
		System.out.println(suma);
		
//JAVA 8 java.util
//Zmieniec PATH!
		suma = Files.lines(Paths.get(System.getProperty("user.home") + "/liczby.txt")).mapToInt(Integer::parseInt).sum();//collect(Collectors.toList());
		System.out.println(suma);
		//linie.forEach(System.out::println);
		//suma = zbior2.stream().mapToInt(Integer::intValue).sum();
		//		for (String string : linie) {
//			
//		}
//		while(x>0){
//			//...
//			x--;//1
//		}
		
		
		System.out.println("suma elementow listy: " + suma);
		
//		for(int i=0;i<0;i++){
//			for(int j=0;j<0;j++){
//				if (zbior1[i] != zbior2[j]) {
//					System.out.println();
//				}
//			}
//		}
		
		//stream java=strumienie 
		
//		for (Integer integer : zbior1) {
//			for (Integer integer2 : zbior2) {
//				if (integer != integer2) {
//					System.out.println(integer);
//				}
//			}
//		}
		
//		scan.nextInt();
	}
	
}
