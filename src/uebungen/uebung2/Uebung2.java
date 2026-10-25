package uebungen.uebung2;

public class Uebung2 {

	public static void main(String[] args) {
		
		System.out.println();
        System.out.println("-------------------- 3. -------------------------");
        System.out.println();
		
		int a = 17;
		int b = 4;
		int quotient = a/b;
		int rest = a%b;
		
		System.out.println(a + " geteilt durch " + b + " ergibt " + quotient + ". Es bleibt ein Rest von " + rest);
		System.out.println();
		
		System.out.println();
	    System.out.println("-------------------- 4. -------------------------");
	    System.out.println();

		
		System.out.println(a + "/" + b + " = " + quotient);
		System.out.println(a + " mod " + b + " = " + rest);
		System.out.println();
		
		System.out.println();
        System.out.println("-------------------- 6. -------------------------");
        System.out.println();
		
		boolean gerade;
		if (quotient%2 == 0)
			gerade = true;
		else
			gerade = false;
		System.out.println("a/b ist gerade: " + gerade);
		System.out.println();
		
		System.out.println();
        System.out.println("-------------------- 7. -------------------------");
        System.out.println();

		
		int m = 100;
		int n = 3;
		System.out.println("Division von 2 ints (100/3): " + m/n);
		System.out.println("Division von 2 floats (100/3): " + ((float)m/n));
		System.out.println("Division von 2 doubles (100/3): " + ((double)m/n));
		System.out.println();
		
		System.out.println("int    : " + 100/3);        // int
        System.out.println("float  : " + 100.0f/3.0f);  // float
        System.out.println("float  : " + 100f/3f);      // float
        System.out.println("double : " + 100.0/3.0);    // double
        System.out.println("double : " + 100.0/3);      // double
        System.out.println("double : " + 100/3.0);      // double
		
        System.out.println();
        System.out.println("-------------------- 8. -------------------------");
        System.out.println();
        
		boolean gleich;
		if ((a % 10) == (b % 10))
			gleich = true;
		else
			gleich = false;
		System.out.println("Die letzte Ziffer von a und b sind gleich: " + gleich);
		System.out.println();
		
		System.out.println();
	    System.out.println("-------------------- 9. -------------------------");
	    System.out.println();
		
		int anzahlStunden = 34567;
		int anzahlTage = anzahlStunden/24;
		int restStunden = anzahlStunden%anzahlTage;
		System.out.println("In " + anzahlStunden + " Stunden sind " + anzahlTage + " ganze Tage enthalten.");
		System.out.println("Zieht man von den " + anzahlStunden + " Stunden die " + anzahlTage + " Tage ab, bleiben " + restStunden + " Stunden übrig.");
	}
}
