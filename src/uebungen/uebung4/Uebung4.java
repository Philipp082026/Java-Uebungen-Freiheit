package uebungen.uebung4;

public class Uebung4 {
	
	// prüfen, ob Primzahl oder nicht
	public static boolean isPrime(int number) {
		if (number <= 1)    // alle Zahlen kleiner gleich 1 sind keine Primzahlen
			return false;
		int a = 2;			// 2 ist der kleinstmögliche positive Teiler den es gibt -> Beginn zu zählen ab 2.
		while (a < number) {
			if (number % a == 0) {  // Prüfen, ob a Teiler von der zu prüfenden Zahl ist
				return false;		// Sobald es einen Teiler zwischen 1 < a < number gibt, ist die Zahl keine Primzahl mehr -> false
			}
			a++;
		}
		return true;
	}
	// Ausgabe aller Primzahlen bis int maximum
	public static void printPrimenumbers(int maximum) {
		System.out.println("Zahl : " + maximum);
		int count = 1;
		while (count <= maximum) {
			if (isPrime(count))
				System.out.print(count + " ");
			else 
				System.out.print(".");
			count++;
		}
	}
	// Ausgabe des kleinsten Teilers
	public static int getSmallestDivider(int number) {
		if (number < 2)
			return number;
		int count = 2;
		while (count < number) {
			if (number % count == 0)
				return count;
			count++;
		}
		return number;
	}
	// Ausgabe der Primfaktorzerlegungen
	public static String createStringOfPrimeFactorization(int number) {
		if (number < 2)
			return ("Zahl muss größer als 1 sein!");
		int newNumber = number;
		String result = " ";
		while (newNumber > 1) {
			int factors = getSmallestDivider(newNumber);
			newNumber = newNumber/factors;
			result = result + factors + " * ";
		}
		result = result.substring(0, result.length() - 3);
		return (result + " = " + number);
		
		/*String factors = " ";   // ohne Methodenaufruf von getSmallestDivider
		int count = 2;
		while (count <= newNumber) {
			if (newNumber % count == 0) {
				factors = factors + count + " * ";
				newNumber = newNumber/count;
			}
			else 
				count++;	
		}
		factors = factors.substring(0, factors.length() - 3);
		return (factors + " = " + number); */
	}
	// Ausgabe der Quersumme
	public static void crossSum(int number) {
		int help = number;
		String zahl = "0" + help;
		int stellen = zahl.length()-1;
		int quersumme = 0;
		while (stellen > 0) {
			int a = help % 10;
			quersumme = quersumme + a;
			help = help / 10;
			stellen--;
		}
		System.out.println("Die Quersumme von " + number + " ist " + quersumme);
	}
	
	public static void main(String[] args) {
		
		int number = 12345;
		System.out.println(isPrime(number));
		printPrimenumbers(number);
		System.out.println();
		System.out.println(getSmallestDivider(number));
		System.out.println(createStringOfPrimeFactorization(number));
		crossSum(number);
	}
}
