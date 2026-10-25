package klassen.und.objekte.I;

public class Testklasse {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------- Test der Klasse Adresse -------------------------------------------------" + "\n");
		
		Adresse adresse1;					// die Variable adresse1 bekommt den Datentyp Adresse zugewiesen.
		adresse1 = new Adresse("Wilhelminenhofstr.", 75, 12459, "Berlin");			// erstes Objekt erzeugt mittels new und Konstruktor 
		Adresse adresse2 = new Adresse("Treskoallee", 8, 10318, "Berlin");			// zweites Objekt erzeugt 
		
		/*adresse1.strasse = "Wilhelminenhofstr.";
		adresse1.nummer = 75;
		adresse1.postleitzahl = 12459;
		adresse1.wohnort = "Berlin";
		
		adresse2.strasse = "Treskoallee";
		adresse2.nummer = 8;
		adresse2.postleitzahl = 10318;
		adresse2.wohnort = "Berlin"; */ // Nur beim Standardkonstruktor so ausführbar!
		
		System.out.println(adresse1.getAdresse());
		System.out.println(adresse2.getAdresse());
		System.out.println();
		
		System.out.println("Strasse Nr   : " + adresse1.getStrasse() + " " + adresse1.getNummer());
		System.out.println("PLZ Wohnort  : " + adresse1.getPostleitzahl() + " " + adresse1.getWohnort());
		
		System.out.println("Strasse Nr   : " + adresse2.getStrasse() + " " + adresse2.getNummer());
		System.out.println("PLZ Wohnort  : " + adresse2.getPostleitzahl() + " " + adresse2.getWohnort());
		System.out.println();
		
		System.out.println("------------------------------------------------------ Test der Klasse Point -----------------------------------------------------" + "\n");
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 4);
		Point p3 = new Point(4, 6);
		Point p4 = new Point(5, 3);
		
		System.out.println(" p1 : ( " + p1.getX() + ", " + p1.getY() + " )");
        System.out.println(" p2 : ( " + p2.getX() + ", " + p2.getY() + " )");
        System.out.println(" p3 : ( " + p3.getX() + ", " + p3.getY() + " )");   
        System.out.println(" p4 : ( " + p4.getX() + ", " + p4.getY() + " )");
        System.out.println();
        
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        System.out.println();
        
        p1.print();
        p1.translate(4, 3);
        p1.print();
        System.out.println();
        
        p4.print();
        p4.translate(-3, -1);
        p4.print();
        System.out.println();
        
        System.out.println("p1 links von p2 ? " + p1.isLeft(p2));		// p1.x=5 > p2.x=2
        System.out.println("p1 rechts von p2 ? " + p1.isRight(p2));
        System.out.println("p3 ueber p4 ? " + p3.isAbove(p4));          // p3.y=6 > p4.y=2
        System.out.println("p3 unter p4 ? " + p3.isBelow(p4));
        System.out.println();
        
        p1.print();
        p2.print();
        Point p5 = p1.add(p2);
        System.out.print("p1 addiert mit p2 ergibt ein neues Point-Objekt: ");
        p5.print();
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Circle -------------------------------------------" + "\n");
        
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.5);
        Circle c3 = new Circle();		// parameterloser Konstruktor - Einheitskreis
        
        c1.print();
        System.out.println();
        c2.print();
        System.out.println();
        c3.print();
        System.out.println();
        
        System.out.println("c1 groesser als c2 ? " + c1.isBigger(c2));      
        System.out.println("c1 kleiner als c2  ? " + c1.isSmaller(c2));     
        System.out.println("c1 gleich c2       ? " + c1.isEqual(c2));
        System.out.println();

        System.out.println("c2 groesser als c1 ? " + c2.isBigger(c1));      
        System.out.println("c2 kleiner als c1  ? " + c2.isSmaller(c1));     
        System.out.println("c2 gleich c1       ? " + c2.isEqual(c1));
        System.out.println();

        System.out.println("c1 groesser als c1 ? " + c1.isBigger(c1));      
        System.out.println("c1 kleiner als c1  ? " + c1.isSmaller(c1));     
        System.out.println("c1 gleich c1       ? " + c1.isEqual(c1));
        System.out.println();   
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Rechteck -------------------------------------------" + "\n");
        
        Rechteck r1 = new Rechteck(3, 9);
        r1.print();
        System.out.println("Der Umfang ist: " + r1.umfang());
        System.out.println("Der Flaecheninhalt ist: " + r1.flaecheninhalt());
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Kreis -------------------------------------------" + "\n");
        
        Kreis k1 = new Kreis(15);
        Kreis k2 = new Kreis(12);
        k1.print();
        k2.print();
        System.out.println("Kreis k1 ist groesser als k2: " + k1.istGroesserAls(k2));
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Konto -------------------------------------------" + "\n");
        
        Konto konto1 = new Konto(12345678);
        Konto konto2 = new Konto(98765432);
        konto1.print();
        konto2.print();
        
        konto1.einzahlen(4598);
        konto2.einzahlen(741);
        konto1.print();
        konto2.print();
        System.out.println("Abheben erfolgreich: " + konto1.abheben(568));
        System.out.println("Abheben erfolgreich: " + konto2.abheben(751));
        konto1.print();
        konto2.print();
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Bruch -------------------------------------------" + "\n");
        
        Bruch b1 = new Bruch(3, -5);
        Bruch b2 = new Bruch(4, 5);
        System.out.println("Dezimalzahl von b1: " + b1.wert());
        System.out.println("Dezimalzahl von b2: " + b2.wert());
        b1.print();
        b2.print();
        System.out.print("b1 und b2 multipliziert: "); 
        b1.multiplizieren(b2).print();
        System.out.println("b1 und b2 addiert: ");
        b1.addieren(b2).print();
        System.out.println();  
        
        System.out.println("\n" + "---------------------------------------------- Test der Klasse Nachricht ---------------------------------------" + "\n");
        
        Nachricht text = new Nachricht("bla");
        text.print();
        text.print("text");
        text.print(15);
        
	}
}
