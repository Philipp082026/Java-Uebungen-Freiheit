package uebungen.uebung1;
// Übungen zu "https://freiheit.f4.htw-berlin.de/prog1/uebungen/"
public class Uebung1 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 123;
		long l = 456789;			// l hinter der long-Zahl nur notwendig, wenn die Zahl zu groß für ein int ist
		char c = 'a';
		byte b = 127;
		short s = 32767;
		float f = 4.23f;			// f immer notwendig
		double d = 6.98;
		boolean bool = true;
		String string = "Hallo!";
		
		System.out.println(" --- Aufgabe 3 -------");
		System.out.println("Wert vom Typ int 		:	" + i);
		System.out.println("Wert vom Typ long 		:	" + l);
		System.out.println("Wert vom Typ char		:	" + c);
		System.out.println("Wert vom Typ byte		:	" + b);
		System.out.println("Wert vom Typ short 		:	" + s);
		System.out.println("Wert vom Typ float		:	" + f);
		System.out.println("Wert vom Typ double		:	" + d);
		System.out.println("Wert vom Typ boolean 		:	" + bool);
		System.out.println("Wert vom Typ String 		:	" + string);
		System.out.println();
		
		System.out.println();
        System.out.println(" --- Aufgabe 4 -------");
		i = 2147483647;				// größtmögliche int Zahl (32 bit), bei 2147483648 erscheint eine Fehlermeldung: out of range
		System.out.println("Wert von i 			:	" + i);
		l = 9223372036854775807l;	// größtmögliche long Zahl (64 bit), bei 9223372036854775808l erscheint eine Fehlermeldung: out of range
		System.out.println("Wert von l			:	" + l);
		
		System.out.println();
        System.out.println(" --- Aufgabe 5 -------");
        l = 2147483647;    
        System.out.println("Wert vom Typ long    : " + l );
        l = 2147483648L;       // L notwendig, da 2147483648 kein int  
        System.out.println("Wert vom Typ long    : " + l );
        
        System.out.println();
        System.out.println(" --- Aufgabe 6 -------");
        c = 65;						// c wird hier die Nr. 65 des ASCII-Codes zugewiesen, das ist laut ASCII-Tabelle das große "A"
		System.out.println(c);		
		
		System.out.println();
	    System.out.println(" --- Aufgabe 7 -------");
		System.out.print("answer=");
        System.out.println(42);
	}
}
