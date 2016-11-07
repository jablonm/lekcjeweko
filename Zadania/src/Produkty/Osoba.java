package Produkty;

import java.util.Objects;

public class Osoba {
	
	private int id;
	private String imie;
	private String nazwisko;
	private int numerTelefonu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getNumerTelefonu() {
		return numerTelefonu;
	}
	public void setNumerTelefonu(int numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}
	
	@Override
	public boolean equals(Object obj) {
		Osoba os = (Osoba)obj;
		return os.getImie().equals(this.getImie()) && os.getNazwisko().equals(this.getNazwisko());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getImie()) + Objects.hashCode(this.getNazwisko());
	}
	
	@Override
	public String toString() {
		return "Id: " + id + " Imię: " + imie + " Nazwisko: " + nazwisko + " Numer telefonu: " + numerTelefonu;
	}
}
