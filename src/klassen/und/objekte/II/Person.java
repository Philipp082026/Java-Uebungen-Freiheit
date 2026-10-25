// Eigene Datentypen in eigenen Datentypen verwenden
package klassen.und.objekte.II;

import klassen.und.objekte.I.Adresse;

public class Person {
	
	// ------------ Objektvariablen ---------------
	String name;
	String vorname;
	Adresse adresse; // importierter eigener Datentyp
	
	// ----------- Konstruktor --------------------
	public Person(String name, String vorname, Adresse adresse) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
	}
	public Person(String name, String vorname, String strasse, int nummer, int postleitzahl, String wohnort) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = new Adresse(strasse, nummer, postleitzahl, wohnort);  // Ein Objekt vom Typ Adresse wird hier erzeugt und initialisiert. Die Variable zeigt auf ein Adresse-Objekt. 
	}
	
	// ----------- Objektmethoden -----------------
	public void print() {
		// adresse ist vom Typ Adresse und besitzt die Objektmethode getAdresse() aus Adresse
		System.out.println(this.vorname + " " + this.name + " wohnt in " + this.getAdresse());
	}
	
	public String getName() {
		return this.name;
	}
	public String getVorname() {
		return this.vorname;
	}
	public Adresse getAdresse() {
		return this.adresse;
	}
	// Rückgabe des Strings aus der Klasse/Datentyp Adresse der Objektmethode getAdresse()
	public String getAdresseString() { 	
		return this.adresse.getAdresse();
	}
	public void umzug(Adresse neueAdresse) {
		this.adresse = neueAdresse;
	}
	public void umzug(String neueStrasse, int neueNummer, int neuePostleitzahl, String neuerWohnort) {  // objekterzeugende Methode
		this.adresse = new Adresse(neueStrasse, neueNummer, neuePostleitzahl, neuerWohnort);
	}
}
