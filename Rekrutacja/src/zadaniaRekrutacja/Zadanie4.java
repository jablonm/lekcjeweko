package zadaniaRekrutacja;

class A {
}

class B extends A {
}

public class Zadanie4 {
	
	static String s = "-";

	static void add(A[]... a2) {
		s += "4";
	}
	
	static void add(B[]... b1) {//Integer... a
		s += "3";
	}
	
	static void add(B[] b1) {
		s += "2";
	}
	
	static void add(Object o) {
		s += "1";
	}
	
//	static void cos(Integer... a){
//		for(Integer s : a){
//			System.out.println("podal "+s);
//		}
//	}
	
	public static void main(String[] args) {
		A[] aa = new A[2];
		B[] bb = new B[2];
		add(aa);
		add(bb);
		add(5);
		System.out.println(s);
	}

}