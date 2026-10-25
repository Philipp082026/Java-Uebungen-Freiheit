package klassen.und.objekte.II;

import klassen.und.objekte.I.Adresse;

public class TestklassePerson {

	public static void main(String[] args) {
		
		// Datentyp Adresse aus anderem package importiert
		Adresse adresse1 = new Adresse("Wilhelminenhoferstr.", 75, 12459, "Berlin");
		Adresse adresse2 = new Adresse("Treskowallee", 8, 10318, "Berlin");
		
		Person maria = new Person("Musterfrau", "Maria", adresse1);
		Person max = new Person("Mustermann", "Max", adresse2);
		
		maria.print();
		max.print();
		
		Adresse mariasAdresse = maria.getAdresse();		// getAdresse() von Person
		Adresse maxAdresse = max.getAdresse();			// getAdresse() von Person
		System.out.println();
		
		System.out.println(mariasAdresse.getAdresse());	// getAdresse() von Adresse
		System.out.println(maxAdresse.getAdresse());	// getAdresse() von Adresse
		System.out.println();
		
		// ginge auch
		System.out.println(maria.getAdresse().getAdresse());	// getAdresse() von Person und von Adresse
	    System.out.println(max.getAdresse().getAdresse());   	// getAdresse() von Person und von Adresse
	    System.out.println();
	    
	    System.out.println(maria.getAdresseString());
	    System.out.println(max.getAdresseString());
	    System.out.println();
	    
	    System.out.println("-------------------------- objekterzeugende Methode umzug ----------------------------" + "\n");
	    System.out.println(maria.getAdresseString());
	    maria.umzug(adresse2);
	    System.out.println(maria.getAdresseString());
	    maria.umzug("Rudower Chaussee", 25, 12489, "Berlin"); // objekterzeugende Methode
	    System.out.println(maria.getAdresseString());
	    System.out.println();
	    
	    System.out.println("------------------- Übung 2 - Klasse Zähler ----------------------");
	    Zähler z = new Zähler(0);
	    z.erhöhen().erhöhen().erhöhen().print();  // method chaining
	    
	}
}
