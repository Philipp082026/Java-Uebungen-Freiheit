package uebungen.uebung2.a;

public class Uebung2a {
	
	// Aufgabe 2
	public static void printIntDivision(int nr1, int nr2) {
		System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + (nr1/nr2) + ". Es bleibt ein Rest von " + (nr1%nr2));
		System.out.println();
		System.out.println("-----------------------Aufgabe 5---------------------");
		System.out.println("Mit Aufruf der Methoden getQuotient und getRemainder in der Methode printIntDivision");
		System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + getQuotient(nr1,nr2) + ". Es bleibt ein Rest von " + getRemainder(nr1,nr2));
	}
	// Aufgabe 3
	public static int getQuotient(int nr1, int nr2) {
		return(nr1/nr2);
	}
	public static int getRemainder(int nr1, int nr2) {
		return(nr1%nr2);
	}
	// Aufgabe 4 -> ja, sie besitzen einen Wert vom Typ int.
	
	// Aufageb 6
	public static boolean lastDigitsAreEqual(int nr1, int nr2) {
		return ((nr1%10 == nr2%10) || (nr1%10 == -nr2%10)); 
	}
	// Aufgabe 7
	public static boolean isEven(int nr) {
		return (nr%2 == 0); 
	}
	public static boolean isOdd(int nr) {
		return (!(isEven(nr))); 
	}
	// Aufgabe 8
	public static int getDays(int hours) {
		return (hours/24); 
	}
	public static int getRemainingHours(int hours) {
		return (hours%24); 
	}
	
	
	public static void main(String[] args) {
		System.out.println("-----------------------Aufgabe 2---------------------");
		printIntDivision(17,4);
		System.out.println();
		
		System.out.println("-----------------------Aufgabe 3---------------------");
		int nr1 = 17;
		int nr2 = 4;
		System.out.println(nr1 + "/" + nr2 + " = " + getQuotient(nr1,nr2));
		System.out.println(nr1 + " mod " + nr2 + " = " + getRemainder(nr1,nr2));
		System.out.println();
		
		System.out.println("-----------------------Aufgabe 8---------------------");
		int hours = 34567;
		System.out.println("In " + hours + " Stunden sind " + getDays(hours) + " ganze Tage enthalten.");
		System.out.println("Zieht man von den " + hours + " Stunden die " + getDays(hours) + " Tage ab, bleiben " + getRemainingHours(hours) + " Stunden übrig.");
	}
}
